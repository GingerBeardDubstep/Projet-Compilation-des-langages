import java.util.List;

public class Variable{
	private String nom;
	private boolean estInitialise;
	private BloodType bt;
	private int deplacement;

	public Variable(String nom,BloodType bt, String initValue){
		this.estInitialise = true;
		this.nom = nom;
		this.bt = bt;
		this.deplacement = 0;
	}

	public Variable(String nom,BloodType bt){
		this.estInitialise = false;
		this.nom = nom;
		this.bt = bt;
		this.deplacement = 0;
	}

	public boolean hasAttribute(String nom){
		return(this.bt.hasAttribute(nom));
	}

	public int hasMethod(String nom, List<String> liste,int nbLigne){
		return(this.bt.hasMethod(nom,liste,nbLigne));
	}

	public String getType(){
		return(this.bt.getNom());
	}

	public void setDeplacement(int dep){
		this.deplacement = dep;
	}

	public BloodType getBT(){
		return(this.bt);
	}

	public String getNom(){
		return(this.nom);
	}

	public boolean isInitialised(){
		return(this.estInitialise);
	}

	public void setInitialised(boolean b){
		this.estInitialise = b;
	}

	public int getSize(){
		return(this.bt.getSize());
	}

	public int getDeplacement(){
		return(this.deplacement);
	}
}
