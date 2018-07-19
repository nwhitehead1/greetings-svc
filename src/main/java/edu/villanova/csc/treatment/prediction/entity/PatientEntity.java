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

import edu.villanova.csc.treatment.prediction.enums.Gender;

@Entity
@Table(name = "patient")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer patientId;
	private String firstName;
	private String lastName;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a")
	private LocalDateTime patientCreationTimestamp;

	public LocalDateTime getPatientCreationTimestamp() {
		return patientCreationTimestamp;
	}

	public void setPatientCreationTimestamp(LocalDateTime patientCreationTimestamp) {
		this.patientCreationTimestamp = patientCreationTimestamp;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
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
}
