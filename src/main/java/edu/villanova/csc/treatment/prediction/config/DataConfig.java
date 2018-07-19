/**
 * 
 */
package edu.villanova.csc.treatment.prediction.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author natew
 *
 */
@Configuration
@EntityScan(basePackages = "edu.villanova.csc.treatment.prediction.entity")
@EnableJpaRepositories(basePackages = "edu.villanova.csc.treatment.prediction.repository")
public class DataConfig {
	
}
