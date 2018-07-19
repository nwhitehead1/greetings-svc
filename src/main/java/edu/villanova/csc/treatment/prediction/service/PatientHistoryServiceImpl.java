/**
 * 
 */
package edu.villanova.csc.treatment.prediction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.villanova.csc.treatment.prediction.entity.PatientHistoryEntity;
import edu.villanova.csc.treatment.prediction.repository.PatientHistoryRepository;
import edu.villanova.csc.treatment.prediction.service.interfaces.PatientHistoryService;

/**
 * @author natew
 *
 */
@Service
class PatientHistoryServiceImpl implements PatientHistoryService {
	
	@Autowired
	private PatientHistoryRepository patientHistoryRepository;

	@Override
	public PatientHistoryEntity addNewSession(PatientHistoryEntity patientHistoryEntity) {
		return patientHistoryRepository.saveAndFlush(patientHistoryEntity);
	}

	@Override
	public List<PatientHistoryEntity> getPatientHistory(Integer patientId) {
		return patientHistoryRepository.findByPatientId(patientId);
	}

}
