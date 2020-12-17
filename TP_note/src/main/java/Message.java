import java.util.List;
import java.util.Map;

public class Message implements Destinataire{
	

	private Utilisateur auteur;
	private Destinataire destinataire;
	private String texte;
	
	public void setTexte(String leTexte) {
		texte = leTexte;
		
	}

	public String getTexte() {
		return texte;
	}

	public Destinataire getDestinataire() {
		return destinataire;
	}

	public Message(Utilisateur auteur, String texte) {
		super();
		this.auteur = auteur;
		this.texte = texte;
	}
	
	
	public Message() {
	}

	public void setDestinataire(Canal c) {
		this.destinataire = c;
	}
	
	

	

	
	
	
}
