/**
 * 
 */
package edu.villanova.csc.ogic;

import org.springframework.stereotype.Component;

import edu.villanova.csc.dto.GreetingModel;
import edu.villanova.csc.logic.interfaces.Greetings;

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
