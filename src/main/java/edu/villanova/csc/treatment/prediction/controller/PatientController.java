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

import edu.villanova.csc.treatment.prediction.entity.PatientEntity;
import edu.villanova.csc.treatment.prediction.service.interfaces.PatientService;

/**
 * @author natew
 *
 */
@Controller
@CrossOrigin
@RequestMapping(path="/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping(path="patients")
	public @ResponseBody List<PatientEntity> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	@PostMapping(path="addPatient")
	public @ResponseBody PatientEntity addPatient(@RequestBody PatientEntity patient)  {
		return patientService.addPatient(patient);
	}
	
	@GetMapping(path="/{patientId}")
	public @ResponseBody PatientEntity getPatientById(@PathVariable(value="patientId") Integer id)  {
		return patientService.getPatientById(id);
	}
}
