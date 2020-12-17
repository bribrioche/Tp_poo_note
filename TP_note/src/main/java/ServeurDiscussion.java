import java.util.*;

public class ServeurDiscussion {
	private Map<R�le, List<Utilisateur>> mapping_role_utilisateurs;
	private List<Canal> canaux;
	private String nom;
	private Map<R�le, List<Habilitation>> mapping_role_habilitations;
	
	// getters and setters
	public Map<R�le, List<Utilisateur>> getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}
	public void setMapping_role_utilisateurs(Map<R�le, List<Utilisateur>> mapping_role_utilisateurs) {
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
	}
	public List<Canal> getCanaux() {
		return canaux;
	}
	public void setCanaux(List<Canal> canaux) {
		this.canaux = canaux;
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
	
	
	// constructor
	public void setMapping_role_habilitations(Map<R�le, List<Habilitation>> mapping_role_habilitations) {
		this.mapping_role_habilitations = mapping_role_habilitations;
	}
	public ServeurDiscussion(Map<R�le, List<Utilisateur>> mapping_role_utilisateurs, List<Canal> canaux, String nom,
			Map<R�le, List<Habilitation>> mapping_role_habilitations) {
		super();
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
		this.canaux = canaux;
		this.nom = nom;
		this.mapping_role_habilitations = mapping_role_habilitations;
	}
	
	
}
