package pl.tomacie861.ProjInz.EmbeddedFolder;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;
@Embeddable
public class _PeselEmbeddedPatientTreatment  implements Serializable{

	@NotNull
	private String pesel;	
	@NotNull
	private String icddisease;
	@NotNull
	private String icdnbr;
	@NotNull
	private String icdsubtype;
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public String getIcddisease() {
		return icddisease;
	}
	public void setIcddisease(String icddisease) {
		this.icddisease = icddisease;
	}
	public String getIcdnbr() {
		return icdnbr;
	}
	public void setIcdnbr(String icdnbr) {
		this.icdnbr = icdnbr;
	}
	public String getIcdsubType() {
		return icdsubtype;
	}
	public void setIcdsubType(String icdsubType) {
		this.icdsubtype = icdsubType;
	}
	public _PeselEmbeddedPatientTreatment(String pesel, String icddisease, String icdnbr, String icdsubType) {
		super();
		this.pesel = pesel;
		this.icddisease = icddisease;
		this.icdnbr = icdnbr;
		this.icdsubtype = icdsubType;
	}
	
	
	public _PeselEmbeddedPatientTreatment() {
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((icddisease == null) ? 0 : icddisease.hashCode());
		result = prime * result + ((icdnbr == null) ? 0 : icdnbr.hashCode());
		result = prime * result + ((icdsubtype == null) ? 0 : icdsubtype.hashCode());
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
		_PeselEmbeddedPatientTreatment other = (_PeselEmbeddedPatientTreatment) obj;
		if (icddisease == null) {
			if (other.icddisease != null)
				return false;
		} else if (!icddisease.equals(other.icddisease))
			return false;
		if (icdnbr == null) {
			if (other.icdnbr != null)
				return false;
		} else if (!icdnbr.equals(other.icdnbr))
			return false;
		if (icdsubtype == null) {
			if (other.icdsubtype != null)
				return false;
		} else if (!icdsubtype.equals(other.icdsubtype))
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
		return "_PeselEmbeddedPatientTreatment [pesel=" + pesel + ", icddisease=" + icddisease + ", icdnbr=" + icdnbr
				+ ", icdsubType=" + icdsubtype + "]";
	}
	
	
}
