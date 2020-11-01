package pl.tomacie861.ProjInz;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class OkRequest extends RuntimeException{

	public OkRequest(String message) {
		super(message);
	}
}
