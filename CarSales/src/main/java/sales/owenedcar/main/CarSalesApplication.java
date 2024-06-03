package sales.owenedcar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"carsapi","sales"})
@EnableJpaRepositories(basePackages = "carsapi")
@EntityScan(basePackages = "carsapi")
public class CarSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSalesApplication.class, args);
	}

}
