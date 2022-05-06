package dev.deepakpenaganti.ssp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "dev.deepakpenaganti.ssp.repositories")
@EnableReactiveMongoRepositories(basePackages = "dev.deepakpenaganti.ssp.react-repositories")
public class SelfServicePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfServicePortalApplication.class, args);
	}

}
