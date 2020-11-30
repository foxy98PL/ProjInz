package pl.tomacie861.ProjInz.DocActions;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pl.tomacie861.ProjInz.BadRequestException;
import pl.tomacie861.ProjInz.NotFoundException;
import pl.tomacie861.ProjInz.OkRequest;

@RestController
@RequestMapping("projinz/")

public class ActionControler {

	@Autowired
	ActionService service;
	
	@PutMapping("/setStatus1")
	public void setStatus1(@RequestParam(required=true) Long docId) {
	this.service.setStatus1(docId);

	}
	
	
	@PutMapping("/setStatus0")
	public void setStatus0(@RequestParam(required=true) Long docId) {
	this.service.setStatus0(docId);
	
	}
	@GetMapping("/doctors")
	public ResponseEntity<List<ActionModel>> getDoctors(){
		
		
		List<ActionModel> model = this.service.getDoctos();
		
		if(model == null) {
			throw new NotFoundException("Brak doktora w bazie danych");
		}
		
		return new ResponseEntity<>(model,HttpStatus.OK);
		
		
		
	}
	@GetMapping("/doctor")
	public ResponseEntity<response> getDoctor(@RequestParam()Long docId){
		
		ActionModel model = this.service.getDoctor(docId);
		response response = new response();
		String status = model.getDocstatus();
		response.setStatus(status);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
		
		
		
	}
	
	
}
