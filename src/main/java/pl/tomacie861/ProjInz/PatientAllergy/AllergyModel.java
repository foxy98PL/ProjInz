package pl.tomacie861.ProjInz.PatientAllergy;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import pl.tomacie861.ProjInz.EmbeddedFolder._PeselEmbeddedAllergy;

@Entity
@Table(name = "projinz.patientallergy")
public class AllergyModel {

    @EmbeddedId
	private _PeselEmbeddedAllergy PatientAllergy;

	public _PeselEmbeddedAllergy getPatientAllergy() {
		return PatientAllergy;
	}

	public void setPatientAllergy(_PeselEmbeddedAllergy patientAllergy) {
		PatientAllergy = patientAllergy;
	}

	public AllergyModel(_PeselEmbeddedAllergy patientAllergy) {
		super();
		PatientAllergy = patientAllergy;
	}

	public AllergyModel() {
		
	}

	@Override
	public String toString() {
		return "AllergyModel [PatientAllergy=" + PatientAllergy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PatientAllergy == null) ? 0 : PatientAllergy.hashCode());
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
		AllergyModel other = (AllergyModel) obj;
		if (PatientAllergy == null) {
			if (other.PatientAllergy != null)
				return false;
		} else if (!PatientAllergy.equals(other.PatientAllergy))
			return false;
		return true;
	}
	
}
