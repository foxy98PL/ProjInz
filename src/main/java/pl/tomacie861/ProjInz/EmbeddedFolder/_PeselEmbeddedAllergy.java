package pl.tomacie861.ProjInz.EmbeddedFolder;

import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

import java.io.Serializable;

@Embeddable
public class _PeselEmbeddedAllergy implements Serializable{

	@NotNull
	private Long pesel;

	@NotNull
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

	public _PeselEmbeddedAllergy(Long pesel, String allergy) {
		super();
		this.pesel = pesel;
		this.allergy = allergy;
	}
	
	public _PeselEmbeddedAllergy() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allergy == null) ? 0 : allergy.hashCode());
		result = prime * result + ((pesel == null) ? 0 : pesel.hashCode());
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
		_PeselEmbeddedAllergy other = (_PeselEmbeddedAllergy) obj;
		if (allergy == null) {
			if (other.allergy != null)
				return false;
		} else if (!allergy.equals(other.allergy))
			return false;
		if (pesel == null) {
			if (other.pesel != null)
				return false;
		} else if (!pesel.equals(other.pesel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "_PeselEmbedded [pesel=" + pesel + ", allergy=" + allergy + "]";
	}
	
	
}
