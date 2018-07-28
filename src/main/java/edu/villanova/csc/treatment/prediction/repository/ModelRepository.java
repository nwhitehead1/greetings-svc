/**
 * 
 */
package edu.villanova.csc.treatment.prediction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.villanova.csc.treatment.prediction.entity.ModelEntity;

/**
 * @author natew
 *
 */
@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, Integer> {

}
