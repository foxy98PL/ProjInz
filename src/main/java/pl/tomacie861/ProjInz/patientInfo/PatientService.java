package pl.tomacie861.ProjInz.patientInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repo;
	
	public PatientInfoModel getPatient(Long pesel,Long docid) {
		return repo.selectPatient(pesel,docid);
	}
	public List<PatientInfoModel> getPatients(Long docid){
		return repo.selectPatients(docid);
	}
}
