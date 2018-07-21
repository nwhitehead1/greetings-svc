/**
 * 
 */
package edu.villanova.csc.treatment.prediction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(path="getAll")
	public @ResponseBody List<PatientEntity> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	@GetMapping(path="get/{patientId}")
	public @ResponseBody PatientEntity getPatientById(@PathVariable(value="patientId") Integer patientId)  {
		return patientService.getPatientById(patientId);
	}
	
	@PostMapping(path="create")
	public @ResponseBody PatientEntity addPatient(@RequestBody PatientEntity patient)  {
		return patientService.addPatient(patient);
	}
	
	@DeleteMapping(path="delete/{patientId}")
	public @ResponseBody String deletePatient(@PathVariable(value="patientId") Integer patientId)  {
		return patientService.deletePatient(patientId);
	}
	
	@PutMapping(path="update/{patientId}")
	public @ResponseBody PatientEntity updatePatient(@PathVariable(value="patientId") Integer patientId, @RequestBody PatientEntity request)  {
		return patientService.updatePatient(patientId, request);
	}
}
