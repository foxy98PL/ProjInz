package pl.tomacie861.ProjInz.patientTreatment;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;



@Entity
@Table(name = "projinz.patienticd10")
public class TreatModel {
	
	@Id
	private String id;
	
	@Column(name="pesel")		
	private String pesel;	
	@Column(name="icddisease")
	private String icddisease;
	@Column(name="icdnbr")
	private String icdnbr;
	@Column(name="icdsubtype")
	private String icdsubtype;
	@Column(name="docid")
	private Long docid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getIcdsubtype() {
		return icdsubtype;
	}
	public void setIcdsubtype(String icdsubtype) {
		this.icdsubtype = icdsubtype;
	}
	public Long getDocid() {
		return docid;
	}
	public void setDocid(Long docid) {
		this.docid = docid;
	}
	public TreatModel(String id, String pesel, String icddisease, String icdnbr, String icdsubtype, Long docid) {
		super();
		this.id = id;
		this.pesel = pesel;
		this.icddisease = icddisease;
		this.icdnbr = icdnbr;
		this.icdsubtype = icdsubtype;
		this.docid = docid;
	}
	
	public TreatModel() {
		
	}
	@Override
	public String toString() {
		return "TreatModel [id=" + id + ", pesel=" + pesel + ", icddisease=" + icddisease + ", icdnbr=" + icdnbr
				+ ", icdsubtype=" + icdsubtype + ", docid=" + docid + "]";
	}
	
	
	
}
