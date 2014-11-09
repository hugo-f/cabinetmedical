package miage.gestioncabinet.coreM;

import java.util.Calendar;

import miage.gestioncabinet.api.Patient;

public class PatientM extends PersonneM implements Patient {

	private Calendar dateNaiss;

	@Override
	public Calendar getDateNaissance() {
		return this.dateNaiss;
	}

	@Override
	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaiss = dateNaissance;
	}

	@Override
	public Integer getAge() {
		//TODO !!!!!!!!!!!!!!!!!!!!!!!!!!!!! ->hugo le plus beau selon moi (sandrine) <3
		return null;
	}

}
