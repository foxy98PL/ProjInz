package pl.tomacie861.ProjInz.PatientAllergy;

import java.util.List;

public class AllergyResponse {

	List<AllergyModel> response;

	public List<AllergyModel> getResponse() {
		return response;
	}

	public void setResponse(List<AllergyModel> response) {
		this.response = response;
	}

	public AllergyResponse(List<AllergyModel> response) {
		super();
		this.response = response;
	}
	
	public AllergyResponse() {
		
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
		AllergyResponse other = (AllergyResponse) obj;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AllergyResponse [response=" + response + "]";
	}
	
	
}
