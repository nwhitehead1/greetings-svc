/**
 * 
 */
package edu.villanova.csc.health.logic.interfaces;

import edu.villanova.csc.health.dto.GreetingModel;

/**
 * @author natew
 *
 */
@FunctionalInterface
public interface Greetings {

	public GreetingModel greetings();
}
