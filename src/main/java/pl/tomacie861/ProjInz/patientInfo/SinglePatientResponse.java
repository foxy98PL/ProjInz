package pl.tomacie861.ProjInz.patientInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SinglePatientResponse {

  private Model model;

public Model getModel() {
	return model;
}
@JsonProperty("Patient")
public void setModel(Model model) {
	this.model = model;
}

public SinglePatientResponse(pl.tomacie861.ProjInz.patientInfo.Model model) {
	super();
	this.model = model;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((model == null) ? 0 : model.hashCode());
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
	SinglePatientResponse other = (SinglePatientResponse) obj;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	return true;
}

@Override
public String toString() {
	return "response [model=" + model + "]";
}




}
