package edu.villanova.csc.health.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import edu.villanova.csc.health.config.HealthConfig;

@SpringBootApplication
@ComponentScan("edu.villanova.csc")
@Import(HealthConfig.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
