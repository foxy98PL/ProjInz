package pl.tomacie861.ProjInz.PatientAllergy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllergyService {

	@Autowired
	AllergyRepository repo;
	
	
	public List<AllergyModel> getAllergies(Long pesel){
		return repo.getAllergies(pesel);
	}
}
