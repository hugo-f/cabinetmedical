package miage.gestioncabinet.coreM;

import miage.gestioncabinet.api.Personne;

public class PersonneM implements Personne {

	private String nom;
	private String prenom;
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String getPrenom() {
		return prenom;
	}
	
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
