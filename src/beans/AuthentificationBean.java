package beans;

public class AuthentificationBean {
	private String prenom;
	private String nom;
	
	public AuthentificationBean(){
		 setPrenom(" ");
		 setNom(" ");
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}

