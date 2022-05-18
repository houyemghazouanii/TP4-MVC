package beans;

public class ClientBean {
   private String nom;
   private String prenom;
   private String adresse;
   private int num;
   private String email;
   
   public ClientBean(){
		setNom("");
		setPrenom("");
		setAdresse("");
		setNum(0);
		setEmail("");	
	}

    public String getNom() {
	return nom;
   }

    public void setNom(String nom) {
	this.nom = nom;
    }

     public String getPrenom() {
	return prenom;
    }

    public void setPrenom(String prenom) {
	this.prenom = prenom;
    }

   public String getAdresse() {
	return adresse;
     }

    public void setAdresse(String adresse) {
	this.adresse = adresse;
    }

    public int getNum() {
	return num;
     }

    public void setNum(int num) {
	this.num = num;
     }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
     }

   }

