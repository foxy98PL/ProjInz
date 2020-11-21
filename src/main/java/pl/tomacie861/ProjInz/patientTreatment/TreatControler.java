package pl.tomacie861.ProjInz.patientTreatment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.tomacie861.ProjInz.BadRequestException;
import pl.tomacie861.ProjInz.NotFoundException;

@RestController
@RequestMapping("projinz/")
public class TreatControler {

	@Autowired
private	TreatService service;
	
	@GetMapping("/PatientTreatment")
	public ResponseEntity<List<TreatModel>> getResponse(@RequestParam(required=true) Long pesel,@RequestParam(required=true) Long docId){
		if(pesel == null || docId == null) {
			throw new BadRequestException("Parametr pesel/docId jest nie wpisany");
		}
		
		List<TreatModel> model = this.service.selectAllPatientTreatments(pesel,docId);
		if(model.isEmpty()) {
			throw new NotFoundException("Brak pacjentów");
		}
		
	
		
		return new ResponseEntity<>(model,HttpStatus.OK);
		
	}
	
	
}
