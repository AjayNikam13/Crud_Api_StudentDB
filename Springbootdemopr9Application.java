package SPRINGBOOTDEMOPR9.SPRINGBOOTDEMOPR9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Entity;

@SpringBootApplication(scanBasePackages = "ControllerP")
@EnableJpaRepositories(basePackages = "JpaRepoP")
@EntityScan(basePackages = "EntityP")
public class Springbootdemopr9Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootdemopr9Application.class, args);
	}

}
