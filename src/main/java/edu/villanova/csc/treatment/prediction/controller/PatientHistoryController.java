/**
 * 
 */
package edu.villanova.csc.treatment.prediction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.villanova.csc.treatment.prediction.entity.PatientHistoryEntity;
import edu.villanova.csc.treatment.prediction.service.interfaces.PatientHistoryService;

/**
 * @author natew
 *
 */
@Controller
@CrossOrigin
@RequestMapping(path="/history")
public class PatientHistoryController {

	@Autowired
	private PatientHistoryService patientHistoryService;
	
	@GetMapping(path="/{patientId}")
	public @ResponseBody List<PatientHistoryEntity> getAllPatients(@PathVariable(value="patientId") Integer id) {
		return patientHistoryService.getPatientHistory(id);
	}
	
	@PostMapping(path="addSession")
	public @ResponseBody PatientHistoryEntity addPatientSession(@RequestBody PatientHistoryEntity patientHistory)  {
		return patientHistoryService.addNewSession(patientHistory);
	}
}
