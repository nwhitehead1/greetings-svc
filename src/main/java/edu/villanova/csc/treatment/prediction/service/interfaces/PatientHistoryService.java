package edu.villanova.csc.treatment.prediction.service.interfaces;

import java.util.List;

import org.springframework.web.client.RestClientException;

import edu.villanova.csc.treatment.prediction.entity.PatientHistoryEntity;

/**
 * @author natew
 *
 */
public interface PatientHistoryService {
	
	public List<PatientHistoryEntity> getAllPatientHistoryById(Integer patientId);
	
	public PatientHistoryEntity addNewPatientHistorySession(Integer patientId, PatientHistoryEntity patientHistory) throws RestClientException;
}
