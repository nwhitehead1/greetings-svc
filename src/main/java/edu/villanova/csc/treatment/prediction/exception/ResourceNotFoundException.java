/**
 * 
 */
package edu.villanova.csc.treatment.prediction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author natew
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException()  {
		super();
	}
	
	public ResourceNotFoundException(Throwable t)  {
		super(t);
	}
	
	public ResourceNotFoundException(String message)  {
		super(message);
	}

}
