import java.util.List;

public class Fonction{
	private List<String> params;
	private String retour;
	private String nom;
	private boolean isStatic;
	private boolean isOverride;

	public Fonction(String nom, String retour, List<String> params){
		this.nom = nom;
		this.retour = retour;
		this.params = params;
		this.isStatic = false;
		this.isOverride = false;
	}

	public Fonction(String nom, String retour, List<String> params, boolean isStatic, boolean isOverride){
		this.nom = nom;
		this.retour = retour;
		this.params = params;
		this.isStatic = isStatic;
		this.isOverride = isOverride;
	}

	public List<String> getParams(){
		return(this.params);
	}

	public int getNbParam(){
		return(this.params.size());
	}

	public String getNom(){
		return(this.nom);
	}

	public String getRetour(){
		return(this.retour);
	}

	public String toString(){
		return(this.params.toString() + " : " + this.retour + " : " + this.isStatic + " : " + this.isOverride);
	}
}