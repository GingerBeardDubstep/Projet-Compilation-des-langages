import java.util.List;
public class Attribut{
	private String nom;
	private String type;
	private boolean isStatic;
	private boolean isInit;
	private int deplacement;

	public Attribut(String nom, String type, boolean isStatic, boolean isInit){
		this.nom = nom;
		this.type = type;
		this.isStatic = isStatic;
		this.isInit = isInit;
		this.deplacement = 0;
	}

	public void setDeplacement(int dp){
		this.deplacement = dp;
	}

	public String getNom(){
		return(this.nom);
	}

	public String getType(){
		return(this.type);
	}

	public int getDeplacement(){
		return(this.deplacement);
	}

	public boolean isStatic(){
		return(this.isStatic);
	}

	public boolean isInit(){
		return(this.isInit);
	}

	public String toString(){
		return(this.type + " : " + this.isStatic + " : " + this.isInit + " : " + this.deplacement);
	}

	public int getSize(List<BloodType> list){
		BloodType bt = null;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNom().equals(this.type)){
				bt = list.get(i);
			}
		}
		if(bt == null){
			return(0);
		}else{
			return(bt.getSize());
		}
	}
}