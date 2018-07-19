/**
 * 
 */
package edu.villanova.csc.treatment.prediction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.villanova.csc.treatment.prediction.entity.PatientHistoryEntity;

/**
 * @author natew
 *
 */
@Repository
public interface PatientHistoryRepository extends JpaRepository<PatientHistoryEntity, Integer>  {

	public List<PatientHistoryEntity> findByPatientId(Integer patientId);
}