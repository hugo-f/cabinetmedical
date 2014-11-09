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
		
		Calendar today = Calendar.getInstance();
	    int diff = today.get(YEAR) - this.dateNaiss.get(YEAR);
	    if (dateNaiss.get(MONTH) > today.get(MONTH) || 
	        (dateNaiss.get(MONTH) == today.get(MONTH) && dateNaiss.get(DATE) > today.get(DATE))) {
	        diff--;
	    }
	    return diff;
	}

}
