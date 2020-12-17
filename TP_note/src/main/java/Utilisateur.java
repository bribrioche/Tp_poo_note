import java.util.List;

public class Utilisateur implements Destinataire{
	private List<ServeurDiscussion> serveurs;
	private String prenom;
	private String nom;
	private String login;
	private String motDePasse;
	private String mail;
	
	// getters and setters
	public List<ServeurDiscussion> getServeurs() {
		return serveurs;
	}
	public void setServeurs(List<ServeurDiscussion> serveurs) {
		this.serveurs = serveurs;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Utilisateur(List<ServeurDiscussion> serveurs, String prenom, String nom, String login, String motDePasse,
			String mail) {
		super();
		this.serveurs = serveurs;
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.mail = mail;
	}
	
	public Utilisateur() {
		
	}
	
	
	
}
