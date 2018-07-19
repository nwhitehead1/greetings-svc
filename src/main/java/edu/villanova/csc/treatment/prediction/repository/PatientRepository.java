package edu.villanova.csc.treatment.prediction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.villanova.csc.treatment.prediction.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {

}
