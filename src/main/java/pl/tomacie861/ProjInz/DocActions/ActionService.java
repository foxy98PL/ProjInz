package pl.tomacie861.ProjInz.DocActions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionService {
	
	@Autowired
	ActionRepository repo;
	
	
	public void setStatus1(Long docid) {
		repo.setStatus1(docid);
	}

	public void setStatus0(Long docid) {
		repo.setStatus0(docid);
	}

}
