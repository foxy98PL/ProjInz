package pl.tomacie861.ProjInz.patientTreatment;

import java.util.List;

public class TreatResponse {

	List<TreatModel> PatientTreatment;

	public List<TreatModel> getPatientTreatment() {
		return PatientTreatment;
	}

	public void setPatientTreatment(List<TreatModel> patientTreatment) {
		PatientTreatment = patientTreatment;
	}
	
	public TreatResponse() {
		
	}

	public TreatResponse(List<TreatModel> patientTreatment) {
		super();
		PatientTreatment = patientTreatment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PatientTreatment == null) ? 0 : PatientTreatment.hashCode());
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
		TreatResponse other = (TreatResponse) obj;
		if (PatientTreatment == null) {
			if (other.PatientTreatment != null)
				return false;
		} else if (!PatientTreatment.equals(other.PatientTreatment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TreatResponse [PatientTreatment=" + PatientTreatment + "]";
	}
	
	
}
