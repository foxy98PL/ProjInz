package pl.tomacie861.ProjInz.patientTreatment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projinz.patienticd10")
public class TreatModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String pesel;	
	@Column(name ="icddisease")
	private String icddisease;
	@Column(name ="icdnbr")
	private String icdnbr;
	@Column(name ="icdsubtype")
	private String icdsubType;
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public String getICDdisease() {
		return icddisease;
	}
	public void setICDdisease(String iCDdisease) {
		icddisease = iCDdisease;
	}
	public String getICDnbr() {
		return icdnbr;
	}
	public void setICDnbr(String iCDnbr) {
		icdnbr = iCDnbr;
	}
	public String getICDsubType() {
		return icdsubType;
	}
	public void setICDsubType(String iCDsubType) {
		icdsubType = iCDsubType;
	}
	
	public TreatModel() {
		
	}
	public TreatModel(String pesel, String iCDdisease, String iCDnbr, String iCDsubType) {
		super();
		this.pesel = pesel;
		icddisease = iCDdisease;
		icdnbr = iCDnbr;
		icdsubType = iCDsubType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((icddisease == null) ? 0 : icddisease.hashCode());
		result = prime * result + ((icdnbr == null) ? 0 : icdnbr.hashCode());
		result = prime * result + ((icdsubType == null) ? 0 : icdsubType.hashCode());
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
		TreatModel other = (TreatModel) obj;
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
		if (icdsubType == null) {
			if (other.icdsubType != null)
				return false;
		} else if (!icdsubType.equals(other.icdsubType))
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
		return "TreatModel [pesel=" + pesel + ", ICDdisease=" + icddisease + ", ICDnbr=" + icdnbr + ", ICDsubType="
				+ icdsubType + "]";
	}
	
}
