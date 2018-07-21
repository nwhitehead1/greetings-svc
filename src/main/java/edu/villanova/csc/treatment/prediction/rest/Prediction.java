/**
 * 
 */
package edu.villanova.csc.treatment.prediction.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author natew
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Prediction {

	private String prediction;

	public String getPrediction() {
		return prediction;
	}

	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}

}
