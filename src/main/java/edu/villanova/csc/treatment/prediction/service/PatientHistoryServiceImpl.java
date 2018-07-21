/**
 * 
 */
package edu.villanova.csc.treatment.prediction.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import edu.villanova.csc.treatment.prediction.entity.PatientHistoryEntity;
import edu.villanova.csc.treatment.prediction.exception.ResourceNotFoundException;
import edu.villanova.csc.treatment.prediction.repository.PatientHistoryRepository;
import edu.villanova.csc.treatment.prediction.repository.PatientRepository;
import edu.villanova.csc.treatment.prediction.rest.Prediction;
import edu.villanova.csc.treatment.prediction.service.interfaces.PatientHistoryService;

/**
 * @author natew
 *
 */
@Service
class PatientHistoryServiceImpl implements PatientHistoryService {
	
	@Autowired
	private PatientHistoryRepository patientHistoryRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	private static final String predictionUri = "http://localhost:5000/prediction";
	
	@Override
	public List<PatientHistoryEntity> getAllPatientHistoryById(Integer patientId) {
		return Optional.ofNullable(patientRepository.findById(patientId)).get().map(patient -> {
			return patientHistoryRepository.findByPatientId(patientId);
		}).orElseThrow(() -> new ResourceNotFoundException("Patient ID: " + patientId + " not found."));
	}

	@Override
	public PatientHistoryEntity addNewPatientHistorySession(Integer patientId, PatientHistoryEntity patientHistory) throws RestClientException {
		// Pass data to Python service
		RestTemplate restTemplate = new RestTemplate();
		Prediction prediction;
		try {
			prediction = restTemplate.postForObject(new URI(predictionUri), patientHistory.getData(), Prediction.class);
		} catch (URISyntaxException e) {
			throw new ResourceNotFoundException("Resource not found: " + predictionUri);
		}		
		// Store prediction + comment information
		return Optional.ofNullable(patientRepository.findById(patientId)).get().map(patient -> {
			patientHistory.setPatient(patient);
			patientHistory.setMeasurementTimestamp(LocalDateTime.now());
			patientHistory.setPredictedDiagnosis(prediction.getPrediction());
			patientHistory.setComments(patientHistory.getComments());
			patientHistoryRepository.saveAndFlush(patientHistory);
			return patientHistory;
		}).orElseThrow(() -> new ResourceNotFoundException("Patient ID: " + patientId + " not found."));
	}
}
