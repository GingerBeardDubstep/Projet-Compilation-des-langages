import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class BloodType{
	private String nom;
	private HashMap<String,Fonction> mapMethodes;
	private HashMap<String,Attribut> attList;
	private List<String> constrList;
	private BloodType mere;
	private boolean hasMere;
	private int size;

	public BloodType(String nom,HashMap<String,Fonction> mapMethodes, HashMap<String,Attribut> attList, List<String> constrList){
		this.nom = nom;
		this.mapMethodes = mapMethodes;
		this.attList = attList;
		this.constrList = constrList;
		this.hasMere = false;
		this.mere = null;
		this.size = 0; //En attendant de setter la taille
		if(nom.equals("Integer")){
			this.size = 2; //2 octets
		}else if(nom.equals("String")){
			this.size = 2; //A mettre dans le tas
		}else{
			this.size = 0; //En attendant de setter la taille
		}
	}

	public BloodType(String nom,HashMap<String,Fonction> mapMethodes, HashMap<String,Attribut> attList, List<String> constrList, BloodType mere){
		this.nom = nom;
		this.mapMethodes = mapMethodes;
		this.attList = attList;
		this.constrList = constrList;
		this.hasMere = true;
		this.mere = mere;
		this.size = 0; //En attendant de setter la taille
		if(nom.equals("Integer")){
			this.size = 2; //2 octets
		}else if(nom.equals("String")){
			this.size = 2; //A mettre dans le tas
		}else{
			this.size = 0; //En attendant de setter la taille
		}
	}

	public void addConstrList(List<String> list){
		this.constrList = list;
	}

	public boolean hasSuper(){
		return(this.hasMere);
	}

	public BloodType(String nom){ // Type primitif, construction de Int et de String
		this.nom = nom;
		this.mapMethodes = new HashMap<String,Fonction>();
		this.attList = new HashMap<String,Attribut>();
		this.constrList = new ArrayList<String>(){};
		this.mere = null;
		this.hasMere = false;
		if(nom.equals("Integer")){
			this.size = 2; //2 octets
		}else if(nom.equals("String")){
			this.size = 2; //A mettre dans le tas
		}else{
			this.size = 0; //En attendant de setter la taille
		}
	}

	public void printBT(){
		System.out.println("\t\t\t" + this.nom);
		System.out.println("Taille : " + this.size);
		System.out.println("Attributs :");
		for(HashMap.Entry<String, Attribut> entry : attList.entrySet()){
            String cle = entry.getKey();
            Attribut val = entry.getValue();
            System.out.println("\t" + cle + " : " + val.toString());
        }
        System.out.println("Methodes :");
        for(HashMap.Entry<String,Fonction> entr : mapMethodes.entrySet()){
        	System.out.println("\t" + entr.getKey() + " : " + entr.getValue().toString());
        }
	}

	public void setSize(List<BloodType> list){
		if(this.nom.equals("Integer") || this.nom.equals("String")){
			return;
		}
		//System.out.println("Le setSize deconne");
		this.size = 0;
		for(HashMap.Entry<String, Attribut> entry : attList.entrySet()){
			this.size += entry.getValue().getSize(list);
    	}
	}

	public int getSize(){
		return(this.size);
	}

	public String getAttribute(String nom){
		return(this.attList.get(nom).getNom());
	}

	public Attribut getRealAttribute(String nom){
		return(this.attList.get(nom));
	}

	public boolean addAttribute(Attribut a){
		if(this.attList.containsKey(a.getNom())){
			//Attribut déjà déclaré
			return(false);
		}else{
			this.attList.put(a.getNom(),a);
			return(true);
		}
	}

	public boolean addFonction(Fonction f){
		if(this.mapMethodes.containsKey(f.getNom())){
			//Methode déjà déclarée
			return(false);
		}else{
			this.mapMethodes.put(f.getNom(),f);
			return(true);
		}
	}

	public boolean hasAttribute(String nom){
		if(this.hasMere){
			return(this.attList.containsKey(nom) || this.mere.hasAttribute(nom));
		}else{
			return(this.attList.containsKey(nom));
		}		
	}

	public boolean hasAttributeInClass(String nom){
		return(this.attList.containsKey(nom));
	}

	public int hasMethod(String nom, List<String> liste, int nbLigne){
		if(this.mapMethodes.containsKey(nom)){
			//Tests sur les types en argument et leur nombre
			if(liste.size() != this.mapMethodes.get(nom).getNbParam()){
				//Pas le bon nombre de paramètres
				System.out.println("Erreur ligne " + nbLigne + " : la méthode " + nom + " doit avoir comme parametre(s) " + this.mapMethodes.get(nom).getParams().toString() + " mais on a ici " + liste.toString());
				return(2); //Code d'erreur 2
			}else{
				for(int i=0;i<this.mapMethodes.get(nom).getNbParam();i++){
					if(!liste.get(i).equals(this.mapMethodes.get(nom).getParams().get(i))){
						System.out.println("Erreur ligne " + nbLigne + " : la méthode " + nom + " doit avoir comme parametre(s) " + this.mapMethodes.get(nom).getParams().toString() + " mais on a ici " + liste.toString());
						return(3 + i); //On retourne 3 + index du param qui deconne
					}
				}
				return(0); //Test valide
			}
		}else{
			//On recherche dans la classe mere
			if(this.hasMere){
				return(this.mere.hasMethod(nom,liste,nbLigne));
			}else{
				return(1); //Code 1 quand le nom de la méthode n'existe pas
			}
		}
	}

	public int hasMethodInMother(String nom, List<String> liste, int nbLigne){
		if(this.hasMere){
			return(this.mere.hasMethod(nom,liste,nbLigne));
		}else{
			return(1);
		}
	}

	public String getNom(){
		return(this.nom);
	}

	/*public int getSize(){
		int sz = 0;
		if(this.attList == null){
			return(this.size);
		}else{
			for(HashMap.Entry<String, String> entry : attList.entrySet()){
				sz += entry.getValue().getSize();
    		}
    		return(sz);
		}
	}*/

	public int finalSize(){
		return(this.size);
	}

	public boolean addMethod(Fonction f){
		this.mapMethodes.put(f.getNom(),f);
		return(true);
	}

	public void addSuper(BloodType mere){
		this.mere = mere;
		this.hasMere = true;
	}

	public BloodType getSuper(){
		if(this.hasMere){
			return(this.mere);
		}else{
			return(null);
		}
	}

	public String searchRetour(String nom){
		Fonction methode = mapMethodes.get(nom);
		return(methode.getRetour());
	}

	public boolean checkConstructor(List<String> liste, int nbLigne){
		if(liste.size() != this.constrList.size()){
			System.out.println("Erreur ligne " + nbLigne + " : le constructeur de " + this.nom + " doit avoir comme parametre(s) " + this.constrList.toString() + " mais on a ici " + liste.toString());
			return(false);
		}else{
			for(int i=0;i<liste.size();i++){
				if(!liste.get(i).equals(this.constrList.get(i))){
					System.out.println("Erreur ligne " + nbLigne + " : le constructeur de " + this.nom + " doit avoir comme parametre(s) " + this.constrList.toString() + " mais on a ici " + liste.toString());
					return(false);
				}
			}
		}
		return(true);
	}

	public void setDeplacementRelatif(List<BloodType> list){
		if(this.nom.equals("Integer") || this.nom.equals("String")){
			return;
		}
		int cptDep = 0;
		for(HashMap.Entry<String, Attribut> entry : attList.entrySet()){
			cptDep += 2;
			entry.getValue().setDeplacement(cptDep);
    	}
    	this.size = cptDep;
	}
}