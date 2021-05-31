import java.util.HashMap;


public class SymbolTable{
	private int imbrication;
	private int size;
	private String genre;
	private SymbolTable tableMere;
	private HashMap<String,Variable> variableMap;
	private HashMap<String,BloodType> typeMap;
	private HashMap<String,Variable> paramMap;
	private int cptParam;
	private int cpt;

	/*
		Instanciation sans argument : Création de la 1ere TDS
	*/
	public SymbolTable(String genre){
		this.genre = genre;
		this.imbrication = 0;
		this.tableMere = null;
		this.variableMap = new HashMap<String,Variable>();
		this.typeMap = new HashMap<String,BloodType>();
		this.paramMap = new HashMap<String,Variable>();
		this.size = 0;
		this.cptParam = 0;
		this.cpt = 0;
	}

	/*
		Création des TDS filles
	*/
	public SymbolTable(String genre,SymbolTable mere){
		this.genre = genre;
		this.imbrication = mere.getImbrication() + 1;
		this.tableMere = mere;
		this.variableMap = new HashMap<String,Variable>();
		this.typeMap = new HashMap<String,BloodType>();
		this.paramMap = new HashMap<String,Variable>();
		this.size = 0;
		this.cptParam = -2;
		this.cpt = 0;
	}

	public int getSize(){
		return(this.size);
	}

	public boolean addVariable(Variable v){
		
		if(this.paramMap.containsKey(v.getNom())){
				//v.setDeplacement(cpt);
				this.variableMap.put(v.getNom(),v);
				return(true);
		}
		this.cpt += 2;
		if(this.variableMap.containsKey(v.getNom())){
			return(false);
		}else{
			v.setDeplacement(cpt);
			this.variableMap.put(v.getNom(),v);
			return(true);
		}
	}

	public Variable getVariable(String nom){
		if(this.variableMap.get(nom) == null){
			if(this.imbrication != 0){
				return(this.tableMere.getVariable(nom));
			}else{
				return(null);
			}
		}else{
			return(this.variableMap.get(nom));
		}
	}

	public int getVariableImbrication(String nom){
		if(this.variableMap.get(nom) == null){
			return(this.tableMere.getVariableImbrication(nom) + 1);
		}else{
			return(0);
		}
	}

	public int getDeplacement(String nom){
		if(this.variableMap.get(nom) == null){
			return(this.tableMere.getDeplacement(nom));
		}else{
			Variable v = this.variableMap.get(nom);
			if(v.getNom().equals("this")){
				return(2);
			}
			return(v.getDeplacement());
		}
	}

	public void addParam(Variable v){
		this.cptParam -= 2;
		v.setDeplacement(this.cptParam);
		this.paramMap.put(v.getNom(),v);
		addVariable(v);
	}

	public void setDeplacementRelatif(){
		int cptDep = 0;
		if(this.variableMap.containsKey("this") && this.variableMap.containsKey("result")){
			cptDep = 4;
		}else if(this.variableMap.containsKey("this")){
			cptDep = 2;
		}else if(this.variableMap.containsKey("result")){
			cptDep = 2;
		}
		for(HashMap.Entry<String, Variable> entry : variableMap.entrySet()){
			if(this.paramMap.containsKey(entry.getKey())){
				continue;
			}
			if(entry.getKey().equals("this") || entry.getKey().equals("result")){
				continue;
			}
			cptDep += 2;
			entry.getValue().setDeplacement(cptDep);
    	}
    	this.size = cptDep;
	}

	public int getVariableSize(String nom){
		if(this.variableMap.get(nom) == null){
			return(this.tableMere.getVariableSize(nom));
		}else{
			return(this.variableMap.get(nom).getSize());
		}
	}

	public boolean variableExists(String nom){
		if(this.tableMere != null){
			return(this.variableMap.containsKey(nom) || this.tableMere.variableExists(nom));
		}else{
			return(this.variableMap.containsKey(nom));
		}
	}

	public boolean addType(BloodType bt){
		if(this.typeMap.containsKey(bt.getNom())){
			return(false);
		}else{
			this.typeMap.put(bt.getNom(),bt);
			return(true);
		}
	}

	public BloodType getType(String nom){
		if(this.typeMap.get(nom) == null){
			if(this.imbrication != 0){
				return(this.tableMere.getType(nom));
			}else{
				return(null);
			}
		}else{
			return(this.typeMap.get(nom));
		}
	}

	public boolean typeExists(String nom){
		if(this.tableMere != null){
			return(this.typeMap.containsKey(nom) || this.tableMere.typeExists(nom));
		}else{
			return(this.typeMap.containsKey(nom));
		}
	}

	public String toString(){
		boolean tst = false;
		String buffer = this.genre;
		buffer += ", imbrication : " + this.imbrication + " , size : " + this.size + " , variables : ";
		for(HashMap.Entry<String, Variable> entry : variableMap.entrySet()){
			if(tst){
				buffer += ", (";
			}else{
				tst = true;
				buffer += "(";
			}
    		String key = entry.getKey();
    		Variable value = entry.getValue();
    		buffer += key + " : ";
    		buffer += value.getType() + " : ";
    		buffer += value.getBT().finalSize() + " : ";
    		buffer += value.isInitialised() + " : ";

    		buffer += value.getDeplacement() + ")";
    	}
		return(buffer);
	}

	public int getImbrication(){
		return(this.imbrication);
	}

	public boolean variableExistsInThisTable(String nom){
		return(this.variableMap.containsKey(nom));
	}
}