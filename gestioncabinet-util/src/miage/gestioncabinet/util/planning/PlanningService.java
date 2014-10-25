package miage.gestioncabinet.util.planning;

import java.util.Calendar;

import miage.gestioncabinet.api.Medecin;
import miage.gestioncabinet.api.Utilisateur;

/**
 * 
 * @author Aisata
 * EJB Gestion des RDV , recherche medecins et recherche des patients
 *
 */
public class PlanningService {
	
	private Utilisateur utilisateur ;
	private Calendar dateDebut ; 
	private Calendar datefin ; 
	private Medecin medecin;
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Calendar getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Calendar getDatefin() {
		return datefin;
	}
	public void setDatefin(Calendar datefin) {
		this.datefin = datefin;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	} 
	
	public void listerRdv(){}

}
