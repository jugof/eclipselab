package example.rest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"stockapi", "example"})
public class RestProjectApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RestProjectApplication.class, args);
		
	}

}
