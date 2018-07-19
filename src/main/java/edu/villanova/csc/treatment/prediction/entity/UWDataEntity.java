package edu.villanova.csc.treatment.prediction.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uw_data")
public class UWDataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dataId;
	private BigDecimal radiusMean;

	public Integer getDataId() {
		return dataId;
	}

	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}

	public BigDecimal getRadiusMean() {
		return radiusMean;
	}

	public void setRadiusMean(BigDecimal radiusMean) {
		this.radiusMean = radiusMean;
	}

}
