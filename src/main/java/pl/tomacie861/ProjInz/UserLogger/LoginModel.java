package pl.tomacie861.ProjInz.UserLogger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projinz.logins")
public class LoginModel {

	@Id
	private Long id;
	@Column(name="login")
	private String login;
	@Column(name="password")
	private String password;
	@Column(name ="token")
	private String token;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public LoginModel(Long id, String login, String password, String token) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.token = token;
	}
	
	public LoginModel() {
		
	}
	@Override
	public String toString() {
		return "LoginModel [id=" + id + ", login=" + login + ", password=" + password + ", token=" + token + "]";
	}
	
}
