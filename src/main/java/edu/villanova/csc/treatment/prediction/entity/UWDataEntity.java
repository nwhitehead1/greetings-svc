package edu.villanova.csc.treatment.prediction.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "uw_data")
@JsonIgnoreProperties(ignoreUnknown = true, value = { "hibernateLazyInitializer", "handler" })
public class UWDataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private BigDecimal radiusMean;
	private BigDecimal textureMean;
	private BigDecimal perimeterMean;
	private BigDecimal areaMean;
	private BigDecimal smoothnessMean;
	private BigDecimal compactnessMean;
	private BigDecimal concavityMean;
	private BigDecimal concavePointsMean;
	private BigDecimal symmetryMean;
	private BigDecimal fractalDimensionMean;
	private BigDecimal radiusSe;
	private BigDecimal textureSe;
	private BigDecimal perimeterSe;
	private BigDecimal areaSe;
	private BigDecimal smoothnessSe;
	private BigDecimal compactnessSe;
	private BigDecimal concavitySe;
	private BigDecimal concavePointsSe;
	private BigDecimal symmetrySe;
	private BigDecimal fractalDimensionSe;
	private BigDecimal radiusWorst;
	private BigDecimal textureWorst;
	private BigDecimal perimeterWorst;
	private BigDecimal areaWorst;
	private BigDecimal smoothnessWorst;
	private BigDecimal compactnessWorst;
	private BigDecimal concavityWorst;
	private BigDecimal concavePointsWorst;
	private BigDecimal symmetryWorst;
	private BigDecimal fractalDimensionWorst;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getRadiusMean() {
		return radiusMean;
	}

	public void setRadiusMean(BigDecimal radiusMean) {
		this.radiusMean = radiusMean;
	}

	public BigDecimal getTextureMean() {
		return textureMean;
	}

	public void setTextureMean(BigDecimal textureMean) {
		this.textureMean = textureMean;
	}

	public BigDecimal getPerimeterMean() {
		return perimeterMean;
	}

	public void setPerimeterMean(BigDecimal perimeterMean) {
		this.perimeterMean = perimeterMean;
	}

	public BigDecimal getAreaMean() {
		return areaMean;
	}

	public void setAreaMean(BigDecimal areaMean) {
		this.areaMean = areaMean;
	}

	public BigDecimal getSmoothnessMean() {
		return smoothnessMean;
	}

	public void setSmoothnessMean(BigDecimal smoothnessMean) {
		this.smoothnessMean = smoothnessMean;
	}

	public BigDecimal getCompactnessMean() {
		return compactnessMean;
	}

	public void setCompactnessMean(BigDecimal compactnessMean) {
		this.compactnessMean = compactnessMean;
	}

	public BigDecimal getConcavityMean() {
		return concavityMean;
	}

	public void setConcavityMean(BigDecimal concavityMean) {
		this.concavityMean = concavityMean;
	}

	public BigDecimal getConcavePointsMean() {
		return concavePointsMean;
	}

	public void setConcavePointsMean(BigDecimal concavePointsMean) {
		this.concavePointsMean = concavePointsMean;
	}

	public BigDecimal getSymmetryMean() {
		return symmetryMean;
	}

	public void setSymmetryMean(BigDecimal symmetryMean) {
		this.symmetryMean = symmetryMean;
	}

	public BigDecimal getFractalDimensionMean() {
		return fractalDimensionMean;
	}

	public void setFractalDimensionMean(BigDecimal fractalDimensionMean) {
		this.fractalDimensionMean = fractalDimensionMean;
	}

	public BigDecimal getRadiusSe() {
		return radiusSe;
	}

	public void setRadiusSe(BigDecimal radiusSe) {
		this.radiusSe = radiusSe;
	}

	public BigDecimal getTextureSe() {
		return textureSe;
	}

	public void setTextureSe(BigDecimal textureSe) {
		this.textureSe = textureSe;
	}

	public BigDecimal getPerimeterSe() {
		return perimeterSe;
	}

	public void setPerimeterSe(BigDecimal perimeterSe) {
		this.perimeterSe = perimeterSe;
	}

	public BigDecimal getAreaSe() {
		return areaSe;
	}

	public void setAreaSe(BigDecimal areaSe) {
		this.areaSe = areaSe;
	}

	public BigDecimal getSmoothnessSe() {
		return smoothnessSe;
	}

	public void setSmoothnessSe(BigDecimal smoothnessSe) {
		this.smoothnessSe = smoothnessSe;
	}

	public BigDecimal getCompactnessSe() {
		return compactnessSe;
	}

	public void setCompactnessSe(BigDecimal compactnessSe) {
		this.compactnessSe = compactnessSe;
	}

	public BigDecimal getConcavitySe() {
		return concavitySe;
	}

	public void setConcavitySe(BigDecimal concavitySe) {
		this.concavitySe = concavitySe;
	}

	public BigDecimal getConcavePointsSe() {
		return concavePointsSe;
	}

	public void setConcavePointsSe(BigDecimal concavePointsSe) {
		this.concavePointsSe = concavePointsSe;
	}

	public BigDecimal getSymmetrySe() {
		return symmetrySe;
	}

	public void setSymmetrySe(BigDecimal symmetrySe) {
		this.symmetrySe = symmetrySe;
	}

	public BigDecimal getFractalDimensionSe() {
		return fractalDimensionSe;
	}

	public void setFractalDimensionSe(BigDecimal fractalDimensionSe) {
		this.fractalDimensionSe = fractalDimensionSe;
	}

	public BigDecimal getRadiusWorst() {
		return radiusWorst;
	}

	public void setRadiusWorst(BigDecimal radiusWorst) {
		this.radiusWorst = radiusWorst;
	}

	public BigDecimal getTextureWorst() {
		return textureWorst;
	}

	public void setTextureWorst(BigDecimal textureWorst) {
		this.textureWorst = textureWorst;
	}

	public BigDecimal getPerimeterWorst() {
		return perimeterWorst;
	}

	public void setPerimeterWorst(BigDecimal perimeterWorst) {
		this.perimeterWorst = perimeterWorst;
	}

	public BigDecimal getAreaWorst() {
		return areaWorst;
	}

	public void setAreaWorst(BigDecimal areaWorst) {
		this.areaWorst = areaWorst;
	}

	public BigDecimal getSmoothnessWorst() {
		return smoothnessWorst;
	}

	public void setSmoothnessWorst(BigDecimal smoothnessWorst) {
		this.smoothnessWorst = smoothnessWorst;
	}

	public BigDecimal getCompactnessWorst() {
		return compactnessWorst;
	}

	public void setCompactnessWorst(BigDecimal compactnessWorst) {
		this.compactnessWorst = compactnessWorst;
	}

	public BigDecimal getConcavityWorst() {
		return concavityWorst;
	}

	public void setConcavityWorst(BigDecimal concavityWorst) {
		this.concavityWorst = concavityWorst;
	}

	public BigDecimal getConcavePointsWorst() {
		return concavePointsWorst;
	}

	public void setConcavePointsWorst(BigDecimal concavePointsWorst) {
		this.concavePointsWorst = concavePointsWorst;
	}

	public BigDecimal getSymmetryWorst() {
		return symmetryWorst;
	}

	public void setSymmetryWorst(BigDecimal symmetryWorst) {
		this.symmetryWorst = symmetryWorst;
	}

	public BigDecimal getFractalDimensionWorst() {
		return fractalDimensionWorst;
	}

	public void setFractalDimensionWorst(BigDecimal fractalDimensionWorst) {
		this.fractalDimensionWorst = fractalDimensionWorst;
	}

}
