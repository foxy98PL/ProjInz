package pl.tomacie861.ProjInz.DocActions;

public class response {

	String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public response(String status) {
		super();
		this.status = status;
	}
	
	public response() {
		
	}

	@Override
	public String toString() {
		return "response [status=" + status + "]";
	}
	
}
