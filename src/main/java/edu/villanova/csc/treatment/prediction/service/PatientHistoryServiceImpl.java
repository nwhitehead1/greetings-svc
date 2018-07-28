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

import edu.villanova.csc.treatment.prediction.entity.ModelEntity;
import edu.villanova.csc.treatment.prediction.entity.PatientHistoryEntity;
import edu.villanova.csc.treatment.prediction.entity.UWDataEntity;
import edu.villanova.csc.treatment.prediction.enums.Diagnosis;
import edu.villanova.csc.treatment.prediction.exception.ResourceNotFoundException;
import edu.villanova.csc.treatment.prediction.repository.PatientHistoryRepository;
import edu.villanova.csc.treatment.prediction.repository.PatientRepository;
import edu.villanova.csc.treatment.prediction.rest.RequestPrediction;
import edu.villanova.csc.treatment.prediction.rest.ResponsePrediction;
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
	
	private static final String predictionUri = "http://localhost:5000/test";
	
	@Override
	public List<PatientHistoryEntity> getAllPatientHistoryById(Integer patientId) {
		return Optional.ofNullable(patientRepository.findById(patientId)).get().map(patient -> {
			return patientHistoryRepository.findByPatientId(patientId);
		}).orElseThrow(() -> new ResourceNotFoundException("Patient ID: " + patientId + " not found."));
	}
	
	@Override
	public PatientHistoryEntity addNewPatientHistorySession(Integer patientId, PatientHistoryEntity patientHistory) throws RestClientException {
		return Optional.ofNullable(patientRepository.findById(patientId)).get().map(patient -> {
			patientHistory.setPatient(patient);
			patientHistory.setDateOfMeasurement(LocalDateTime.now());
			patientHistory.setPredictedDiagnosis(getPredictionDiagnosis(patientHistory.getData(), patientHistory.getModel()));
			patientHistoryRepository.saveAndFlush(patientHistory);
			return patientHistory;
		}).orElseThrow(() -> new ResourceNotFoundException("Patient ID: " + patientId + " not found."));
	}
	
	private Diagnosis getPredictionDiagnosis(UWDataEntity data, ModelEntity model)  {
		RestTemplate restTemplate = new RestTemplate();
		ResponsePrediction response;
		RequestPrediction request = new RequestPrediction();
		request.setData(data);
		request.setModel(model);
		try {
			response = restTemplate.postForObject(new URI(predictionUri), request, ResponsePrediction.class);
		} catch (RestClientException | URISyntaxException e) {
			throw new ResourceNotFoundException("Prediction webservice is down!");
		}
		return response.getPrediction();
	}
}
