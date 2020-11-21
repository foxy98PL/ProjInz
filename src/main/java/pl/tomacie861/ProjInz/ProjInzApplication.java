package pl.tomacie861.ProjInz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ProjInzApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjInzApplication.class, args);
	}

}
