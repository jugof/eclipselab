package demo.mongodb.connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoDbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbDemoApplication.class, args);
	}

}
