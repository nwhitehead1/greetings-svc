/**
 * 
 */
package edu.villanova.csc.health.logic;

import org.springframework.stereotype.Component;

import edu.villanova.csc.health.dto.GreetingModel;
import edu.villanova.csc.health.logic.interfaces.Greetings;

/**
 * @author natew
 *
 */
@Component
public class GreetingsImpl implements Greetings {

	@Override
	public GreetingModel greetings() {
		GreetingModel greeting = new GreetingModel();
		greeting.setGreeting("Greetings on your end to end project!");
		return greeting;
	}
}
