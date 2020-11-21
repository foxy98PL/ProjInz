package pl.tomacie861.ProjInz.UserLogger;

public class Response {
	
	String token;
	Long id;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Response(String token, Long id) {
		super();
		this.token = token;
		this.id = id;
	}

	public Response() {
		
	}
	@Override
	public String toString() {
		return "Response [token=" + token + ", id=" + id + ", getToken()=" + getToken() + ", getId()=" + getId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
