/**
 * 
 */
package edu.villanova.csc.treatment.prediction.service.interfaces;

import java.util.List;

import edu.villanova.csc.treatment.prediction.entity.PatientEntity;

/**
 * @author natew
 *
 */
public interface PatientService {

	public List<PatientEntity> getAllPatients();
	
	public PatientEntity addPatient(PatientEntity patient);
	
	public PatientEntity getPatientById(Integer patientId);
	
	// DELETE AND UPDATE PATIENT INFO
}
