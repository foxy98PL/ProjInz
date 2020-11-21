package pl.tomacie861.ProjInz.UserLogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	LoginRepository repo;
	
	public LoginModel getLoginToken(String login,String password) {
		return repo.getLoginToken(login, password);
	}
	
}
