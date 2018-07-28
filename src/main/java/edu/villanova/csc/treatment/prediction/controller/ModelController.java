/**
 * 
 */
package edu.villanova.csc.treatment.prediction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.villanova.csc.treatment.prediction.entity.ModelEntity;
import edu.villanova.csc.treatment.prediction.service.interfaces.ModelService;

/**
 * @author natew
 *
 */
@Controller
@CrossOrigin
@RequestMapping(path="/model")
public class ModelController {

	@Autowired
	private ModelService modelService;
	
	@GetMapping(path="getAll")
	public @ResponseBody List<ModelEntity> getAllModels() {
		return modelService.getModels();
	}
}
