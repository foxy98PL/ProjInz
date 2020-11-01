package pl.tomacie861.ProjInz.DocActions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.tomacie861.ProjInz.OkRequest;

@RestController
@RequestMapping("projinz/")

public class ActionControler {

	@Autowired
	ActionService service;
	
	@GetMapping("/setStatus1")
	public ResponseEntity<ActionModel> setStatus1(@RequestParam(required=true) Long docId) {
	this.service.setStatus1(docId);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@GetMapping("/setStatus0")
	public ResponseEntity<ActionModel> setStatus0(@RequestParam(required=true) Long docId) {
	this.service.setStatus1(docId);
	return new ResponseEntity<>(HttpStatus.OK);
	}
}
