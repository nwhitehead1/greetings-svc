/**
 * 
 */
package edu.villanova.csc.treatment.prediction.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.villanova.csc.treatment.prediction.enums.Diagnosis;

/**
 * @author natew
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePrediction {

	private Diagnosis prediction;

	public Diagnosis getPrediction() {
		return prediction;
	}

	public void setPrediction(Diagnosis prediction) {
		this.prediction = prediction;
	}

}
