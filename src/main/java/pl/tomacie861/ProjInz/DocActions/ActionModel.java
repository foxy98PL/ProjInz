package pl.tomacie861.ProjInz.DocActions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projinz.docinfo")
public class ActionModel {

	@Id
	public Long docid;
	
	@Column(name ="docStatus")
	public Long docstatus;
	
	@Column(name = "docFirstName")
	public String docfirstname;
	
	@Column(name = "docSurrName")
	public String docsurrname;

	public Long getDocid() {
		return docid;
	}

	public void setDocid(Long docid) {
		this.docid = docid;
	}

	public Long getDocstatus() {
		return docstatus;
	}

	public void setDocstatus(Long docstatus) {
		this.docstatus = docstatus;
	}

	public String getDocfirstname() {
		return docfirstname;
	}

	public void setDocfirstname(String docfirstname) {
		this.docfirstname = docfirstname;
	}

	public String getDocsurrname() {
		return docsurrname;
	}

	public void setDocsurrname(String docsurrname) {
		this.docsurrname = docsurrname;
	}

	public ActionModel(Long docid, Long docstatus, String docfirstname, String docsurrname) {
		super();
		this.docid = docid;
		this.docstatus = docstatus;
		this.docfirstname = docfirstname;
		this.docsurrname = docsurrname;
	}
	
	public ActionModel() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((docfirstname == null) ? 0 : docfirstname.hashCode());
		result = prime * result + ((docid == null) ? 0 : docid.hashCode());
		result = prime * result + ((docstatus == null) ? 0 : docstatus.hashCode());
		result = prime * result + ((docsurrname == null) ? 0 : docsurrname.hashCode());
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
		ActionModel other = (ActionModel) obj;
		if (docfirstname == null) {
			if (other.docfirstname != null)
				return false;
		} else if (!docfirstname.equals(other.docfirstname))
			return false;
		if (docid == null) {
			if (other.docid != null)
				return false;
		} else if (!docid.equals(other.docid))
			return false;
		if (docstatus == null) {
			if (other.docstatus != null)
				return false;
		} else if (!docstatus.equals(other.docstatus))
			return false;
		if (docsurrname == null) {
			if (other.docsurrname != null)
				return false;
		} else if (!docsurrname.equals(other.docsurrname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ActionModel [docid=" + docid + ", docstatus=" + docstatus + ", docfirstname=" + docfirstname
				+ ", docsurrname=" + docsurrname + "]";
	}
	
}
