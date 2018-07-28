/**
 * 
 */
package edu.villanova.csc.treatment.prediction.service.interfaces;

import java.util.List;

import edu.villanova.csc.treatment.prediction.entity.ModelEntity;

/**
 * @author natew
 *
 */
public interface ModelService {

	public List<ModelEntity> getModels();
}
