import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class Test {
    static int imbr = 0;
    static List<SymbolTable> tdsList;
    static List<BloodType> typeList;
    static boolean printArbre;
    static boolean isFile;
    static boolean isCorrect;
    static boolean printTDS;
    static int cptIf = 0;
    static String currentClass = "";
    static int cptWhile = 0;
    static int cptString = 0;
    static int cptEg = 0;
    static int cptMain = 0;
    public static void main(String[] args) throws Exception {
        String pathFile = "";
        isFile = false;
        printArbre = false;
        printTDS = false;
        for(int i=0;i<args.length;i++){
            if(args[i].equals("--print-tree") || args[i].equals("-pt")){
                printArbre = true;
            }else if(args[i].equals("--file") || args[i].equals("-f")){
                isFile = true;
                if(i+1<args.length){
                    pathFile = args[i+1];
                }else{
                    System.out.print("Erreur d'argument, il faut préciser le nom du fichier : -f <nom_du_fichier>");
                }
            }else if(args[i].equals("--print-tds") || args[i].equals("-ptds")){
                printTDS = true;
            }
        }
        ANTLRInputStream input = null;
        if(isFile){
            input = new ANTLRInputStream(new FileInputStream(new File(pathFile)));
        }else{
            input = new ANTLRInputStream(System.in);
        }
        

		GrammaireLexer lexer = new GrammaireLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammaireParser parser = new GrammaireParser(tokens);
        GrammaireParser.program_return r = parser.program();
        if(printArbre){
            System.out.println("tree="+((Tree)r.tree).toStringTree());
        }
		

        tdsList = new ArrayList<SymbolTable>(){};
        initTypes();
        isCorrect = true;
        parcours((Tree)r.tree,null);

        for(int i=0;i<typeList.size();i++){
            typeList.get(i).setSize(typeList);
            typeList.get(i).setDeplacementRelatif(typeList);
        }
        for(int i=0;i<tdsList.size();i++){
            tdsList.get(i).setDeplacementRelatif();
        }

        if(printTDS){
            System.out.print("\t\t-----TDS-----\n");
            for(int i=0;i<tdsList.size();i++){
                System.out.println(tdsList.get(i));
                System.out.println("");
            }
            System.out.print("\t\t-----BloodTypes-----\n");
            for(int i=0;i<typeList.size();i++){
                typeList.get(i).printBT();
                System.out.println("");
            }
        }

        if(isCorrect){
            System.out.println("La syntaxe est correcte : on print l'assembleur");
            imbr = 0;
            initSrcFile();
            initPrintString();
            initPrintlnString();
            initPrintInteger();
            initPrintlnInteger();
            initToString();
            for(int i=0;i<((Tree)r.tree).getChildCount();i++){
                if(((Tree)r.tree).getChild(i).getType() == 7){
                    //Main
                    parcoursExecution(((Tree)r.tree).getChild(i),null,"output.src");
                    break;
                }
            }
            int returnImbr = imbr;
            imbr=0;
            for(int i=0;i<((Tree)r.tree).getChildCount();i++){
                if(((Tree)r.tree).getChild(i).getType() != 7){
                    //Class
                    parcoursExecution(((Tree)r.tree).getChild(i),null,"output.src");
                }else{
                    //System.out.println(i);
                    imbr = returnImbr;
                }
            }
            //parcoursExecution((Tree) r.tree,null,"output.src");
            System.out.println("Ecriture terminée : instructions assembleur écrites dans output.src");
        }else{
            System.out.println("Erreur de syntaxe : les instructions assembleur ne sont pas générées");
        }
    }

    public static void parcours (Tree t, SymbolTable st) {
        //System.out.println(t.getType());
        switch(t.getType()){
            case 4 :
                //Affectation
                if(verificationVariableExiste(t.getChild(0),st)){
                    //boolean b = st.getVariable(t.getChild(0).getText()).isInitialised();
                    //st.getVariable(t.getChild(0).getText()).setInitialised(true);
                    if(verificationBonTypeAffect(t,st)){
                        //On fait ce qu'il y a a faire vis a vis de l'affectation
                        //Le print de l'erreur se fait dans verificationBonTypeAffect()
                    } else { 
                        //st.getVariable(t.getChild(0).getText()).setInitialised(true);
                    }
                }else{
                    System.out.println("Erreur ligne " + t.getLine() + " : la variable \"" + t.getChild(0).toString() + "\" n'existe pas.");
                    isCorrect = false;
                }
                break;
            case 7 :
                //Bloc
                if(st == null){
                    //Bloc global
                    cptMain = imbr;
                    SymbolTable table = new SymbolTable(String.valueOf(imbr));
                    for(int i=0;i<typeList.size();i++){
                        table.addType(typeList.get(i));
                    }
                    imbr++;
                    tdsList.add(table);
                    for (int i = 0; i < t.getChildCount(); i++){
                        parcours(t.getChild(i),table);
                    }
                }else{
                    SymbolTable fille = new SymbolTable(String.valueOf(imbr),st);
                    for(int i=0;i<typeList.size();i++){
                        fille.addType(typeList.get(i));
                    }
                    imbr++;
                    tdsList.add(fille);
                    for (int i = 0; i < t.getChildCount(); i++){
                        parcours(t.getChild(i),fille);
                    }
                }
                break;
            case 21 :
                //Declaration dans un bloc (sans initialisation)
                blocDeclaration(t,st);
                break;
            case 22 :
                //Declaration dans un bloc (avec initialisation)
                blocDeclarationInit(t,st);
                break;
            case 36 :
                //While
                String typeWhile = trouverType(t.getChild(0),st);
                if(typeWhile.equals("Integer")){
                    parcours(t.getChild(1),st);
                }else if(typeWhile.equals("ERROR")){
                    //On ne rentre pas dans le while
                }else{
                    System.out.println("Erreur ligne " + t.getLine() + " : la condition d'un while doit être de type Integer, non de type " + typeWhile);
                    isCorrect = false;
                }
                break;
            case 16 :
                //If
                String typeIf = trouverType(t.getChild(0),st);
                if(typeIf != null && typeIf.equals("Integer")){
                    parcours(t.getChild(1),st); //On parcours le then
                    parcours(t.getChild(2),st); //On parcours le else
                }else if(typeIf != null && typeIf.equals("ERROR")){
                    //On ne rentre pas dans le if
                }else{
                    System.out.println("Erreur ligne " + t.getLine() + " : la condition d'un if doit être de type Integer, non de type " + typeIf);
                    isCorrect = false;
                }
                break;
            case 18 :
                //InstExpr
                trouverType(t.getChild(0),st); //Ca permet de mettre à jour les erreurs relatives à cette expression
                break;
            case 8 :
                //Class
                //A implémenter
                String nomClasse = t.getChild(0).getText();
                if(chercherType(nomClasse) == null){
                    /*for(int i=0;i<t.getChildCount();i++){
                        parcours(t.getChild(i),st);
                    }*/
                }else{
                    //La classe existe déjà
                    System.out.println("Erreur ligne " + t.getLine() + " : la classe " + nomClasse + " existe déjà");
                    isCorrect = false;
                    break;
                }
                int i = 1;
                HashMap<String,String> paramList = new HashMap<String,String>();
                List<String> varParamList = new ArrayList<String>(){};
                List<String> finalParam = new ArrayList<String>(){};
                boolean hasSuper = false;
                String sup;
                while(i < t.getChildCount()){
                    if(t.getChild(i).getType() != 14){
                        break;
                    }else{
                        if(t.getChild(i).getChildCount() == 3){
                            if(paramList.containsKey(t.getChild(i).getChild(1).getText())){
                                System.out.println("Erreur ligne " + t.getLine() + " : le paramètre " + t.getChild(i).getChild(1).getText() + " est déjà déclaré dans cette classe");
                                isCorrect = false;
                            }else{
                                paramList.put(t.getChild(i).getChild(1).getText(),t.getChild(i).getChild(2).getText());
                                varParamList.add(t.getChild(i).getChild(1).getText());
                                finalParam.add(t.getChild(i).getChild(2).getText());
                            }
                        }else{
                            if(paramList.containsKey(t.getChild(i).getChild(0).getText())){
                                System.out.println("Erreur ligne " + t.getLine() + " : le paramètre " + t.getChild(i).getChild(1).getText() + " est déjà déclaré dans cette classe");
                                isCorrect = false;
                            }else{
                                paramList.put(t.getChild(i).getChild(0).getText(),t.getChild(i).getChild(1).getText());
                                finalParam.add(t.getChild(i).getChild(1).getText());
                            }
                        }
                        i += 1;
                    }
                }
                sup = "";
                if(t.getChild(i).getType() == 10){
                    sup = t.getChild(i).getText();
                    hasSuper = true;
                }
                BloodType newBt = new BloodType(nomClasse);
                if(hasSuper){
                    BloodType mere = chercherType(sup);
                    if(mere == null){
                        System.out.println("Erreur ligne " + t.getLine() + " : la classe " + sup + " n'existe pas");
                        isCorrect = false;
                    }else{
                        newBt.addSuper(mere);
                    }
                }
                newBt.addConstrList(finalParam);
                SymbolTable stO = new SymbolTable(String.valueOf(imbr));
                imbr++;
                for(HashMap.Entry<String, String> entry : paramList.entrySet()){
                    String cle = entry.getKey();
                    String val = entry.getValue();
                    if(varParamList.contains(cle)){
                        //Attribut
                        newBt.addAttribute(new Attribut(cle,val,false,true));
                    }else{
                        //Si ce n'est pas un attribut : osef
                    }
                }
                //newBt.addAttribute("this",newBt.getNom());
                Variable v = new Variable("this",newBt,"");
                stO.addVariable(v);
                tdsList.add(stO);
                typeList.add(newBt);
                parcoursClasse(t.getChild(i),stO,newBt);
                break;
            default :
                if(t.getChildCount()==0){
                    break;
                }
                for (int k = 0; k < t.getChildCount(); k++) {
                    parcours(t.getChild(k),st);
                }
                break;
        }
    }

    public static void initSrcFile() throws IOException{
        FileWriter myWriter = new FileWriter("output.src");
        myWriter.write("EXIT_EXC EQU 64\n");
        myWriter.write("READ_EXC EQU 65\n");
        myWriter.write("WRITE_EXC EQU 66\n");
        myWriter.write("STACK_ADRS EQU 0x2000\n");
        myWriter.write("LOAD_ADRS EQU 0xD000\n");
        myWriter.write("NIL EQU 0\n\n");
        myWriter.write("SP EQU R15\n");
        myWriter.write("WR EQU R14\n");
        myWriter.write("BP EQU R13\n\n");
        myWriter.write("ASCII_0 EQU 48\n");
        myWriter.write("ASCII_MINUS EQU 45\n");
        myWriter.write("ASCII_NEW_LINE EQU 15\n");
        //NEWLINE contient \n
        myWriter.write("ORG LOAD_ADRS\n");
        myWriter.write("START main_\n");
        myWriter.write("ZERO string \"0\"\n");
        myWriter.write("UN string \"1\"\n");
        myWriter.write("DEUX string \"2\"\n");
        myWriter.write("TROIS string \"3\"\n");
        myWriter.write("QUATRE string \"4\"\n");
        myWriter.write("CINQ string \"5\"\n");
        myWriter.write("SIX string \"6\"\n");
        myWriter.write("SEPT string \"7\"\n");
        myWriter.write("HUIT string \"8\"\n");
        myWriter.write("NEUF string \"9\"\n");
        

        myWriter.close();
    }

    public static void initPrintString() throws IOException{
        //Attention ! Il faut qu'il y ait l'adresse d'une chaine de caractère en paramètre pour que ca marche !
        FileWriter myWriter = new FileWriter("output.src",true);
        myWriter.write("String_print_\tLDQ 0,R1\n");
        myWriter.write("ADQ -2, SP\n");
        myWriter.write("STW BP, (SP)\n");
        myWriter.write("LDW BP, SP\n");
        myWriter.write("SUB SP, R1, SP\n");
        myWriter.write("LDW R0, BP\n"); //On load le paramètre : Bp+2 = chainage dynamique, BP - 4 = paramètre
        myWriter.write("ADQ 4, R0\n");
        myWriter.write("LDW R0, (R0)\n"); //Maintenant R0 pointe sur le paramètre
        myWriter.write("LDW WR, #WRITE_EXC\n");
        myWriter.write("TRP WR\n"); //On utilise la trappe d'écriture

        myWriter.write("LDW SP, BP\n");
        myWriter.write("LDW BP, (SP)\n"); // On remet BP à sa valeur initiale
        myWriter.write("ADQ 2, SP\n");//On revient à l'adresse de retour
        myWriter.write("LDW WR, (SP)\n");
        myWriter.write("JEA (WR)\n");
        myWriter.close();
    }

    public static void initPrintlnString() throws IOException{
        FileWriter myWriter = new FileWriter("output.src",true);
        myWriter.write("String_println_\tLDQ 0,R1\n");
        myWriter.write("ADQ -2, SP\n");
        myWriter.write("STW BP, (SP)\n");
        myWriter.write("LDW BP, SP\n");
        myWriter.write("SUB SP, R1, SP\n");
        myWriter.write("LDW R0, BP\n"); //On load le paramètre : Bp+2 = chainage dynamique, BP - 4 = paramètre
        myWriter.write("ADQ 4, R0\n");
        myWriter.write("LDW R0, (R0)\n"); //Maintenant R0 pointe sur le paramètre
        myWriter.write("LDW WR, #WRITE_EXC\n");
        myWriter.write("TRP WR\n"); //On utilise la trappe d'écriture
        myWriter.write("NEWLINE RSW 6\n");
        myWriter.write("LDQ NEWLINE, R1\n");
        myWriter.write("LDQ ASCII_NEW_LINE, R2\n");
        myWriter.write("STB R2, (R1)+\n"); //On met \n dans le tampon
        myWriter.write("LDQ 10, R2\n");
        myWriter.write("STB R2, (R1)+\n"); //On met \n dans le tampon
        myWriter.write("LDQ 0, R2\n");
        myWriter.write("STB R2, (R1)+\n"); //On met \0 dans le tampon
        myWriter.write("LDQ NEWLINE, R0\n");
        myWriter.write("LDW WR, #WRITE_EXC\n");
        myWriter.write("TRP WR\n"); //On utilise la trappe d'écriture
        myWriter.write("LDW SP, BP\n");
        myWriter.write("LDW BP, (SP)\n"); // On remet BP à sa valeur initiale
        myWriter.write("ADQ 2, SP\n");//On revient à l'adresse de retour
        myWriter.write("LDW WR, (SP)\n");
        myWriter.write("JEA (WR)\n");
        myWriter.close();
    }

    public static void initToString() throws IOException{
        FileWriter myWriter = new FileWriter("output.src",true);
        myWriter.write("Integer_toString_\tLDQ 0,R1\n");
        myWriter.write("ADQ -2, SP\n");
        myWriter.write("STW BP, (SP)\n");
        myWriter.write("LDW BP, SP\n");
        myWriter.write("SUB SP, R1, SP\n");
        myWriter.write("LDW R0, BP\n"); //On load le paramètre : Bp+2 = chainage dynamique, BP - 4 = paramètre
        myWriter.write("ADQ 4, R0\n");
        myWriter.write("LDQ 0,R7\n");
        myWriter.write("LDW R0, (R0)\n"); //Maintenant R0 pointe sur le paramètre
        myWriter.write("LDW R8, (BP)6\n"); //On load le paramètre : Bp+2 = chainage dynamique, BP - 4 = paramètre
        //myWriter.write("ADQ 6, R0\n");
        //myWriter.write("LDQ 0,R7\n");
        //myWriter.write("LDW R8, (R8)\n"); //Maintenant R8 pointe sur l'etiquette de retour
        //myWriter.write("LDW WR, #WRITE_EXC\n"); //On met dans WR la valeur de l'interruption d'écriture
        //myWriter.write("LDW R3, R0\n"); //On va travailler avec R3 : R0 doit contenir la chaine de caractères
        //On calcule le signe
        myWriter.write("TST R0\n");
        myWriter.write("JGE #is_positive_-$-2\n");
        myWriter.write("NEG R0, R0\n"); //Si < 0 -> on stocke -R0 dans R0
        myWriter.write("LDQ ASCII_MINUS, R9\n");
        //myWriter.write("ADQ -2, SP\n");
        //myWriter.write("STW R3, (SP)\n"); //On empile "-"
        myWriter.write("ADQ 1, R7\n");
        myWriter.write("JMP #4\n");
        //Si > 0 -> on ne fait rien
        myWriter.write("is_positive_\tLDQ 0, R9\n");
        //On calcule le reste et on le stocke dans R2
        myWriter.write("LDW R10, #10\n");
        myWriter.write("debut_boucle_tostring_\tLDW R2, R0\n"); //On divise par 10 -> resultat dans R1
        myWriter.write("DIV R2, R10, R1\n"); //On divise par 10, quotient dans R1, reste dans R2
        
        myWriter.write("LDW R0, R1\n"); //On met à jour R0 avec la valeur du quotient
        myWriter.write("LDW R3, R2\n");
        myWriter.write("ADQ ASCII_0, R3\n"); //Code ASCII du chiffre dans R3
        myWriter.write("ADQ -2, SP\n");
        myWriter.write("STW R3, (SP)\n"); //On empile R3
        myWriter.write("ADQ 1, R7\n");
        myWriter.write("LDW R5, #0\n");
        myWriter.write("CMP R0, R5\n"); //Si R0 != 0 -> on continue
        myWriter.write("JNE #debut_boucle_tostring_-$-2\n");

        //Quand on a fini -> les codes ASCII sont empilés -> les mettre dans le tampon
        //On alloue une place de 64 caractères
        //myWriter.write("WORDS RSW 64\n");
        //myWriter.write("LDQ WORDS, R1\n");
        myWriter.write("LDQ 0, R5\n");
        myWriter.write("CMP R9, R5\n");
        myWriter.write("JEQ #copy_loop_-$-2\n");
        myWriter.write("STB R9, (R8)+\n");
        myWriter.write("copy_loop_\tLDW R0, (SP)\n");
        myWriter.write("ADQ 2, SP\n"); //MAJ SP
        myWriter.write("STB R0, (R8)+\n"); //On met le code dans le tampon
        myWriter.write("CMP SP, BP\n");
        myWriter.write("JNE #copy_loop_-$-2\n");
        myWriter.write("no_print_minus\tLDQ 0, R0\n");
        myWriter.write("STB R0, (R8)+\n"); //On met le \0 à la fin
        myWriter.write("LDW R0, BP\n"); //On load le paramètre : Bp+2 = chainage dynamique, BP - 4 = paramètre
        myWriter.write("ADQ 6, R0\n");
        myWriter.write("LDQ 0,R7\n");
        myWriter.write("LDW R0, (R0)\n"); //Maintenant R0 pointe sur le paramètre

        //Unlink
        myWriter.write("LDW BP, (SP)\n"); // On remet BP à sa valeur initiale
        myWriter.write("ADQ 2, SP\n");//On revient à l'adresse de retour
        myWriter.write("LDW WR, (SP)\n");
        myWriter.write("JEA (WR)\n");
        myWriter.close();
    }

    public static void initPrintInteger() throws IOException{
        FileWriter myWriter = new FileWriter("output.src",true);
        myWriter.write("Integer_print_\tLDQ 0,R1\n");
        myWriter.write("ADQ -2, SP\n");
        myWriter.write("STW BP, (SP)\n");
        myWriter.write("LDW BP, SP\n");
        myWriter.write("SUB SP, R1, SP\n");
        myWriter.write("LDW R0, BP\n"); //On load le paramètre : Bp+2 = chainage dynamique, BP - 4 = paramètre
        myWriter.write("ADQ 4, R0\n");
        myWriter.write("LDW R0, (R0)\n"); //Maintenant R3 pointe sur le paramètre
        //Appel à Integer.toString(a)
        String eth = generateStringEtiquette();
        myWriter.write(eth + " RSW 32\n"); //On alloue une zone de 64 mots pour le retour
        myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
        myWriter.write("LDQ "+eth+", R1\n"); //On empile l'etiquette
        myWriter.write("STW R1,(SP)\n");
        myWriter.write("ADQ -2, SP\n");
        myWriter.write("STW R0, (SP)\n"); //On empile R0
        myWriter.write("JSR @Integer_toString_\n"); //On va à Integer.toString(a)
        myWriter.write("ADQ 2, SP\n");// On dépile l'adresse de retour
        myWriter.write("STW R0, (SP)\n"); //On empile R0
        myWriter.write("JSR @String_print_\n"); 







        //Retour : chaine de caractères dans R0
        //myWriter.write("ADQ 4, SP\n");// On dépile le paramètre + adresse de retour

        //myWriter.write("LDW WR, #WRITE_EXC\n"); //On met dans WR la valeur de l'interruption d'écriture
        //myWriter.write("TRP WR\n"); //On print l'entier

        //On sort du print
        myWriter.write("LDW SP, BP\n");
        myWriter.write("LDW BP, (SP)\n"); // On remet BP à sa valeur initiale
        myWriter.write("ADQ 2, SP\n");//On revient à l'adresse de retour
        myWriter.write("LDW WR, (SP)\n");
        myWriter.write("JEA (WR)\n");
        myWriter.close();
    }

    public static void initPrintlnInteger() throws IOException{
        FileWriter myWriter = new FileWriter("output.src",true);
        myWriter.write("Integer_println_\tLDQ 0,R1\n");
        myWriter.write("ADQ -2, SP\n");
        myWriter.write("STW BP, (SP)\n");
        myWriter.write("LDW BP, SP\n");
        myWriter.write("SUB SP, R1, SP\n");
        myWriter.write("LDW R0, BP\n"); //On load le paramètre : Bp+2 = chainage dynamique, BP - 4 = paramètre
        myWriter.write("ADQ 4, R0\n");
        myWriter.write("LDW R0, (R0)\n"); //Maintenant R0 pointe sur le paramètre
        //Appel à Integer.toString(a)
        
        String eth = generateStringEtiquette();
        myWriter.write(eth + " RSW 32\n"); //On alloue une zone de 64 mots pour le retour
        myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
        myWriter.write("LDQ "+eth+", R1\n"); //On empile l'etiquette
        myWriter.write("STW R1,(SP)\n");
        myWriter.write("ADQ -2, SP\n");
        myWriter.write("STW R0, (SP)\n"); //On empile R0
        //myWriter.close();
        myWriter.write("JSR @Integer_toString_\n"); //On va à Integer.toString(a)
        myWriter.write("ADQ -2, SP\n");// On dépile l'adresse de retour
        myWriter.write("STW R0, (SP)\n"); //On empile R0
        myWriter.write("JSR @String_println_\n");

        //Retour : chaine de caractères dans R0
        //myWriter.write("ADQ 4, SP\n");// On dépile le paramètre + adresse de retour

        //myWriter.write("LDW WR, #WRITE_EXC\n"); //On met dans WR la valeur de l'interruption d'écriture
        //myWriter.write("TRP WR\n"); //On print l'entier

        //On sort du print
        myWriter.write("NOP\n");
        myWriter.write("LDW SP, BP\n");
        myWriter.write("LDW BP, (SP)\n"); // On remet BP à sa valeur initiale
        myWriter.write("ADQ 2, SP\n");//On revient à l'adresse de retour
        myWriter.write("LDW WR, (SP)\n");
        myWriter.write("JEA (WR)\n");
        myWriter.close();
    }

    public static void endSrcFile(){

    }

    public static void parcoursExecution(Tree t, SymbolTable st,String filename) throws IOException{
        String fils_gauche = "";
        FileWriter myWriter = new FileWriter("output.src",true);
        //System.out.println(t.getType());
        switch(t.getType()){
            case 6:
                //ATOMID
                //On empile le 1er et on fait les bails (selection ou envoi de message)
                if(t.getChild(0).getType() == 10){
                    //CLASSID
                    //Methode statique (on ne peut pas faire de sélection sur une classe ^^)
                    String nomFunc = t.getChild(1).getChild(0).getText(); //On stocke le nom de la méthode
                    String etiquetteMeth = t.getChild(0).getText() + "_" + nomFunc + "_"; //On génére l'étiquette
                    
                    //On vérifie le retour de la méthode (taille)
                    for(int i=1;i<t.getChildCount();i++){
                        //On parcours les selections/methodes
                        if(t.getChild(i).getType() == 23){
                            //Message
                            BloodType bt = chercherType(t.getChild(0).getText());
                            String reto = bt.searchRetour(nomFunc);
                            if((reto != null) && reto.equals("String")){
                                myWriter = new FileWriter("output.src",true);
                                String eth = generateStringEtiquette();
                                myWriter.write(eth + " RSW 32\n"); //On alloue une zone de 128 mots pour le retour
                                myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                                myWriter.write("LDQ "+eth+", R1\n"); //On empile l'etiquette
                                myWriter.write("STW R1,(SP)\n");
                                myWriter.close();
                            }
                            for(int j=1;j<t.getChild(i).getChildCount();j++){
                                //On parcours les paramètres et on les empile !
                                //System.out.println("\n\n\n" + t.getChild(i).getChild(t.getChild(i).getChildCount()-j).getText() + "\n\n");
                                parcoursExecution(t.getChild(i).getChild(t.getChild(i).getChildCount()-j),st,filename);
                            }
                            myWriter = new FileWriter("output.src",true);
                            //String etiquetteRetour = generateRetourEtiquette(); t.getChild(i).getChild(0).getText();
                            /*myWriter.write("LDW R1, @" + etiquetteRetour + "_\n"); //On charge dans R1 la valeur actuelle de l'instruction + 8 (pour le retour)
                            myWriter.write("ADQ -2, SP\n");//On MAJ le SP
                            myWriter.write("STW R1, (SP)\n");*/
                            //On saute à l'adresse
                            myWriter.write("JSR @" + etiquetteMeth + "\n");
                            myWriter.write("LDW R6, #1\n");
                            myWriter.write("ADQ 2, SP\n");//On dépile le retour
                            for(int j=1;j<t.getChild(i).getChildCount();j++){
                                //On dépile les paramètres
                                myWriter.write("ADQ 2, SP\n");
                            }
                            if(reto != null){
                                myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                                myWriter.write("STW R0, (SP)\n"); //On empile R0
                                /*if(reto.equals("Integer")){
                                    //On empile R0
                                    myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                                    myWriter.write("STW R0, (SP)\n"); //On empile R0
                                }else if(reto.equals("String")){
                                    //myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                                    myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                                    myWriter.write("STW R0, (SP)\n"); //On empile R0
                                }*/
                            }
                            myWriter.close();
                        }else{
                            //Selection

                        }
                    }
                    //On prépare la pile (en écrivant dans chainage dynamique l'adresse acgtuelle + 4 (il faut compter le saut))
                    
                    //On MAJ la pile en dépilant les paramètres

                }else{
                    //ID
                    //TODO
                    parcoursExecution(t.getChild(0),st,"output.src"); //On empile l'adresse de l'objet
                    //myWriter.write("LDW R1, (SP)\n");
                    //myWriter.write("ADQ 2, SP\n"); //On dépile le dernier objet empilé, on le met dans R1
                    //myWriter.write("LDW R1, (R1)\n");
                    //String g = t.getChild(0).getText();
                    //int depg = st.getVariable(g).getDeplacement();
                    String fg = t.getChild(0).getText();
                    myWriter = new FileWriter("output.src",true);
                    BloodType btn = st.getVariable(fg).getBT();
                    for(int i=1;i<t.getChildCount();i++){

                        if(t.getChild(i).getType() == 23){
                            //méthode d'instance
                            myWriter.write("LDW R1, (SP)\n");
                            myWriter.write("ADQ 2, SP\n"); //On dépile le dernier objet empilé, on le met dans R1
                            myWriter.write("STW R1, R8\n"); //On met l'objet dans R8
                            /*if(reto == null){
                                btn = chercherType(t.getChild(i-1).getChild(0).getText());
                            }else{

                            }*/
                            myWriter.close();
                            //String reto = btn.getNom();
                            String instMethEtiqu = btn.getNom() + "_" + t.getChild(i).getChild(0).getText() + "_";
                            String reto = btn.searchRetour(t.getChild(i).getChild(0).getText());

                            for(int j=1;j<t.getChild(i).getChildCount();j++){
                                //On parcours les paramètres et on les empile !
                                //System.out.println("\n\n\n" + t.getChild(i).getChild(t.getChild(i).getChildCount()-j).getText() + "\n\n");
                                parcoursExecution(t.getChild(i).getChild(t.getChild(i).getChildCount()-j),st,filename);
                            }

                            myWriter = new FileWriter("output.src",true);
                            myWriter.write("STW R8, R0\n"); //On remet l'objet dans R0
                            //String etiquetteRetour = generateRetourEtiquette(); t.getChild(i).getChild(0).getText();
                            /*myWriter.write("LDW R1, @" + etiquetteRetour + "_\n"); //On charge dans R1 la valeur actuelle de l'instruction + 8 (pour le retour)
                            myWriter.write("ADQ -2, SP\n");//On MAJ le SP
                            myWriter.write("STW R1, (SP)\n");*/
                            //On saute à l'adresse
                            myWriter.write("JSR @" + instMethEtiqu + "\n");
                            myWriter.write("LDW R6, #1\n");
                            myWriter.write("ADQ 2, SP\n");//On dépile le retour
                            for(int j=1;j<t.getChild(i).getChildCount();j++){
                                myWriter.write("ADQ 2, SP\n"); //On dépile les parametres
                            }
                            if(reto != null){
                                myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                                myWriter.write("STW R0, (SP)\n"); //On empile R0
                            }
                            //Vérifier si retour
                            /*if((reto != null) && reto.equals("String")){
                                myWriter = new FileWriter("output.src",true);
                                String eth = generateStringEtiquette();
                                myWriter.write(eth + " RSW 128\n"); //On alloue une zone de 128 mots pour le retour
                                myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                                myWriter.write("LDQ "+eth+", R1\n"); //On empile l'etiquette
                                myWriter.write("STW R1,(SP)\n");
                                myWriter.close();
                            }*/
                        }else{
                            //Selection
                            Attribut att = btn.getRealAttribute(t.getChild(i).getChild(0).getText());
                            //System.out.println(i + " : " +btn.getNom());
                            int depSel = att.getDeplacement();
                            //System.out.println("dep : " + depSel);
                            myWriter.write("LDW R1, (SP)\n");
                           // myWriter.write("LDW R8, R1\n");
                            
                            //myWriter.write("ADQ -2, SP\n"); //On dépile le dernier objet empilé, on le met dans R1
                            //myWriter.write("LDW R1, (R1)\n");
                            //myWriter.write("ADQ " + String.valueOf(depSel) + ", R1\n");
                            myWriter.write("LDW R1, (R1)" + String.valueOf(depSel) + "\n");
                            myWriter.write("STW R1, (SP)\n"); //On rempile
                            btn = chercherType(att.getType());

                        }
                    }
                    //myWriter.write("LDW R1, (SP)\n");
                    //myWriter.write("ADQ -2, SP\n");
                    //myWriter.write("STW R1, (SP)\n"); //On l'empile
                    myWriter.close();
                }
                break;

            case 17:
                //Instanciation
                
                //WR
                String instfg = t.getChild(0).getText();
                //On empile les paramètres (à l'envers)
                for(int i=1;i<t.getChildCount();i++){
                    parcoursExecution(t.getChild(t.getChildCount()-i),st,filename);
                }
                myWriter = new FileWriter("output.src",true);
                BloodType btInst = chercherType(instfg);
                //On alloue la mémoire de l'objet
                String ethInst = generateStringEtiquette();
                myWriter.write(ethInst + " RSW " + String.valueOf(btInst.getSize()) + "\n"); //On alloue une zone de 128 mots pour le retour
                //myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                myWriter.write("LDQ "+ ethInst +", R0\n"); //On met l'étiquette dans R0
                ethInst = instfg + "_Constructor_";
                myWriter.write("JSR @" + ethInst + "\n");
                myWriter.write("LDW R6, #1\n");
                myWriter.write("ADQ 2, SP\n");//On dépile le retour
                for(int i=1;i<t.getChildCount();i++){
                    //On dépile les paramètres
                    myWriter.write("ADQ 2, SP\n");
                }
                myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                myWriter.write("STW R0, (SP)\n"); //On empile R0 -> l'objet instancié
                myWriter.close();

                break;
            case 7:
                //Bloc
                if(st == null){
                    st = tdsList.get(cptMain);
                    imbr = cptMain + 1;
                    myWriter.write("main_\tLDW SP, #STACK_ADRS\n");
                    myWriter.write("LDQ NIL, BP\n");
                    myWriter.write("LDQ " + st.getSize() + ", R1\n"); //Remplacer 2*2 par par déplacement total symbolTable
                    myWriter.write("ADQ -2, SP\n");
                    myWriter.write("STW BP, (SP)\n");
                    myWriter.write("LDW BP, SP\n");
                    myWriter.write("SUB SP, R1, SP\n");
                    myWriter.close();
                    for(int j=0;j<t.getChildCount();j++){
                        parcoursExecution(t.getChild(j),st,filename);
                    }
                    myWriter = new FileWriter("output.src",true);
                    myWriter.write("LDW SP, BP\n");
                    myWriter.write("LDW BP, (SP)\n");
                    myWriter.write("ADQ 2, SP\n");
                    myWriter.write("TRP #EXIT_EXC\n");
                    myWriter.write("LDW WR, #EXIT_EXC\n");
                    myWriter.write("TRP WR\n");
                    myWriter.close();
                }else{
                    if(filename.equals("noUpdate")){
                        for(int j=0;j<t.getChildCount();j++){
                            parcoursExecution(t.getChild(j),st,"output.src");
                        }
                        return;
                    }
                    st = tdsList.get(imbr);
                    imbr++;
                    //On créé la pile du bloc
                    //Pas de paramètres : -> chainage statique -> chainage dynamique
                    myWriter.write("ADQ -2, SP\n");//On MAJ le SP
                    myWriter.write("STW BP, (SP)\n"); //Chainage dynamique : on met l'ancienne valeur de BP
                    myWriter.write("ADQ -2, SP\n");//On MAJ le SP
                    myWriter.write("STW BP, (SP)\n"); //Chainage statique : on met l'ancienne valeur de BP (dans le cas d'un bloc : statique = dynamique car un bloc fils est forcément appelé par le bloc mère)
                    myWriter.write("LDQ " + st.getSize() + ", R1\n"); //On met la taille de la ST dans R1
                    myWriter.write("LDW BP, SP\n"); //On set BP sur le chainage statique (qui est contenue dans SP ici)
                    myWriter.write("SUB SP, R1, SP\n"); //On réserve la taille nécessaire au bloc
                    myWriter.close();
                    for(int j=0;j<t.getChildCount();j++){
                        parcoursExecution(t.getChild(j),st,filename);
                    }
                    //On dépile le bloc
                    myWriter = new FileWriter("output.src",true);
                    myWriter.write("LDW SP, BP\n"); //On charge dans SP la valeur de BP (vers le chainage statique) : à noter 
                    myWriter.write("LDW BP, (SP)\n"); // On set BP sur l'adresse du chainage dynamique (donc son ancienne valeur)
                    myWriter.write("ADQ 2, SP\n"); //On dépile le chainage statique (SP revient a sa valeur d'avant le bloc)
                    myWriter.close();
                }
                
                break;
            case 21:
                //Declaration sans initialisation
                //A priori rien à faire : on a déjà évalué la taille à alouer à la pile
                break;
            case 20:
                //Integer
                FileWriter myIntegerWriter = new FileWriter("output.src",true);
                myIntegerWriter.write("LDW R1, #" + t.getText() + "\n"); //On met la valeur dans R1
                myIntegerWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                myIntegerWriter.write("STW R1, (SP)\n"); //On empile R1
                myIntegerWriter.close();
                break;
            case 32:
                //STRING
                myWriter = new FileWriter("output.src",true);
                String setiquette = generateStringEtiquette();
                myWriter.write(setiquette + " string " + t.getText() + "\n"); //On reserve la zone et affecte le début à l'étiquette
                myWriter.write("LDW R1, # " + setiquette + "\n");
                myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                myWriter.write("STW R1, (SP)\n"); //On empile R1
                myWriter.close();
                break;
            case 22:
                //Declaration avec initialisation
                FileWriter myWriterInit = new FileWriter("output.src",true);
                String fils_droit = t.getChild(2).getText();
                String fils_gaucheD = t.getChild(0).getText();
                int deplacement = st.getDeplacement(fils_gaucheD);
                int imbrication = st.getVariableImbrication(fils_gaucheD);
                parcoursExecution(t.getChild(2),st,filename);
                myWriterInit.write("LDW R2, BP\n"); //R2 contient l'adresse BP
                if(imbrication != 0){
                    for(int i=0;i<imbrication;i++){
                        myWriterInit.write("LDW R2, (R2)\n"); //On remonte le chainage statique n fois (n étant l'imbrication de la variable)
                    }
                }
                //R2 est set au chainage statique du bloc de la variable
                myWriterInit.write("LDW R1, (SP)\n"); //On dépile
                myWriterInit.write("ADQ 2, SP\n"); // On MAJ le SP
                myWriterInit.write("STW R1, (R2)" + String.valueOf(-deplacement) + "\n");
                myWriterInit.close();
                break;
            case 31 :
                //SignedInteger
                if(t.getChild(0).getText().equals("+")){
                    //Positif
                    parcoursExecution(t.getChild(1),st,filename);
                }else{
                    //Negatif
                    myWriter = new FileWriter("output.src",true);
                    myWriter.write("LDW R1, #" + t.getChild(1).getText() + "\n"); //On met la valeur absolue dans R1
                    myWriter.write("NEG R1, R1\n"); //On inverse le contenu de R1
                    myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                    myWriter.write("STW R1, (SP)\n"); //On empile R1
                    myWriter.close();
                }
                break;
            case 15 :
                //ID
                myWriter = new FileWriter("output.src",true);
                int deplacementID = st.getDeplacement(t.getText());
                int imbricationID = st.getVariableImbrication(t.getText());
                int sizeID = st.getVariableSize(t.getText()); //L'ID peut être issu d'une classe, donc avoir une taille > 2
                myWriter.write("LDW R2, BP\n"); //R2 contient l'adresse BP
                if(imbricationID != 0){
                    for(int i=0;i<imbricationID;i++){
                        myWriter.write("LDW R2, (R2)\n"); //On remonte le chainage statique n fois (n étant l'imbrication de la variable)
                    }
                }
                myWriter.write("LDW R1, (R2)" + -deplacementID + "\n");
                myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                myWriter.write("STW R1, (SP)\n"); //On empile R1
                //R2 est set sur le chainage statique de la variable
                /*while(sizeID != 0){
                    if(deplacementID < 0){
                        myWriter.write("LDW R1, (R2)" + -deplacementID + "\n");
                    }else{
                        myWriter.write("LDW R1, (R2)-" + deplacementID + "\n"); //On load R1 avec la n eme case de (R2)-dep
                    }
                    
                    myWriter.write("ADQ -2, SP\n"); //On MAJ le SP
                    myWriter.write("STW R1, (SP)\n"); //On empile R1
                    deplacementID += 2;
                    sizeID -= 2;
                }*/
                myWriter.close();
                break;
            case 16 :
                //If
                //myWriter = new FileWriter("output.src",true);
                parcoursExecution(t.getChild(0),st,filename); //On empile la valeur de l'expression du IF (que ce soit un ID, une opération, ou un Entier)
                //On print le code qui vérifie l'expression (nulle ou pas)
                myWriter = new FileWriter("output.src",true);
                myWriter.write("LDW R1, (SP)\n"); //On dépile
                myWriter.write("ADQ 2, SP\n"); // On MAJ le SP
                myWriter.write("LDW R2, #0\n"); // on met 1 dans R2
                myWriter.write("CMP R1, R2\n"); //On compare R1 à R2
                String etiquette = generateIfEtiquette();
                myWriter.write("JEQ #" + etiquette + "_-$-2\n"); //Saute à l'adresse etiquette si R1 >= 1
                myWriter.close();
                parcoursExecution(t.getChild(1),st,filename); //On print le code du else
                myWriter = new FileWriter("output.src",true);
                myWriter.write("CMP R0, BP\n");
                myWriter.write("JNE #" + etiquette + "fin_-$-2\n"); //Si on était dans le else (ca n a pas sauté) on saute à l'adresse de fin du IF
                //Le else est terminé, on print un tag de jump pour le IF
                myWriter.write(etiquette + "_" + "\tLDW R6, #1\n");
                myWriter.close();
                parcoursExecution(t.getChild(2),st,filename); //On print le code du then
                myWriter = new FileWriter("output.src",true);
                myWriter.write(etiquette + "fin_\tLDW R6, #1\n"); 
                myWriter.close();
                break;
            case 36:
                //WHILE
                myWriter = new FileWriter("output.src",true);
                String etiquetteWhile = generateWhileEtiquette();
                myWriter.write(etiquetteWhile + "_ LDW R6, #1\n");
                myWriter.close();
                parcoursExecution(t.getChild(0),st,filename); //On évalue la condition du while et on l'empile
                myWriter = new FileWriter("output.src",true);
                myWriter.write("LDW R1, (SP)\n"); //On dépile
                myWriter.write("ADQ 2, SP\n"); // On MAJ le SP
                myWriter.write("LDW R2, #0\n"); // on met 0 dans R2
                myWriter.write("CMP R1, R2\n"); //On compare R1 à R2
                myWriter.write("JEQ #" + etiquetteWhile + "fin_-$-2\n"); //Saute à l'adresse etiquetteWhile si R1 <= 0 (sortie du while)
                myWriter.close();
                parcoursExecution(t.getChild(1),st,filename); //On écrit le code du bloc du while
                myWriter = new FileWriter("output.src",true);
                myWriter.write("CMP R0, BP\n");
                myWriter.write("JNE #" + etiquetteWhile + "_-$-2\n"); //On JUMP au début du while
                myWriter.write(etiquetteWhile + "fin_\tLDW R6, #1\n"); //Etiquette de fin du while
                myWriter.close();
                break;
            case 4:
                //Affectation
                //Attention ! ne pas oublier d'implémenter le cas ou taille != 2 !
                FileWriter myWriterAffect = new FileWriter("output.src",true);
                String fils_droit2 = t.getChild(1).getText();
                if(t.getChild(0).getChildCount() > 1){
                    //ATOMID
                    String fils_gauche2 = t.getChild(0).getChild(0).getText();
                    int deplacement2 = st.getDeplacement(fils_gauche2);
                    int imbrication2 = st.getVariableImbrication(fils_gauche2);
                    //System.out.println(imbrication2);
                    parcoursExecution(t.getChild(1),st,filename);
                    myWriterAffect.write("LDW R2, BP\n"); //R2 contient l'adresse BP
                    if(imbrication2 != 0){
                        for(int i=0;i<imbrication2;i++){
                            //System.out.println("ON remonte");
                            myWriterAffect.write("LDW R2, (R2)\n"); //On remonte le chainage statique n fois (n étant l'imbrication de la variable)
                        }
                    }
                    //myWriterAffect.write("ADQ -" + String.valueOf(deplacement2) + ", R2\n");
                    myWriterAffect.write("LDW R2, (BP)" + String.valueOf(-deplacement2) + "\n");
                    
                    //myWriterAffect.write("LDW R9, R2\n");
                    //System.out.println(deplacement2 + ": " + fils_gauche2);
                    //R2 pointe vers l'ID de l'atomID
                    BloodType btn = st.getVariable(fils_gauche2).getBT();
                    for(int i=1;i<t.getChild(0).getChildCount();i++){
                        //System.out.println(t.getChild(0).getChild(i).getChild(0).getText());
                        Attribut att = btn.getRealAttribute(t.getChild(0).getChild(i).getChild(0).getText());
                        int dep = att.getDeplacement();

                        //myWriterAffect.write("ADQ -" +  + ", R2\n");
                        //myWriterAffect.write("LDW R2, (R2)" + String.valueOf(dep) + "\n");
                        //myWriterAffect.write("LDW R2, (R2)\n");
                        if(i>1){
                            myWriterAffect.write("LWD R2,(R2)\n");
                        }
                        myWriterAffect.write("ADQ " + String.valueOf(dep) + ", R2\n");
                        //myWriterAffect.write("LDW R2, (R2)\n");
                        //myWriter.write("STW (R2)-")
                        btn = chercherType(att.getType());
                    }
                    myWriterAffect.write("LDW R1, (SP)\n"); //On dépile le dernier resultat
                    myWriterAffect.write("ADQ 2, SP\n"); //On met à jour le SP
                    myWriterAffect.write("STW R1, (R2)\n"); //On place la valeur au bon endroit dans la pile
                }else{
                    String fils_gauche2 = t.getChild(0).getText();
                    int deplacement2 = st.getDeplacement(fils_gauche2);
                    int imbrication2 = st.getVariableImbrication(fils_gauche2);
                    parcoursExecution(t.getChild(1),st,filename);
                    myWriterAffect.write("LDW R2, BP\n"); //R2 contient l'adresse BP
                    if(imbrication2 != 0){
                        for(int i=0;i<imbrication2;i++){
                            myWriterAffect.write("LDW R2, (R2)\n"); //On remonte le chainage statique n fois (n étant l'imbrication de la variable)
                        }
                    }
                    //myWriterAffect.write("ADQ -" + String.valueOf(deplacement2) + ", R2\n");
                    //myWriterAffect.write("LDW R2, (R2)-" + String.valueOf(deplacement2) + "\n");
                    myWriterAffect.write("LDW R1, (SP)\n"); //On dépile le dernier resultat
                    myWriterAffect.write("ADQ 2, SP\n"); //On met à jour le SP
                    myWriterAffect.write("STW R1, (R2)" + String.valueOf(-deplacement2) + "\n");
                }
                
                myWriterAffect.close();
                break;
            case 42:
                // +
                FileWriter myWriterPlus = new FileWriter("output.src",true);
                parcoursExecution(t.getChild(0),st,filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                myWriterPlus.write("LDW R1, (SP)\n"); //On dépile le résultat droit dans R1
                myWriterPlus.write("ADQ 2, SP\n"); //MAJ SP
                myWriterPlus.write("LDW R2, (SP)\n"); //On dépile le résultat gauche dans R2
                myWriterPlus.write("ADD R2, R1, R1\n"); //On stock gauche + droit dans R1
                myWriterPlus.write("STW R1, (SP)\n"); //Et on rempile R1 !
                myWriterPlus.close();
                break;
            case 44:
                // -
                FileWriter myWriterMoins = new FileWriter("output.src",true);
                parcoursExecution(t.getChild(0),st,filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                myWriterMoins.write("LDW R1, (SP)\n"); //On dépile le résultat droit dans R1
                myWriterMoins.write("ADQ 2, SP\n"); //MAJ SP
                myWriterMoins.write("LDW R2, (SP)\n"); //On dépile le résultat gauche dans R2
                myWriterMoins.write("SUB R2, R1, R1\n"); //On stock gauche - droit dans R1
                myWriterMoins.write("STW R1, (SP)\n"); //Et on rempile R1 !
                myWriterMoins.close();
                break;
            case 41:
                // *
                FileWriter myWriterFois = new FileWriter("output.src",true);
                parcoursExecution(t.getChild(0),st,filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                myWriterFois.write("LDW R1, (SP)\n"); //On dépile le résultat droit dans R1
                myWriterFois.write("ADQ 2, SP\n"); //MAJ SP
                myWriterFois.write("LDW R2, (SP)\n"); //On dépile le résultat gauche dans R2
                myWriterFois.write("MUL R2, R1, R1\n"); //On stock gauche * droit dans R1
                myWriterFois.write("STW R1, (SP)\n"); //Et on rempile R1 !
                myWriterFois.close();
                break;
            case 46:
                // /
                FileWriter myWriterDiv = new FileWriter("output.src",true);
                parcoursExecution(t.getChild(0),st,filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                myWriterDiv.write("LDW R1, (SP)\n"); //On dépile le résultat droit dans R1
                myWriterDiv.write("ADQ 2, SP\n"); //MAJ SP
                myWriterDiv.write("LDW R2, (SP)\n"); //On dépile le résultat gauche dans R2
                myWriterDiv.write("DIV R2, R1, R1\n"); //On stock gauche / droit dans R1 (division euclidienne)
                myWriterDiv.write("STW R1, (SP)\n"); //Et on rempile R1 !
                myWriterDiv.close();
                break;
            case 24:
                //Methode
                st = tdsList.get(imbr);
                imbr++;
                String etMeth = currentClass + "_" + t.getChild(0).getText() + "_";
                myWriter = new FileWriter("output.src",true);
                myWriter.write(etMeth + "\tLDQ " + st.getSize() + ",R1\n");
                myWriter.write("ADQ -2, SP\n");
                myWriter.write("STW BP, (SP)\n");
                myWriter.write("LDW BP, SP\n");
                myWriter.write("SUB SP, R1, SP\n");
                //Si la méthode est statique : on écrit le this au déplacement 2
                if(t.getChild(1).getType() != 67){
                    //Non static
                    myWriter.write("STW R0, (BP)-2\n"); //WR dans this
                }
                //On prépare la pile
                myWriter.close();
                parcoursExecution(t.getChild(t.getChildCount()-1),st,"noUpdate"); //On parcours le bloc ou l expression
                myWriter = new FileWriter("output.src",true);
                //On vérifie s'il y a une valeur de retour
                String typeRetour = null;
                for(int i=0;i<t.getChildCount();i++){
                    if(t.getChild(i).getType() == 10){
                        //Il y a une valeur de retour
                        typeRetour = t.getChild(i).getText();
                        break;
                    }
                }
                if(typeRetour != null){
                    //Mettre result dans R0
                    //System.out.println(st);
                    deplacementID = st.getDeplacement("result");
                    imbricationID = st.getVariableImbrication("result");
                    sizeID = st.getVariableSize("result"); //L'ID peut être issu d'une classe, donc avoir une taille > 2
                    myWriter.write("LDW R2, BP\n"); //R2 contient l'adresse BP
                    if(imbricationID != 0){
                        for(int i=0;i<imbricationID;i++){
                            myWriter.write("LDW R2, (R2)\n"); //On remonte le chainage statique n fois (n étant l'imbrication de la variable)
                        }
                    }
                    //R2 est set sur le chainage statique de la variable
                    myWriter.write("LDW R0, (R2)-" + deplacementID + "\n"); //On load R0 avec result
                }
                myWriter.write("LDW SP, BP\n");
                myWriter.write("LDW BP, (SP)\n"); // On remet BP à sa valeur initiale
                myWriter.write("ADQ 2, SP\n");//On revient à l'adresse de retour
                myWriter.write("LDW WR, (SP)\n");
                myWriter.write("JEA (WR)\n");
                myWriter.close();
                break;
            case 11:
                //Constructor

                st = tdsList.get(imbr);
                imbr++;
                String etConstr = currentClass + "_Constructor_";
                //System.out.println(etConstr + " CONSTRUCTOR");
                myWriter = new FileWriter("output.src",true);
                myWriter.write(etConstr + "\tLDQ " + st.getSize() + ",R1\n");
                myWriter.write("ADQ -2, SP\n");
                myWriter.write("STW BP, (SP)\n");
                myWriter.write("LDW BP, SP\n");
                myWriter.write("SUB SP, R1, SP\n");
                //On empile this
                myWriter.write("STW R0, (BP)-2\n"); //WR dans this
                myWriter.close();
                parcoursExecution(t.getChild(t.getChildCount()-1),st,"noUpdate");

                myWriter = new FileWriter("output.src",true);
                myWriter.write("LDW SP, BP\n");
                myWriter.write("LDW BP, (SP)\n"); // On remet BP à sa valeur initiale
                myWriter.write("ADQ 2, SP\n");//On revient à l'adresse de retour
                myWriter.write("LDW WR, (SP)\n");
                myWriter.write("JEA (WR)\n");
                myWriter.close();
                break;
            case 8:
                //Class
                currentClass = t.getChild(0).getText();
                st = tdsList.get(imbr);
                imbr++;
                parcoursExecution(t.getChild(t.getChildCount()-1),st,filename); //On parcours le classblock
                break;

           	case 50:
           		//<
           		FileWriter myWriterInf = new FileWriter("output.src",true);
                parcoursExecution(t.getChild(0),st,filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                myWriterInf.write("LDW R2, (SP)\n"); //On dépile le résultat droit dans R2
                myWriterInf.write("ADQ 2, SP\n"); //MAJ SP
                myWriterInf.write("LDW R1, (SP)\n"); //On dépile le résultat gauche dans R1
                myWriterInf.write("CMP R1, R2\n"); //On compare R1 et R2 (R1-R2)
                myWriterInf.write("JLW #10\n"); //On saute les deux instructions suivantes si R1-R2<0 (donc 4 octets + 4 octets + 2 octets car les deux instructions font 4 octets)
                myWriterInf.write("LDW R1, #0\n"); //si c'est faux
                myWriterInf.write("JMP #6\n"); //il faut sauter l'instruction d'après (4 octets + 2 octets)
                myWriterInf.write("LDW R1, #1\n"); //si c'est vrai
                myWriterInf.write("STW R1, (SP)\n"); //Et on rempile R1
                myWriterInf.close();
                break;

            case 51:
           		//<=
           		FileWriter myWriterInfE = new FileWriter("output.src",true);
                parcoursExecution(t.getChild(0),st,filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                myWriterInfE.write("LDW R2, (SP)\n"); //On dépile le résultat droit dans R2
                myWriterInfE.write("ADQ 2, SP\n"); //MAJ SP
                myWriterInfE.write("LDW R1, (SP)\n"); //On dépile le résultat gauche dans R1
                myWriterInfE.write("CMP R1, R2\n"); //On compare R1 et R2 (R1-R2)
                myWriterInfE.write("JLE #10\n"); //On saute les deux instructions suivantes si R1-R2<0 (donc 4 octets + 4 octets + 2 octets car les deux instructions font 4 octets)
                myWriterInfE.write("LDW R1, #0\n"); //si c'est faux
                myWriterInfE.write("JMP #6\n"); //il faut sauter l'instruction d'après (4 octets + 2 octets)
                myWriterInfE.write("LDW R1, #1\n"); //si c'est vrai
                myWriterInfE.write("STW R1, (SP)\n"); //Et on rempile R1
                myWriterInfE.close();
                break;

            case 54:
                //>
                FileWriter myWriterSup = new FileWriter("output.src", true);
                parcoursExecution(t.getChild(0), st, filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                myWriterSup.write("LDW R2, (SP)\n"); //On dépile le résultat droit dans R2
                myWriterSup.write("ADQ 2, SP\n"); //MAJ SP
                myWriterSup.write("LDW R1, (SP)\n"); //On dépile le résultat gauche dans R1
                myWriterSup.write("CMP R2, R1\n"); //On compare R1 et R2 (R2-R1)
                myWriterSup.write("JLW #10\n"); //On saute les deux instructions suivantes si R2-R1<0 (donc 4 octets + 4 octets + 2 octets car les deux instructions font 4 octets)
                myWriterSup.write("LDW R1, #0\n"); //si c'est faux
                myWriterSup.write("JMP #6\n"); //il faut sauter l'instruction d'après (4 octets + 2 octets)
                myWriterSup.write("LDW R1, #1\n"); //si c'est vrai
                myWriterSup.write("STW R1, (SP)\n"); //Et on rempile R1
                myWriterSup.close();
                break;

            case 55:    //FIXME pour les entiers relatifs
                //>=
                FileWriter myWriterSupE = new FileWriter("output.src",true);
                parcoursExecution(t.getChild(0),st,filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                myWriterSupE.write("LDW R2, (SP)\n"); //On dépile le résultat droit dans R2
                myWriterSupE.write("ADQ 2, SP\n"); //MAJ SP
                myWriterSupE.write("LDW R1, (SP)\n"); //On dépile le résultat gauche dans R1
                myWriterSupE.write("CMP R2, R1\n"); //On compare R1 et R2 (R2-R1)
                myWriterSupE.write("JLE #10\n"); //On saute les deux instructions suivantes si R2-R1<0 (donc 4 octets + 4 octets + 2 octets car les deux instructions font 4 octets)
                myWriterSupE.write("LDW R1, #0\n"); //si c'est faux
                myWriterSupE.write("JMP #6\n"); //il faut sauter l'instruction d'après (4 octets + 2 octets)
                myWriterSupE.write("LDW R1, #1\n"); //si c'est vrai
                myWriterSupE.write("STW R1, (SP)\n"); //Et on rempile R1
                myWriterSupE.close();
                break;

            case 53:
                // =
                FileWriter myWriterEq = new FileWriter("output.src", true);
                parcoursExecution(t.getChild(0), st, filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                //System.out.println(trouverType(t.getChild(0),st)+ " : " + t.getChild(0));
                if ((trouverType(t.getChild(0),st).equals("Integer")) && (trouverType(t.getChild(1),st).equals("Integer"))) {
                    //System.out.println("ENTIERS" + t.getChild(0));
                    myWriterEq.write("LDW R2, (SP)\n"); //On dépile le résultat droit dans R2
                    myWriterEq.write("ADQ 2, SP\n"); //MAJ SP
                    myWriterEq.write("LDW R1, (SP)\n"); //On dépile le résultat gauche dans R1
                    myWriterEq.write("CMP R2, R1\n"); //On compare R1 et R2 (R2-R1)
                    myWriterEq.write("JEQ #10\n"); //On saute les deux instructions suivantes si R2-R1 = 0 (donc 4 octets + 4 octets + 2 octets car les deux instructions font 4 octets)
                    myWriterEq.write("LDW R1, #0\n"); //si c'est faux
                    myWriterEq.write("JMP #6\n"); //il faut sauter l'instruction d'après (4 octets + 2 octets)
                    myWriterEq.write("LDW R1, #1\n"); //si c'est vrai
                    myWriterEq.write("STW R1, (SP)\n"); //Et on rempile R1
                    myWriterEq.close();
                } else if ((trouverType(t.getChild(0),st).equals("String")) && (trouverType(t.getChild(1),st).equals("String"))) {
                    //comparer 2 strings
                    myWriterEq.write("LDW R2, (SP)\n"); //On dépile le résultat droit dans R2
                    myWriterEq.write("ADQ 2, SP\n"); //MAJ SP
                    myWriterEq.write("LDW R1, (SP)\n"); //On dépile le résultat gauche dans R1
                    myWriterEq.write("LDQ 0, R3\n"); //R3 sera le compteur
                    myWriterEq.write("comparer_caractere_" + cptEg + "\tLDW R4, (R1)+\n"); //On met le caractere suivant dans R4
                    myWriterEq.write("LDW R5, (R2)+\n"); //On met le caractere suivant dans R5
                    myWriterEq.write("CMP R4, R5\n");
                    myWriterEq.write("JNE #not_equal" + cptEg + "-$-2\n"); //Si != -> jump à not equal
                    myWriterEq.write("LDQ 0, R8\n");
                    myWriterEq.write("CMP R4, R8\n");
                    myWriterEq.write("JNE #comparer_caractere_" + cptEg + "-$-2\n"); //Si caractere != \0 -> boucle
                    myWriterEq.write("LDQ 1, R1\n");
                    myWriterEq.write("STW R1, (SP)\n"); //Et on rempile 1
                    myWriterEq.write("JMP #6\n");
                    myWriterEq.write("not_equal" + cptEg + "\tLDQ 0, R1\n");
                    myWriterEq.write("STW R1, (SP)\n"); //Et on rempile 1
                    cptEg++;
                    myWriterEq.close();
                } else if (trouverType(t.getChild(0),st) == trouverType(t.getChild(1),st)) {
                    //comparer 2 objets
                }
                break;
            case 52:
                // <> equivalent à != 
                FileWriter myWriterNEq = new FileWriter("output.src", true);
                parcoursExecution(t.getChild(0), st, filename); //On parcours le fils gauche -> résultat empilé
                parcoursExecution(t.getChild(1),st,filename); //On parcours le fils droit -> résultat empilé
                //Etat de la pile :  resultat droit || resultat gauche || reste de la Pile
                
                if ((trouverType(t.getChild(0),st).equals("Integer")) && (trouverType(t.getChild(1),st).equals("Integer"))) {
                    //System.out.println("ENTIER : " + t.getChild(0));
                    myWriterNEq.write("LDW R2, (SP)\n"); //On dépile le résultat droit dans R2
                    myWriterNEq.write("ADQ 2, SP\n"); //MAJ SP
                    myWriterNEq.write("LDW R1, (SP)\n"); //On dépile le résultat gauche dans R1
                    myWriterNEq.write("CMP R2, R1\n"); //On compare R1 et R2 (R2-R1)
                    myWriterNEq.write("JNE #10\n"); //On saute les deux instructions suivantes si R2-R1 = 0 (donc 4 octets + 4 octets + 2 octets car les deux instructions font 4 octets)
                    myWriterNEq.write("LDW R1, #0\n"); //si c'est faux
                    myWriterNEq.write("JMP #6\n"); //il faut sauter l'instruction d'après (4 octets + 2 octets)
                    myWriterNEq.write("LDW R1, #1\n"); //si c'est vrai
                    myWriterNEq.write("STW R1, (SP)\n"); //Et on rempile R1
                    myWriterNEq.close();
                } else if ((trouverType(t.getChild(0),st).equals("String")) && (trouverType(t.getChild(1),st).equals("String"))) {
                    //comparer 2 strings
                    myWriterNEq.write("LDW R2, (SP)\n"); //On dépile le résultat droit dans R2
                    myWriterNEq.write("ADQ 2, SP\n"); //MAJ SP
                    myWriterNEq.write("LDW R1, (SP)\n"); //On dépile le résultat gauche dans R1
                    myWriterNEq.write("LDQ 0, R3\n"); //R3 sera le compteur
                    myWriterNEq.write("comparer_caractere_" + cptEg + "\tLDW R4, (R1)+\n"); //On met le caractere suivant dans R4
                    myWriterNEq.write("LDW R5, (R2)+\n"); //On met le caractere suivant dans R5
                    myWriterNEq.write("CMP R4, R5\n");
                    myWriterNEq.write("JNE #not_equal" + cptEg + "-$-2\n"); //Si != -> jump à not equal
                    myWriterNEq.write("LDQ 0, R8\n");
                    myWriterNEq.write("CMP R4, R8\n");
                    myWriterNEq.write("JNE #comparer_caractere_" + cptEg + "-$-2\n"); //Si caractere != \0 -> boucle
                    myWriterNEq.write("LDQ 0, R1\n");
                    myWriterNEq.write("STW R1, (SP)\n"); //Et on rempile 1
                    myWriterNEq.write("JMP #6\n");
                    myWriterNEq.write("not_equal" + cptEg + "\tLDQ 1, R1\n");
                    myWriterNEq.write("STW R1, (SP)\n"); //Et on rempile 1
                    cptEg++;
                    myWriterNEq.close();
                } else {

                    //comparer 2 objets
                    //System.out.println
                }
                break;

            case 34:
                break;

            default :
                for(int j=0;j<t.getChildCount();j++){
                    parcoursExecution(t.getChild(j),st,filename);
                }


                break;
        }
    }

    public static String generateIfEtiquette(){
        String ret = "if" + cptIf;
        cptIf++;
        return(ret);
    }

    public static String generateWhileEtiquette(){
        String ret = "while" + cptWhile;
        cptWhile++;
        return(ret);
    }

    public static String generateStringEtiquette(){
        String ret = "string" + cptString;
        cptString++;
        return(ret);
    }

    public static void parcoursClasse(Tree t, SymbolTable st, BloodType bt){
        switch(t.getType()){
            case 9 :
                //ClassBlock
                int _temp = 0;
                for(int i=1;i<t.getChildCount();i++){
                	//System.out.println("var " + i);
                    if(t.getChild(i).getType() == 24){
                        _temp = i;
                        break;
                    }
                    _temp = i+1;
                    parcoursClasse(t.getChild(i),st,bt);
                }
                parcoursClasse(t.getChild(0),st,bt);
                for(int j=_temp;j<t.getChildCount();j++){
                    if(t.getChildCount() == 1){
                        break;
                    }
                	//System.out.println("meth" + j);
                    parcoursClasse(t.getChild(j),st,bt);
                }
                //On parcours ses enfants : -> const/decl/affect/methodes
                break;
            case 11 :
                //Constructeur
                //System.out.println(st);
                //System.out.println("CONSTRUCTOR");
                String nomConstr = t.getChild(0).getText();
            
                boolean tstSup = false;
                BloodType mere;
                List<String> typeL = new ArrayList<String>(){};
                List<String> paramSuper = new ArrayList<String>(){};
                HashMap<String,String> hm = new HashMap<String,String>();
                SymbolTable stConstr = new SymbolTable(String.valueOf(imbr),st);
                imbr++;
                if(!nomConstr.equals(bt.getNom())){
                    System.out.println("Erreur ligne " + t.getLine() + " : le nom du constructeur (" + nomConstr + ") est différent du nom de la classe (" + bt.getNom() + ")");
                    isCorrect = false;
                }
                int i = 1;
                mere = bt.getSuper();
                if(t.getChild(i).getType() == 10){
                    if(!bt.hasSuper()){
                        System.out.println("Erreur ligne " + t.getLine() + " : la classe " + bt.getNom() + " n'a pas de classe mère");
                        isCorrect = false;
                    }else if(!t.getChild(i).getText().equals(mere.getNom())){
                        System.out.println("Erreur ligne " + t.getLine() + " : la mère de la classe " + bt.getNom() + " est " + mere.getNom() + " et non " + t.getChild(i).getText());
                        isCorrect = false;
                    }else{
                        tstSup = true;
                    }
                    i++;
                }
                while(t.getChild(i).getType() == 14){
                    if(t.getChild(i).getChildCount() == 3){
                        //Attribut
                        if(!bt.hasAttribute(t.getChild(i).getChild(1).getText())){
                            //Erreur : n'était pas déclaré comme var
                            System.out.println("Erreur ligne " + t.getLine() + " : le paramètre " + t.getChild(i).getChild(1).getText() + " n'était pas déclaré comme attribut mais le mot clef var est présent pour le constructeur");
                            isCorrect = false;
                        }
                        BloodType b = chercherType(t.getChild(i).getChild(2).getText());
                        if(b==null){
                            System.out.println("Erreur ligne " + t.getLine() + " : l'objet " + t.getChild(i).getChild(2).getText() + " n'existe pas");
                            isCorrect = false;
                        }else{
                            typeL.add(b.getNom());
                        }
                    }else{
                        BloodType b = chercherType(t.getChild(i).getChild(1).getText());
                        if(bt.hasAttribute(t.getChild(i).getChild(0).getText())){
                            //Erreur : était déclaté comme var
                            System.out.println("Erreur ligne " + t.getLine() + " : la paramètre " + t.getChild(i).getChild(0).getText() + " était déclaré comme attribut mais le mot clef var est absent pour le constructeur");
                            isCorrect = false;
                        }
                        if(b==null){
                            System.out.println("Erreur ligne " + t.getLine() + " : l'objet " + t.getChild(i).getChild(1).getText() + " n'existe pas");
                            isCorrect = false;
                        }else{
                            typeL.add(b.getNom());
                            Variable v = new Variable(t.getChild(i).getChild(0).getText(),b);
                            stConstr.addParam(v);
                        }
                    }
                    i++;
                }
                bt.checkConstructor(typeL,t.getLine());
                while(t.getChild(i).getType() == 13){
                    //Vérifier les types des params à filer au super
                    String typ = trouverType(t.getChild(i),st);
                    paramSuper.add(typ);
                    i++;
                }
                if(tstSup){
                    mere.checkConstructor(paramSuper,t.getChildCount());
                }
                Variable thi = new Variable("this",bt,"ok");
                stConstr.addVariable(thi);
                tdsList.add(stConstr);
                //System.out.println(stConstr);
                parcoursClasse(t.getChild(i),stConstr,bt);//Parcours normal d'un bloc
                break;
            case 7 :
                for(int j=0;j<t.getChildCount();j++){
                    parcours(t.getChild(j),st);
                }
                break;
            case 34 :
                //Declaration variable classe
                String nomVar = t.getChild(0).getText();
                String type = t.getChild(1).getText();
                boolean isStat;
                boolean isCorre = true;
                if(t.getChildCount()==4){
                    isStat = true;
                }else{
                    isStat = false;
                }
                if(bt.hasAttributeInClass(nomVar)){
                    System.out.println("Erreur ligne " + t.getLine() + " : l'attribut " + nomVar + " existe déjà dans la classe " + bt.getNom());
                    isCorre = false;
                    isCorrect = false;
                }
                if(chercherType(type) == null){
                    System.out.println("Erreur ligne " + t.getLine() + " : la classe " + type + " n'existe pas");
                    isCorre = false;
                    isCorrect = false;
                }
                if(isCorre){
                    Attribut a = new Attribut(nomVar,type,isStat,false);
                    bt.addAttribute(a);
                }
                break;
            case 35 :
                //Declaration variable classe + init
                String nomVarInit = t.getChild(0).getText();
                String typeInit = t.getChild(1).getText();
                boolean isStatInit;
                boolean isCorr = true;
                if(t.getChildCount() == 5){
                    isStatInit = true;
                }else{
                    isStatInit = false;
                }
                if(bt.hasAttributeInClass(nomVarInit)){
                    System.out.println("Erreur ligne " + t.getLine() + " : l'attribut " + nomVarInit + " existe déjà dans la classe " + bt.getNom());
                    isCorr = false;
                    isCorrect = false;
                }
                if(chercherType(typeInit) == null){
                    System.out.println("Erreur ligne " + t.getLine() + " : la classe " + typeInit + " n'existe pas");
                    isCorr = false;
                    isCorrect = false;
                }
                String typeAff = trouverType(t.getChild(t.getChildCount() - 1),st);
                if(typeAff.equals("ERROR")){
                    //Erreur gérée par trouverType
                }else if(typeAff.equals(typeInit)){
                    //Tout va bien
                }else{
                    //Pas le bon type
                    System.out.println("Erreur ligne " + t.getLine() + " : vous voulez initialiser un " + typeInit + " avec un " + typeAff);
                    isCorr = false;
                    isCorrect = false;
                }
                if(isCorr){
                    Attribut at = new Attribut(nomVarInit,typeInit,isStatInit,true);
                    bt.addAttribute(at);
                }
                break;
            case 24 :
                //Declaration méthode
                String nomMethode = t.getChild(0).getText();
                int l = 1;
                boolean methodStatic = false;
                boolean methodOverride = false;
                List<String> paramName = new ArrayList<String>(){};
                List<String> paramType = new ArrayList<String>(){};
                boolean isCorrMeth = true;
                boolean hasReturn = false;
                String returnType = null;
                if(t.getChild(l).getText().equals("static")){
                    methodStatic = true;
                    l++;
                }
                if(t.getChild(l).getText().equals("override")){
                    methodOverride = true;
                    l++;
                }
                while(t.getChild(l).getType() == 25){
                    if(!paramName.contains(t.getChild(l).getChild(0).getText())){
                        if(chercherType(t.getChild(l).getChild(1).getText()) != null){
                            paramName.add(t.getChild(l).getChild(0).getText());
                            paramType.add(t.getChild(l).getChild(1).getText());
                        }else{
                            System.out.println("Erreur ligne " + t.getLine() + " : le type " + t.getChild(l).getChild(1).getText() + " du paramètre " + t.getChild(l).getChild(0).getText() + " n'existe pas");
                            isCorrect = false;
                            isCorrMeth = false;
                        }
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : un paramètre " + t.getChild(l).getChild(0).getText() + " a déjà été déclaré");
                        isCorrect = false;
                        isCorrMeth = false;
                    }
                    l++;
                }
                if(t.getChild(l).getType() == 10){
                    returnType = t.getChild(l).getText();
                    if(chercherType(returnType) == null){
                        System.out.println("Erreur ligne " + t.getLine() + " : le type " + returnType + " n'existe pas");
                        isCorrect = false;
                        isCorrMeth = false;
                        returnType = null;
                    }else{
                        hasReturn = true;
                    }
                    l++;
                }
                //Controles
                if(methodOverride){
                    if(bt.hasMethodInMother(nomMethode,paramType,t.getLine()) == 0){
                        //Pas de probleme -> défini dans une des classes meres
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : la méthode " + nomMethode + " n'est pas définie dans la classe mère (si elle existe)");
                        isCorrect = false;
                        isCorrMeth = false;
                    }
                }

                if(isCorrMeth){
                    Fonction f = new Fonction(nomMethode,returnType,paramType,methodStatic,methodOverride);
                    bt.addMethod(f);
                }
                SymbolTable stMeth = new SymbolTable(String.valueOf(imbr),st);
                if(!methodStatic){
                    stMeth.addVariable(new Variable("this",bt,"ok"));
                }
                
                imbr++;
                for(int par=0;par<paramName.size();par++){
                    Variable vMeth = new Variable(paramName.get(par),chercherType(paramType.get(par)),"");
                    stMeth.addParam(vMeth);
                }
                tdsList.add(stMeth);
                if(t.getChild(l).getType() == 7){
                    //Block
                    if(hasReturn){
                        Variable res = new Variable("result",chercherType(returnType));
                        stMeth.addVariable(res);
                    }
                    for(int k=0;k<t.getChild(l).getChildCount();k++){
                        parcours(t.getChild(l).getChild(k),stMeth);
                    }
                    
                }else{
                    //CondExpr
                    String methExpr = trouverType(t.getChild(l),st);
                    if(methExpr.equals(returnType)){
                        //Tout va bien
                    }else if(!methExpr.equals("ERROR")){
                        System.out.println("Erreur ligne " + t.getLine() + " : le type de retour attendu est " + returnType + " mais l'expression est de type " + methExpr);
                        isCorrect = false;
                    }
                }
                break;
            case 4 :
                //Affectation
                parcours(t,st);
                break;
            default :
                break;
        }
    }

    public static void blocDeclarationInit(Tree t,SymbolTable st){
        String nomVar = t.getChild(0).getText();
        String nomType = t.getChild(1).getText();
        String valeur = t.getChild(2).getText();
        boolean tstDecIniType = false;
        int decIniIndexType = -1;
        for(int i=0;i<typeList.size();i++){
            if(typeList.get(i).getNom().equals(nomType.trim())){
                tstDecIniType = true;
                decIniIndexType = i;
                break;
            }
        }
        if(st.variableExistsInThisTable(nomVar)){
            //La variable existe deja
            System.out.println("Erreur ligne " + t.getLine() + " : la variable \"" + nomVar + "\" est déjà déclarée dans ce scope"); //TODO Affiner l'affichage
            isCorrect = false;
        }else{
            if(tstDecIniType){
                String nomTypeDroit = trouverType(t.getChild(2),st);
                if(nomType.equals(nomTypeDroit)){
                    //Si le type à droite correspond au type à gauche
                    Variable v = new Variable(nomVar,typeList.get(decIniIndexType),t.getChild(2).getText());
                    st.addVariable(v);
                }else{
                    if(nomTypeDroit == "ERROR"){
                        //System.out.println("Erreur : la variable " + t.getChild(2).getText() + " n'existe pas");
                        //isCorrect = false;
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : " + t.getChild(0).getText() + " est censé être du type " + t.getChild(1).getText() + " mais la valeur d'initialisation est de type " + nomTypeDroit);
                        isCorrect = false;
                    }   
                }
            }else{
                System.out.println("Erreur ligne " + t.getLine() + " : le type \"" + nomType + "\" n'existe pas.");//TODO : à affiner idem
                isCorrect = false;
            }
        }
    }

    public static void blocDeclaration(Tree t, SymbolTable st){
        String nomVar1 = t.getChild(0).getText();
        assert(t.getChild(0).getChildCount()==0);
        String nomType1 = t.getChild(1).getText();
        boolean tstDecType = false;
        int decIndexType = -1;
        for(int i=0;i<typeList.size();i++){
            if(typeList.get(i).getNom().equals(nomType1)){
                tstDecType = true;
                decIndexType = i;
                break;
            }
        }
        if(st.variableExistsInThisTable(nomVar1)){
            //La variable existe deja au plus bas niveau de ce scope
            System.out.println("Erreur ligne " + t.getLine() + " : la variable \"" + nomVar1 + "\" est déjà déclarée dans ce bloc"); //TODO Affiner l'affichage
            isCorrect = false;
        }else{
            if(tstDecType){
                Variable v1 = new Variable(nomVar1,typeList.get(decIndexType));
                st.addVariable(v1);
            }else{
                System.out.println("Erreur ligne " + t.getLine() + " : le type \"" + nomType1 + "\" n'existe pas.");//TODO : à affiner idem
                isCorrect = false;
            }
        }
    }

    public static String trouverType(Tree t, SymbolTable st){
        if(t.getChildCount() == 0){
            //Soit un entier, soit un String, soit une variable
            if(t.getText().charAt(0) == '"'){
                //C'est un String
                return("String");
            }else if(isInt(t.getText())){
                //C'est un Integer
                return("Integer");
            }else{
                //C'est une variable
                Variable v = st.getVariable(t.getText());
                if(v == null){
                    //La variable n'existe pas
                    System.out.println("Erreur ligne " + t.getLine() + " : la variable " + t.getText() + " n'existe pas");
                    isCorrect = false;
                    return("ERROR");
                }else{
                    //La variable existe
                    /*if (!v.isInitialised()) {
                        System.out.println("Erreur ligne " + t.getLine() + " : la variable " + v.getNom() + " n'est pas initialisé");
                        isCorrect = false;
                        return("ERROR");
                    }*/
                    return(v.getType());
                }
            }
        }else{
            //On est dans une expression ou atomID
            //A implémenter
            switch(t.getType()){
                case 6 :
                    //atomID
                String typeDepart = "";
                    if(t.getChild(0).getType() == 10){
                        //CLASSID
                        typeDepart = t.getChild(0).getText();
                    }else{
                        typeDepart = trouverType(t.getChild(0),st);
                    }
                    String typeCourant;
                    for(int i=1;i<t.getChildCount();i++){
                        BloodType bt = chercherType(typeDepart);
                        if(t.getChild(i).getType() == 23){
                            //Message
                            String ret = verificationMethodeExiste(bt,t.getChild(i),st);
                            if(ret == "ERROR"){
                                //Erreur
                                //Normalement gestion de l'erreur dans verificationMethodeExiste
                                return("ERROR");
                            }else{
                                typeDepart = ret;
                            }
                        }else{
                            //Selection
                            String ret2 = verificationAttributExiste(bt,t.getChild(i),st);
                            if(ret2 == "ERROR"){
                                //Erreur : l'attribut n'existe pas
                                return("ERROR");
                            }else{
                                typeDepart = ret2;
                            }
                        }
                    }
                    return(typeDepart);
                case 31 :
                    //Entier signé
                    return("Integer");
                case 5 :
                    //As
                    if(chercherType(t.getChild(0).getText()) == null){
                        System.out.println("Erreur ligne " + t.getLine() + " : le type " + t.getChild(0).getText() + " n'existe pas");
                        isCorrect = false;
                        return("ERROR");
                    }else{
                        if(coercionIsPossible(t.getChild(0).getText(),t.getChild(1).getText())){
                            return(t.getChild(0).getText());
                        }else{
                            System.out.println("Erreur ligne " + t.getLine() + " : le type " + trouverType(t.getChild(1),st) + " ne peut pas être coercé en " + t.getChild(0).getText());
                            isCorrect = false;
                            return("ERROR");
                        }
                    }
                case 17 :
                    //Instanciation
                    String type = t.getChild(0).getText();
                    List<String> paramList = new ArrayList<String>(){};
                    if(t.getChildCount()>1){
                        for(int i=1;i<t.getChildCount();i++){
                            paramList.add(trouverType(t.getChild(i),st));
                        }
                    }
                    BloodType btInst = chercherType(type);
                    boolean tstConstr = false;
                    if(btInst != null){
                        if(btInst.checkConstructor(paramList,t.getLine())){
                            return(type);
                        }else{
                            return("ERROR");
                        }
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : le type " + type + " n'existe pas");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 42 :
                    // +
                    String gPlus = trouverType(t.getChild(0),st);
                    String dPlus = trouverType(t.getChild(1),st);
                    if(gPlus.equals("Integer") && dPlus.equals("Integer")){
                        return("Integer");
                    }else if(gPlus.equals("ERROR") || dPlus.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : on ne peut additionner que des \"Integer\", or le fils gauche est de type \"" + gPlus + "\" et le fils droit de type \"" + dPlus + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 41 :
                    // *
                    String gFois = trouverType(t.getChild(0),st);
                    String dFois = trouverType(t.getChild(1),st);
                    if(gFois.equals("Integer") && dFois.equals("Integer")){
                        return("Integer");
                    }else if(gFois.equals("ERROR") || dFois.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : on ne peut multiplier que des \"Integer\", or le fils gauche est de type \"" + gFois + "\" et le fils droit de type \"" + dFois + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 44 :
                    // -
                    String gMoins = trouverType(t.getChild(0),st);
                    String dMoins = trouverType(t.getChild(1),st);
                    if(gMoins == null || dMoins == null){
                        return("ERROR");
                    }
                    if(gMoins.equals("Integer") && dMoins.equals("Integer")){
                        return("Integer");
                    }else if(gMoins.equals("ERROR") || dMoins.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : on ne peut soustraire que des \"Integer\", or le fils gauche est de type \"" + gMoins + "\" et le fils droit de type \"" + dMoins + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 46 :
                    // /
                    String gDiv = trouverType(t.getChild(0),st);
                    String dDiv = trouverType(t.getChild(1),st);
                    if(gDiv.equals("Integer") && dDiv.equals("Integer")){
                        return("Integer");
                    }else if(gDiv.equals("ERROR") || dDiv.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : on ne peut diviser que des \"Integer\", or le fils gauche est de type \"" + gDiv + "\" et le fils droit de type \"" + dDiv + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 38 :
                    // &
                    String gConc = trouverType(t.getChild(0),st);
                    String dConc = trouverType(t.getChild(1),st);
                    if(gConc.equals("String") && dConc.equals("String")){
                        return("String");
                    }else if(gConc.equals("ERROR") || dConc.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : on ne peut concatener que des \"String\", or le fils gauche est de type \"" + gConc + "\" et le fils droit de type \"" + dConc + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 50 :
                    // <
                    String gInf = trouverType(t.getChild(0),st);
                    String dInf = trouverType(t.getChild(1),st);
                    if(gInf.equals("Integer") && dInf.equals("Integer")){
                        return("Integer");
                    }else if(gInf.equals("ERROR") || dInf.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : l'opérateur < ne marche que sur des \"Integer\", or le fils gauche est de type \"" + gInf + "\" et le fils droit de type \"" + dInf + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 51 :
                    // <=
                    String gInfEg = trouverType(t.getChild(0),st);
                    String dInfEg = trouverType(t.getChild(1),st);
                    if(gInfEg.equals("Integer") && dInfEg.equals("Integer")){
                        return("Integer");
                    }else if(gInfEg.equals("ERROR") || dInfEg.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : l'opérateur <= ne marche que sur des \"Integer\", or le fils gauche est de type \"" + gInfEg + "\" et le fils droit de type \"" + dInfEg + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 52 :
                    // <>
                    String gDiff = trouverType(t.getChild(0),st);
                    String dDiff = trouverType(t.getChild(1),st);
                    if(gDiff.equals(dDiff)){
                        return("Integer");
                    }else if(gDiff.equals("ERROR") || dDiff.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : l'opérateur <> ne marche que sur deux mêmes types, or le fils gauche est de type \"" + gDiff + "\" et le fils droit de type \"" + dDiff + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 53 :
                    // =
                    String gEg = trouverType(t.getChild(0),st);
                    String dEg = trouverType(t.getChild(1),st);
                    if(gEg.equals(dEg)){
                        return("Integer");
                    }else if(gEg.equals("ERROR") || dEg.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : l'opérateur = ne marche que sur deux mêmes types, or le fils gauche est de type \"" + gEg + "\" et le fils droit de type \"" + dEg + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 54 :
                    // >
                    String gSup = trouverType(t.getChild(0),st);
                    String dSup = trouverType(t.getChild(1),st);
                    if(gSup.equals("Integer") && dSup.equals("Integer")){
                        return("Integer");
                    }else if(gSup.equals("ERROR") || dSup.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : l'opérateur < ne marche que sur des \"Integer\", or le fils gauche est de type \"" + gSup + "\" et le fils droit de type \"" + dSup + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                case 55 :
                    // >=
                    String gSupEg = trouverType(t.getChild(0),st);
                    String dSupEg = trouverType(t.getChild(1),st);
                    if(gSupEg.equals("Integer") && dSupEg.equals("Integer")){
                        return("Integer");
                    }else if(gSupEg.equals("ERROR") || dSupEg.equals("ERROR")){
                        return("ERROR");
                    }else{
                        System.out.println("Erreur ligne " + t.getLine() + " : l'opérateur < ne marche que sur des \"Integer\", or le fils gauche est de type \"" + gSupEg + "\" et le fils droit de type \"" + dSupEg + "\"");
                        isCorrect = false;
                        return("ERROR");
                    }
                default :
                    return("ERROR");
            }
        }
    }

    public static boolean isInt(String val){
        try{
            Integer.parseInt(val);
            return(true);
        }catch(Exception e){
            return(false);
        }
    }

    public static void initTypes(){
        //On créé les deux types primitifs Integer et String
        typeList = new ArrayList<BloodType>(){};
        BloodType bt1 = new BloodType("Integer");
        //System.out.println("Integer : " + bt1.getSize());
        BloodType bt2 = new BloodType("String");
        List<String> printString = new ArrayList<String>(){};
        printString.add("String");
        List<String> printInteger = new ArrayList<String>(){};
        printInteger.add("Integer");
        List<String> toStrings = new ArrayList<String>(){};
        toStrings.add("Integer");
        Fonction toStr = new Fonction("toString","String",toStrings);
        Fonction parseIn = new Fonction("parseInt","Integer",new ArrayList<String>(){});
        List<String> tstL = new ArrayList<String>(){};
        List<String> tstInt = new ArrayList<String>(){};
        tstInt.add("String");
        tstL.add("Integer");
        bt2.addConstrList(tstL);
        bt1.addConstrList(tstInt);
        //Fonction tst = new Fonction("tst","Integer",tstL);
        bt1.addFonction(new Fonction("print",null,printInteger,true,false));
        bt1.addFonction(new Fonction("println",null,printInteger,true,false));
        bt2.addFonction(new Fonction("println",null,printString,true,false));
        bt1.addFonction(toStr);
        bt2.addFonction(new Fonction("print",null,printString,true,false));
        bt2.addFonction(parseIn);
        //bt1.addFonction(tst);
        typeList.add(bt1);
        typeList.add(bt2);
    }

    public static BloodType chercherType(String nom){
        for(int i=0;i<typeList.size();i++){
            if(typeList.get(i).getNom().equals(nom)){
                return(typeList.get(i));
            }
        }
        return(null);
    }

    public static String verificationMethodeExiste(BloodType bt,Tree t,SymbolTable st){
        String nomMethode = t.getChild(0).getText();
        List<String> params = new ArrayList<String>(){};
        if(t.getChildCount()>0){
            for(int i=1;i<t.getChildCount();i++){
                params.add(trouverType(t.getChild(i),st));
            }
        }else{
            params = null;
        }
        int ret = bt.hasMethod(nomMethode,params,t.getLine());
        if(ret==0){
            //La methode existe
            return(bt.searchRetour(nomMethode));
        }else if(ret == 1){
            isCorrect = false;
            System.out.println("Erreur ligne " + t.getLine() + " : la méthode " + nomMethode + " n'a pas été trouvée");
            return("ERROR");
        }else{
            //Autre erreur
            return("ERROR");
        }
    }

    public static String verificationAttributExiste(BloodType bt, Tree t, SymbolTable st){
        if(bt.hasAttribute(t.getChild(0).getText())){
            return(bt.getRealAttribute(t.getChild(0).getText()).getType());
        }else{
            System.out.println("Erreur ligne " + t.getLine() + " : la classe " + bt.getNom() + " ne possède pas l'attribut " + t.getChild(0).getText());
            isCorrect = false;
            return("ERROR");
        }
    }

    public static boolean verificationVariableExiste(Tree t, SymbolTable st){
        //A refaire pour le cas où selection
        if(t.getChildCount()==0){
            String variable = t.getText();
            return(st.variableExists(variable));
        }else{
            if(trouverType(t,st).equals("ERROR")){
                return(false);
            }else{
                return(true);
            }
        }
    }

    public static boolean verificationBonTypeAffect(Tree t, SymbolTable st){
        String typeG = trouverType(t.getChild(0),st);
        String typeD = trouverType(t.getChild(1),st);
        if(typeG == null || typeD == null){
        	return(false);
        }
        boolean ret = typeG.equals(typeD);
        //System.out.println(typeG + " : " + typeD + " : " + ret);
        if(!ret && !typeG.equals("ERROR") && !typeD.equals("ERROR")){
            System.out.println("Erreur ligne " + t.getLine() + " : vous voulez affecter un " + typeD + " à une variable de type " + typeG);
            isCorrect = false;
        }
        return(ret);
    }

    public static boolean coercionIsPossible(String type, String var){
        //A implémenter
        return(true);
    }
}