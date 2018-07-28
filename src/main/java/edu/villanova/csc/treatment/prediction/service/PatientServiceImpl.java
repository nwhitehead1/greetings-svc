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
import edu.villanova.csc.treatment.prediction.enums.Diagnosis;
import edu.villanova.csc.treatment.prediction.exception.ResourceNotFoundException;
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
		return Optional.ofNullable(patientRepository.findById(patientId))
				.get()
				.orElseThrow(() -> new ResourceNotFoundException("Patient ID: " + patientId + " not found."));
	}

	@Override
	public String deletePatient(Integer patientId) {
		return Optional.ofNullable(patientRepository.findById(patientId)).get().map(patient -> {
			patientRepository.delete(patient);
			return "Successfully deleted patient " + patientId;
		}).orElseThrow(() -> new ResourceNotFoundException("Patient ID: " + patientId + " not found."));
	}

	@Override
	public PatientEntity updateFinalDiagnosis(Integer patientId, Diagnosis finalDiagnosis) {		
		return Optional.ofNullable(patientRepository.findById(patientId)).get().map(patient -> {
			patient.setFinalDiagnosis(finalDiagnosis);
			patient.setFinalDiagnosisTimestamp(LocalDateTime.now());
			return patientRepository.saveAndFlush(patient);
		}).orElseThrow(() -> new ResourceNotFoundException("Patient ID: " + patientId + " not found."));
	}
}
