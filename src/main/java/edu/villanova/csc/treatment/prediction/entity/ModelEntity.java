/**
 * 
 */
package edu.villanova.csc.treatment.prediction.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author natew
 *
 */
@Entity
@Table(name = "models")
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer", "handler" })
public class ModelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Lob
	private String model;
	private String modelName;
	private LocalDateTime modelEntryTimestamp;
	private BigDecimal cvAccuracy;
	private String dataSource;
	private Integer numberOfRecords;

	public BigDecimal getCvAccuracy() {
		return cvAccuracy;
	}

	public void setCvAccuracy(BigDecimal cvAccuracy) {
		this.cvAccuracy = cvAccuracy;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public LocalDateTime getModelEntryTimestamp() {
		return modelEntryTimestamp;
	}

	public void setModelEntryTimestamp(LocalDateTime modelEntryTimestamp) {
		this.modelEntryTimestamp = modelEntryTimestamp;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public Integer getNumberOfRecords() {
		return numberOfRecords;
	}

	public void setNumberOfRecords(Integer numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
