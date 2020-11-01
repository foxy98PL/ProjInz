package pl.tomacie861.ProjInz.patientInfo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import pl.tomacie861.ProjInz.EmbeddedFolder._PeselEmbeddedPatientInfo;

@Entity
@Table(name = "projinz.basicinformation")
public class Model {

	@EmbeddedId
	@JsonProperty("PatientInfo")
	_PeselEmbeddedPatientInfo patientinfo;

	public _PeselEmbeddedPatientInfo getPatientinfo() {
		return patientinfo;
	}

	public void setPatientinfo(_PeselEmbeddedPatientInfo patientinfo) {
		this.patientinfo = patientinfo;
	}

	public Model(_PeselEmbeddedPatientInfo patientinfo) {
		super();
		this.patientinfo = patientinfo;
	}
	
	public Model() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientinfo == null) ? 0 : patientinfo.hashCode());
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
		Model other = (Model) obj;
		if (patientinfo == null) {
			if (other.patientinfo != null)
				return false;
		} else if (!patientinfo.equals(other.patientinfo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Model [patientinfo=" + patientinfo + "]";
	}
	
	
	

}
