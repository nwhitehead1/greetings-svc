package edu.villanova.csc.treatment.prediction.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.villanova.csc.treatment.prediction.application.Application;
import edu.villanova.csc.treatment.prediction.config.ApplicationConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class, ApplicationConfig.class })
public class ApplicationTest {
	
	@Mock
	private Application app;
	
	@SuppressWarnings("static-access")
	@Test
	public void contextLoads() {
		String[] args = new String[0];
		Mockito.verify(app).main(args);
	}
}
