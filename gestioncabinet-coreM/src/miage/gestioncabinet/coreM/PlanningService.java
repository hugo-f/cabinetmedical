package miage.gestioncabinet.coreM;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.GestionCabinetException;
import miage.gestioncabinet.api.Medecin;
import miage.gestioncabinet.api.Patient;
import miage.gestioncabinet.api.PlanningRemoteService;
import miage.gestioncabinet.api.Utilisateur;

/**
 * 
 * 
 * EJB Gestion des RDV , recherche medecins et recherche des patients
 *
 */
@Remote(PlanningRemoteService.class)
@Stateful
public class PlanningService implements PlanningRemoteService {
	
	private Utilisateur utilisateur ;
	private Calendar dateDebut ; 
	private Calendar dateFin ; 
	private Medecin medecin;
	private Consultation rdvCourant;
	private List<Consultation> listRDV = new ArrayList<Consultation>();
	private List<Patient> listPatient = new ArrayList<Patient>();
	private List<Medecin> listMedecin = new ArrayList<Medecin>();
	
	
	@Override
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}
	
	@Override
	public List<Medecin> rechercherMedecins() throws GestionCabinetException {
		return this.listMedecin;
	}
	
	@Override
	public List<Patient> rechercherPatients(String nom, String prenom,
			Calendar dateNaissance) throws GestionCabinetException {
		return this.listPatient;
	}
	
	@Override
	public Calendar getDateDebut() {
		if(this.dateDebut == null){
			this.dateDebut = Calendar.getInstance();
		}
		return this.dateDebut;
	}
	
	@Override
	public void setDateDebut(Calendar date) {
		this.dateDebut = date;
		
	}
	
	@Override
	public Calendar getDateFin() {
		if(this.dateFin == null){
			this.dateFin = Calendar.getInstance();
		}
		return this.dateFin;
	}
	
	@Override
	public void setDateFin(Calendar date) {
		this.dateFin = date;		
	}
	
	@Override
	public Medecin getMedecin() {
		if(this.medecin == null){
			this.medecin = new MedecinM();
		}
		return this.medecin;
	}
	@Override
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;		
	}
	@Override
	public List<Consultation> listerRdv() {
		return this.listRDV;
	}
	@Override
	public Consultation getRdvCourant() {
		return this.rdvCourant;
	}
	@Override
	public void setRdvCourant(Consultation rdv) {
		this.rdvCourant = rdv;
	}
	
	@Override
	public Consultation creerRdv(Calendar date) {
		Consultation consultation = new ConsultationM();
		consultation.setDebut(date);
		
		Calendar fin = (Calendar)date.clone();
		fin.add(Calendar.MINUTE, 15);
		consultation.setFin(fin);
		
		return consultation;
	}
	@Override
	public Consultation enregistrerRdv() throws GestionCabinetException {
		this.listerRdv().add(this.getRdvCourant());
		return this.getRdvCourant();
	}
	@Override
	public void supprimerRdv() throws GestionCabinetException {
		this.listerRdv().remove(this.getRdvCourant());
	}
	
	

}
