/**
 * 
 */
package edu.villanova.csc.treatment.prediction.service.interfaces;

import java.util.List;

import edu.villanova.csc.treatment.prediction.entity.PatientEntity;
import edu.villanova.csc.treatment.prediction.enums.Diagnosis;

/**
 * @author natew
 *
 */
public interface PatientService {

	public List<PatientEntity> getAllPatients();
	
	public PatientEntity addPatient(PatientEntity patient);
	
	public PatientEntity getPatientById(Integer patientId);
	
	public PatientEntity updateFinalDiagnosis(Integer patientId, Diagnosis finalDiagnosis);
	
	public String deletePatient(Integer patientId);	
}
