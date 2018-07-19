package edu.villanova.csc.treatment.prediction.service.interfaces;

import java.util.List;

import edu.villanova.csc.treatment.prediction.entity.PatientHistoryEntity;

/**
 * @author natew
 *
 */
public interface PatientHistoryService {

	public PatientHistoryEntity addNewSession(PatientHistoryEntity patientHistoryEntity);
	
	public List<PatientHistoryEntity> getPatientHistory(Integer patientId);
}
