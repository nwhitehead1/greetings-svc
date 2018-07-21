package edu.villanova.csc.treatment.prediction.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "patient_history")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class PatientHistoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private PatientEntity patient;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private UWDataEntity data;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
	private LocalDateTime measurementTimestamp;
	private String predictedDiagnosis;
	private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public UWDataEntity getData() {
		return data;
	}

	public void setData(UWDataEntity data) {
		this.data = data;
	}

	public LocalDateTime getMeasurementTimestamp() {
		return measurementTimestamp;
	}

	public void setMeasurementTimestamp(LocalDateTime measurementTimestamp) {
		this.measurementTimestamp = measurementTimestamp;
	}

	public String getPredictedDiagnosis() {
		return predictedDiagnosis;
	}

	public void setPredictedDiagnosis(String predictedDiagnosis) {
		this.predictedDiagnosis = predictedDiagnosis;
	}

}
