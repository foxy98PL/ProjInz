package pl.tomacie861.ProjInz.PatientAllergy;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;



@Entity
@Table(name = "projinz.patientallergy")
public class AllergyModel {

	@Column(name="pesel")
	private Long pesel;

	@Id
	private String allergy;

	public Long getPesel() {
		return pesel;
	}

	public void setPesel(Long pesel) {
		this.pesel = pesel;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public AllergyModel(Long pesel, String allergy) {
		super();
		this.pesel = pesel;
		this.allergy = allergy;
	}
	
	
	public AllergyModel() {
		
	}

	@Override
	public String toString() {
		return "AllergyModel [pesel=" + pesel + ", allergy=" + allergy + "]";
	}
	
	
	
}
