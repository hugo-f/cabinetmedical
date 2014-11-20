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
	    int diff = today.get(Calendar.YEAR) - this.dateNaiss.get(Calendar.YEAR);
	    if (dateNaiss.get(Calendar.MONTH) > today.get(Calendar.MONTH) || 
	        (dateNaiss.get(Calendar.MONTH) == today.get(Calendar.MONTH) && dateNaiss.get(Calendar.DATE) > today.get(Calendar.DATE))) {
	        diff--;
	    }
	    return diff;
	}

}
