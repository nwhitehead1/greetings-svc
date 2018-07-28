/**
 * 
 */
package edu.villanova.csc.treatment.prediction.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.villanova.csc.treatment.prediction.entity.ModelEntity;
import edu.villanova.csc.treatment.prediction.entity.UWDataEntity;

/**
 * @author natew
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestPrediction {

	private UWDataEntity data;
	private ModelEntity model;

	public UWDataEntity getData() {
		return data;
	}

	public void setData(UWDataEntity data) {
		this.data = data;
	}

	public ModelEntity getModel() {
		return model;
	}

	public void setModel(ModelEntity model) {
		this.model = model;
	}

}
