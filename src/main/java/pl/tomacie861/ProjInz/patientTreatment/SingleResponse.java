package pl.tomacie861.ProjInz.patientTreatment;

public class SingleResponse {

	
	public TreatModel PatientTreat;

	public TreatModel getPatientTreat() {
		return PatientTreat;
	}

	public void setPatientTreat(TreatModel patientTreat) {
		PatientTreat = patientTreat;
	}
	
	public SingleResponse() {
		
	}

	public SingleResponse(TreatModel patientTreat) {
		super();
		PatientTreat = patientTreat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PatientTreat == null) ? 0 : PatientTreat.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SingleResponse other = (SingleResponse) obj;
		if (PatientTreat == null) {
			if (other.PatientTreat != null)
				return false;
		} else if (!PatientTreat.equals(other.PatientTreat))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SingleResponse [PatientTreat=" + PatientTreat + "]";
	}
	
}
