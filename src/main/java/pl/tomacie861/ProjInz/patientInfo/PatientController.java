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

	
	@GetMapping("/Patient")
 public	ResponseEntity<PatientInfoModel> getResponse(@RequestParam(required=true) Long pesel,@RequestParam(required=true) Long docId){
	
		/**
		 * Pobieranie pojedycznego pacjenta
		 */
		if(pesel == null || docId == null) {
			throw new BadRequestException("Brak numeru pesel/docId w żądaniu");
		}
		PatientInfoModel model = this.service.getPatient(pesel,docId);
		if(model == null) {
			throw new NotFoundException("Brak pacjenta");
		}
		
		
		return new ResponseEntity<>(model,HttpStatus.OK);
	}
	@GetMapping("/Patients")
	public ResponseEntity<List<PatientInfoModel>> getPatientsList(@RequestParam(required=true) Long docId){
		if(docId == null) {
			throw new BadRequestException("Brak numeru pesel/docId w żądaniu");
		}
		List<PatientInfoModel> model = this.service.getPatients(docId);
		if(model.isEmpty()) {
			throw new NotFoundException("Brak pacjentów dla tego doktora");
		}

		
		return new ResponseEntity<>(model,HttpStatus.OK);
	}
	
	
	
	
}
