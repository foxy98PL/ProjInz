package pl.tomacie861.ProjInz.patientCallendar;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.tomacie861.ProjInz.BadRequestException;
import pl.tomacie861.ProjInz.NotFoundException;
import pl.tomacie861.ProjInz.patientInfo.PatientInfoModel;

@RestController
@RequestMapping("projinz/")
public class CallendarController {

	@Autowired
	CallendarRepository repo;
	
	@GetMapping("/callendar")
	 public	ResponseEntity<List<CallendarModel>> getResponse(@RequestParam(required=true) Long docId){
		
			/**
			 * Pobieranie pojedycznego pacjenta
			 */
			if (docId == null) {
				throw new BadRequestException("Brak numeru docId w żądaniu");
			}
			List<CallendarModel> model = repo.getPatients(docId);
			if(model.isEmpty()) {
				throw new NotFoundException("Brak pacjentów");
			}		
			return new ResponseEntity<>(model,HttpStatus.OK);
		}
	
	@RequestMapping(value = "/callendar", method =RequestMethod.DELETE)
	public void deletePatient(@RequestParam(required=true)Long pesel) {
		
		repo.deletePatient(pesel);
	}
}
