package pl.tomacie861.ProjInz.UserLogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.tomacie861.ProjInz.BadRequestException;
import pl.tomacie861.ProjInz.NotFoundException;

@RestController
@RequestMapping("projinz/")
public class LoginController {
	@Autowired
	LoginService service;
	
	@Autowired
LoginRepository repo;
	@GetMapping("/Login")
	public ResponseEntity<Response> getLoginToken(@RequestParam String login , @RequestParam String password){
		
		if(login == null || password == null) {
			throw new BadRequestException("Brak loginu/hasła");
		}
		LoginModel model = this.service.getLoginToken(login, password);
		if(model == null) {
			throw new NotFoundException("brak usera");
		}
		Response response = new Response();
		response.token = model.getToken();
		response.id= model.getId();
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

}
