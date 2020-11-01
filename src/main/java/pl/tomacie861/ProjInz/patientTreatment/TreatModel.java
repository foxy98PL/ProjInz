package pl.tomacie861.ProjInz.patientTreatment;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import pl.tomacie861.ProjInz.EmbeddedFolder._PeselEmbeddedPatientTreatment;

@Entity
@Table(name = "projinz.patienticd10")
public class TreatModel {
	
	@EmbeddedId
	public _PeselEmbeddedPatientTreatment patientTreat;

	public _PeselEmbeddedPatientTreatment getPatientTreat() {
		return patientTreat;
	}

	public void setPatientTreat(_PeselEmbeddedPatientTreatment patientTreat) {
		this.patientTreat = patientTreat;
	}

	public TreatModel(_PeselEmbeddedPatientTreatment patientTreat) {
		super();
		this.patientTreat = patientTreat;
	}
	
	public TreatModel() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientTreat == null) ? 0 : patientTreat.hashCode());
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
		TreatModel other = (TreatModel) obj;
		if (patientTreat == null) {
			if (other.patientTreat != null)
				return false;
		} else if (!patientTreat.equals(other.patientTreat))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TreatModel [patientTreat=" + patientTreat + "]";
	}
	
	
}
