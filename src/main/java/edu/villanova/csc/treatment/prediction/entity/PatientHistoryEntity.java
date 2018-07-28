package edu.villanova.csc.treatment.prediction.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

import edu.villanova.csc.treatment.prediction.enums.Diagnosis;

@Entity
@Table(name = "patient_history")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class PatientHistoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_history_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private PatientEntity patient;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private UWDataEntity data;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ModelEntity model;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
	private LocalDateTime dateOfMeasurement;
	@Enumerated(EnumType.STRING)
	private Diagnosis predictedDiagnosis;
	private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public ModelEntity getModel() {
		return model;
	}

	public void setModel(ModelEntity model) {
		this.model = model;
	}

	public UWDataEntity getData() {
		return data;
	}

	public void setData(UWDataEntity data) {
		this.data = data;
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

	public LocalDateTime getDateOfMeasurement() {
		return dateOfMeasurement;
	}

	public void setDateOfMeasurement(LocalDateTime dateOfMeasurement) {
		this.dateOfMeasurement = dateOfMeasurement;
	}

	public Diagnosis getPredictedDiagnosis() {
		return predictedDiagnosis;
	}

	public void setPredictedDiagnosis(Diagnosis predictedDiagnosis) {
		this.predictedDiagnosis = predictedDiagnosis;
	}

}
