package pl.tomacie861.ProjInz.UserLogger;

public class Response {
	
	String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Response(String token) {
		super();
		this.token = token;
	}
	public Response() {
		
	}

	@Override
	public String toString() {
		return "response [token=" + token + "]";
	}
	
}
