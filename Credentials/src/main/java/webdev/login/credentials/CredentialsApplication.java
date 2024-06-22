package webdev.login.credentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "webdev")
@EnableJpaRepositories(basePackages = "webdev")
@EntityScan(basePackages = "webdev")
public class CredentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredentialsApplication.class, args);
	}

}
