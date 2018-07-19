/**
 * 
 */
package edu.villanova.csc.treatment.prediction.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.villanova.csc.treatment.prediction.entity.PatientEntity;
import edu.villanova.csc.treatment.prediction.repository.PatientRepository;
import edu.villanova.csc.treatment.prediction.service.interfaces.PatientService;

/**
 * @author natew
 *
 */
@Service
class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public List<PatientEntity> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public PatientEntity addPatient(PatientEntity patient) {
		patient.setPatientCreationTimestamp(LocalDateTime.now());
		return patientRepository.saveAndFlush(patient);
	}

	@Override
	public PatientEntity getPatientById(Integer patientId) {
		Optional<PatientEntity> patientEntity = patientRepository.findById(patientId);
		return patientEntity.isPresent() ? patientEntity.get() : null;
	}
}
