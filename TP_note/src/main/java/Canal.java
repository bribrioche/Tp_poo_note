import java.util.*;

public class Canal implements Destinataire, Comparable {
	private Map<R�le, List<Utilisateur>> mapping_role_utilisateurs;
	private int ordre;
	private List<Webhook> webhooks;
	private String nom;
	private Map<R�le, List<Habilitation>> mapping_role_habilitations;
	private List<Message> historiques;
	
	// getters and setters
	public Map<R�le, List<Utilisateur>> getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}
	public void setMapping_role_utilisateurs(Map<R�le, List<Utilisateur>> mapping_role_utilisateurs) {
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
	}
	public int getOrdre() {
		return ordre;
	}
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	public List<Webhook> getWebhooks() {
		return webhooks;
	}
	public void setWebhooks(List<Webhook> webhooks) {
		this.webhooks = webhooks;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Map<R�le, List<Habilitation>> getMapping_role_habilitations() {
		return mapping_role_habilitations;
	}
	public void setMapping_role_habilitations(Map<R�le, List<Habilitation>> mapping_role_habilitations) {
		this.mapping_role_habilitations = mapping_role_habilitations;
	}
	public List<Message> getHistoriques() {
		return historiques;
	}
	public void setHistoriques(List<Message> historiques) {
		this.historiques = historiques;
	}
	
	//constructor
	public Canal(Map<R�le, List<Utilisateur>> mapping_role_utilisateurs, int ordre, List<Webhook> webhooks, String nom,
			Map<R�le, List<Habilitation>> mapping_role_habilitations, List<Message> historiques) {
		super();
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
		this.ordre = ordre;
		this.webhooks = webhooks;
		this.nom = nom;
		this.mapping_role_habilitations = mapping_role_habilitations;
		this.historiques = historiques;
	}
	
	
	public Canal() {
		this.mapping_role_utilisateurs = new HashMap<R�le, List<Utilisateur>>();
		this.mapping_role_habilitations = new HashMap<R�le, List<Habilitation>>();
		//this.historiques.add(new Message());
	}
	
	//methods
	public int compareTo(Canal c) {
		
		return 0;
		//return this.equals(c);
	}
	
	public void ecrireMessage(Utilisateur u, Message m) throws ActionNonAutoriseeException{
		// jeter l'exception si l'utilisateur n'a pas le r�le de l'�criture
		//if(this.getMapping_role_habilitations().containsKey("Membre") == false){
			
		//}else {
		//	throws new ActionNonAutoriseeException();
		//}
		System.out.println(m.getTexte());
		this.getHistoriques().add(m);
	}

	
	

	
}
