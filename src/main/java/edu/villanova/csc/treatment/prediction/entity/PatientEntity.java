package edu.villanova.csc.treatment.prediction.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import edu.villanova.csc.treatment.prediction.enums.Diagnosis;
import edu.villanova.csc.treatment.prediction.enums.Gender;

@Entity
@Table(name = "patient")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
	private LocalDateTime patientCreationTimestamp;
	private Diagnosis finalDiagnosis;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
	private LocalDateTime finalDiagnosisTimestamp;

	public Integer getId() {
		return id;
	}

	public Diagnosis getFinalDiagnosis() {
		return finalDiagnosis;
	}

	public void setFinalDiagnosis(Diagnosis finalDiagnosis) {
		this.finalDiagnosis = finalDiagnosis;
	}

	public LocalDateTime getFinalDiagnosisTimestamp() {
		return finalDiagnosisTimestamp;
	}

	public void setFinalDiagnosisTimestamp(LocalDateTime finalDiagnosisTimestamp) {
		this.finalDiagnosisTimestamp = finalDiagnosisTimestamp;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getPatientCreationTimestamp() {
		return patientCreationTimestamp;
	}

	public void setPatientCreationTimestamp(LocalDateTime patientCreationTimestamp) {
		this.patientCreationTimestamp = patientCreationTimestamp;
	}

}
