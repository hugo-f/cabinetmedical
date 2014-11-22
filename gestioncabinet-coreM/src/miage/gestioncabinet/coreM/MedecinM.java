package miage.gestioncabinet.coreM;

import miage.gestioncabinet.api.Medecin;

public class MedecinM implements Medecin {
	
	private static final long serialVersionUID = -2795187985951315891L;
	private String RPPS;
	private String nom;
	private String prenom;
	private String compte;
	
	

	@Override
	public String getCompte() {
		return this.compte;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
		
	}

	@Override
	public String getPrenom() {
		return this.prenom;
	}

	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}

	@Override
	public String getRPPS() {
		return this.RPPS;
	}
	
	@Override
	public String toString(){
		String str = "NOM ::: " + this.nom + " PRENOM ::: " + this.prenom;
		return str ;
	}

	
}
