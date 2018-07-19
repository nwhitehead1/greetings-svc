package edu.villanova.csc.treatment.prediction.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import edu.villanova.csc.treatment.prediction.config.ApplicationConfig;

@SpringBootApplication
@Import(ApplicationConfig.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
