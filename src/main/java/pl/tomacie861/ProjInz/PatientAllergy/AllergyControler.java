package pl.tomacie861.ProjInz.PatientAllergy;

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
import pl.tomacie861.ProjInz.patientInfo.PatientInfoModel;


@RestController
@RequestMapping("projinz/")
public class AllergyControler {

	@Autowired
	AllergyService service;
	
	
	@GetMapping("/Allergies")
	 public	ResponseEntity<List<AllergyModel>> getResponse(@RequestParam(required=true) Long pesel){
		
			/**
			 * Pobieranie pojedycznego pacjenta
			 */
			if(pesel == null) {
				throw new BadRequestException("Brak numeru pesel");
			}
			List<AllergyModel> model = this.service.getAllergies(pesel);
			if(model.isEmpty()) {
				throw new NotFoundException("Brak Uczuleń pacjenta");
			}
			
			return new ResponseEntity<>(model,HttpStatus.OK);
		}
}
