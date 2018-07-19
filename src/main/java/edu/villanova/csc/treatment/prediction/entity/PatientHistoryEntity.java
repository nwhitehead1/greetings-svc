package edu.villanova.csc.treatment.prediction.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "patient_history")
public class PatientHistoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer patientHistoryId;
	@ManyToOne(fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private PatientEntity patient;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
	private LocalDateTime measurementTimestamp;
	private String predictionDiagnosis;
	private String comments;
	@OneToOne(fetch = FetchType.LAZY)
	private UWDataEntity dataEntity;

	public Integer getPatientHistoryId() {
		return patientHistoryId;
	}

	public void setPatientHistoryId(Integer patientHistoryId) {
		this.patientHistoryId = patientHistoryId;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public LocalDateTime getMeasurementTimestamp() {
		return measurementTimestamp;
	}

	public void setMeasurementTimestamp(LocalDateTime measurementTimestamp) {
		this.measurementTimestamp = measurementTimestamp;
	}

	public String getPredictionDiagnosis() {
		return predictionDiagnosis;
	}

	public void setPredictionDiagnosis(String predictionDiagnosis) {
		this.predictionDiagnosis = predictionDiagnosis;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
