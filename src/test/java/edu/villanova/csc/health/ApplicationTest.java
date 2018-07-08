package edu.villanova.csc.health;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
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
