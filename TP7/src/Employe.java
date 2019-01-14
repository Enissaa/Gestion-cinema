
public abstract class Employe {
	private String nom;
	private String prenom;
	

	public Employe(String nom, String prenom) {
		this.nom=nom;
		this.prenom=prenom;
		
	}
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String toString() {
		return "Nom: "+this.nom+ "Prenom: "+this.prenom;
				
	}
	
	abstract double gains(); 


}