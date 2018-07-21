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
import org.springframework.web.client.RestClientException;

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
	
	@GetMapping(path="getById/{patientId}")
	public @ResponseBody List<PatientHistoryEntity> getPatientHistoryByPatientId(@PathVariable(value="patientId") Integer patientId) {
		return patientHistoryService.getAllPatientHistoryById(patientId);
	}
	
	@PostMapping(path = "createSession/{patientId}")
	public @ResponseBody PatientHistoryEntity addSession(@PathVariable(value="patientId") Integer patientId, 
														@RequestBody PatientHistoryEntity patientHistory) throws RestClientException  {
		return patientHistoryService.addNewPatientHistorySession(patientId, patientHistory);
	}
}
