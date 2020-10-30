package pl.tomacie861.ProjInz.patientInfo;



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
public class PatientController {

@Autowired
private PatientService service;

	
	@GetMapping("/getPatient")
 public	ResponseEntity<SinglePatientResponse> getResponse(@RequestParam(required=true) Long pesel,@RequestParam(required=true) Long docId){
	
		/**
		 * Pobieranie pojedycznego pacjenta
		 */
		if(pesel == null || docId == null) {
			throw new BadRequestException("Brak numeru pesel/docId w żądaniu");
		}
		Model model = this.service.getPatient(pesel,docId);
		if(model == null) {
			throw new NotFoundException("Brak pacjenta");
		}
		SinglePatientResponse response = new SinglePatientResponse(model);
		response.setModel(model);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	@GetMapping("/getPatientsList")
	public ResponseEntity<PatientsResponse> getPatientsList(@RequestParam(required=true) Long docId){
		if(docId == null) {
			throw new BadRequestException("Brak numeru pesel/docId w żądaniu");
		}
		List<Model> model = this.service.getPatients(docId);
		if(model.isEmpty()) {
			throw new NotFoundException("Brak pacjentów dla tego doktora");
		}
		PatientsResponse response = new PatientsResponse(model);
		
		response.setResponse(model);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	
	
	
}
