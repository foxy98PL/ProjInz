package pl.tomacie861.ProjInz.patientTreatment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("projinz/")
public class TreatControler {

	@Autowired
private	TreatService service;
	
	@GetMapping("/PatientTreatment")
	public ResponseEntity<SingleResponse> getResponse(@RequestParam(required=true) Long pesel){
		TreatModel model = this.service.selectPatientTreatment(pesel);
		SingleResponse response = new SingleResponse(model);
		response.setPatientTreat(model);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	
	
}
