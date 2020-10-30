package pl.tomacie861.ProjInz.patientInfo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientsResponse {

	
	
	public List<Model> response;
	
	public PatientsResponse() {
		
	}

	public List<Model> getResponse() {
		return response;
	}
	@JsonProperty("Patients")
	public void setResponse(List<Model> response) {
		this.response = response;
	}

	public PatientsResponse(List<Model> response) {
		super();
		this.response = response;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((response == null) ? 0 : response.hashCode());
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
		PatientsResponse other = (PatientsResponse) obj;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PatientsResponse [response=" + response + "]";
	}
	
	
}
