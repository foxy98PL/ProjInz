package pl.tomacie861.ProjInz.patientTreatment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreatService {

	
	
	@Autowired
	TreatRepository repo;
	
	
	public List<TreatModel> selectAllPatientTreatments(Long pesel,Long docid) {
		return repo.selectPatientTreatment(pesel,docid);
	}
}
