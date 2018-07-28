/**
 * 
 */
package edu.villanova.csc.treatment.prediction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.villanova.csc.treatment.prediction.entity.ModelEntity;
import edu.villanova.csc.treatment.prediction.repository.ModelRepository;
import edu.villanova.csc.treatment.prediction.service.interfaces.ModelService;

/**
 * @author natew
 *
 */
@Service
public class ModelServiceIml implements ModelService {

	@Autowired
	private ModelRepository modelRepository;
	
	@Override
	public List<ModelEntity> getModels() {
		return modelRepository.findAll();
	}

}
