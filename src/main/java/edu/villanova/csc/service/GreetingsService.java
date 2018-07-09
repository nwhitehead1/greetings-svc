/**
 * 
 */
package edu.villanova.csc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.villanova.csc.dto.GreetingModel;
import edu.villanova.csc.logic.interfaces.Greetings;

/**
 * @author natew
 *
 */
@Controller
@CrossOrigin
@RequestMapping(path="/greetings")
public class GreetingsService {

	@Autowired
	private Greetings greetingsService;
	
	@GetMapping
	public @ResponseBody GreetingModel greetings() {
		return greetingsService.greetings();
	}
}
