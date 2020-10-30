package pl.tomacie861.ProjInz.patientTreatment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreatService {

	
	
	@Autowired
	TreatRepository repo;
	
	public TreatModel selectPatientTreatment(Long pesel) {
		return repo.selectPatientSingleTreatment(pesel);
	}
	
	
	
	public List<TreatModel> selectAllPatientTreatments(Long pesel) {
		return repo.selectPatientTreatment(pesel);
	}
}
