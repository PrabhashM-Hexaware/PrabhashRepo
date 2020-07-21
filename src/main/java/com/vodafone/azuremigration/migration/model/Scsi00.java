
package com.vodafone.azuremigration.migration.model;

import lombok.Data;

@Data
public class Scsi00 {
 
    private String name;
  
    private Integer gigabytesProvisioned;
   
    private Integer gigabytesConsumed;
    
    private Integer megabytesPerSecondOfRead;
   
    private Integer megabytesPerSecondOfReadDataPointsExpected;
    
    private Integer megabytesPerSecondOfReadDataPointsReceived;
 
    private Integer megabytesPerSecondOfWrite;
   
    private Integer megabytesPerSecondOfWriteDataPointsExpected;
  
    private Integer megabytesPerSecondOfWriteDataPointsReceived;
   
    private Integer numberOfReadOperationsPerSecond;
    
    private Integer numberOfReadOperationsPerSecondDataPointsExpected;
  
    private Integer numberOfReadOperationsPerSecondDataPointsReceived;
   
    private Integer numberOfWriteOperationsPerSecond;
   
    private Integer numberOfWriteOperationsPerSecondDataPointsExpected;
   
    private Integer numberOfWriteOperationsPerSecondDataPointsReceived;
  
    private Integer monthlyStorageCost;
   
    private String recommendedDiskSize;
  
    private String recommendedDiskType;
   
    private Integer gigabytesForRecommendedDiskSize;
   
    private String suitability;
   
    private String suitabilityExplanation;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gigabytesProvisioned
	 */
	public Integer getGigabytesProvisioned() {
		return gigabytesProvisioned;
	}

	/**
	 * @param gigabytesProvisioned the gigabytesProvisioned to set
	 */
	public void setGigabytesProvisioned(Integer gigabytesProvisioned) {
		this.gigabytesProvisioned = gigabytesProvisioned;
	}

	/**
	 * @return the gigabytesConsumed
	 */
	public Integer getGigabytesConsumed() {
		return gigabytesConsumed;
	}

	/**
	 * @param gigabytesConsumed the gigabytesConsumed to set
	 */
	public void setGigabytesConsumed(Integer gigabytesConsumed) {
		this.gigabytesConsumed = gigabytesConsumed;
	}

	/**
	 * @return the megabytesPerSecondOfRead
	 */
	public Integer getMegabytesPerSecondOfRead() {
		return megabytesPerSecondOfRead;
	}

	/**
	 * @param megabytesPerSecondOfRead the megabytesPerSecondOfRead to set
	 */
	public void setMegabytesPerSecondOfRead(Integer megabytesPerSecondOfRead) {
		this.megabytesPerSecondOfRead = megabytesPerSecondOfRead;
	}

	/**
	 * @return the megabytesPerSecondOfReadDataPointsExpected
	 */
	public Integer getMegabytesPerSecondOfReadDataPointsExpected() {
		return megabytesPerSecondOfReadDataPointsExpected;
	}

	/**
	 * @param megabytesPerSecondOfReadDataPointsExpected the megabytesPerSecondOfReadDataPointsExpected to set
	 */
	public void setMegabytesPerSecondOfReadDataPointsExpected(Integer megabytesPerSecondOfReadDataPointsExpected) {
		this.megabytesPerSecondOfReadDataPointsExpected = megabytesPerSecondOfReadDataPointsExpected;
	}

	/**
	 * @return the megabytesPerSecondOfReadDataPointsReceived
	 */
	public Integer getMegabytesPerSecondOfReadDataPointsReceived() {
		return megabytesPerSecondOfReadDataPointsReceived;
	}

	/**
	 * @param megabytesPerSecondOfReadDataPointsReceived the megabytesPerSecondOfReadDataPointsReceived to set
	 */
	public void setMegabytesPerSecondOfReadDataPointsReceived(Integer megabytesPerSecondOfReadDataPointsReceived) {
		this.megabytesPerSecondOfReadDataPointsReceived = megabytesPerSecondOfReadDataPointsReceived;
	}

	/**
	 * @return the megabytesPerSecondOfWrite
	 */
	public Integer getMegabytesPerSecondOfWrite() {
		return megabytesPerSecondOfWrite;
	}

	/**
	 * @param megabytesPerSecondOfWrite the megabytesPerSecondOfWrite to set
	 */
	public void setMegabytesPerSecondOfWrite(Integer megabytesPerSecondOfWrite) {
		this.megabytesPerSecondOfWrite = megabytesPerSecondOfWrite;
	}

	/**
	 * @return the megabytesPerSecondOfWriteDataPointsExpected
	 */
	public Integer getMegabytesPerSecondOfWriteDataPointsExpected() {
		return megabytesPerSecondOfWriteDataPointsExpected;
	}

	/**
	 * @param megabytesPerSecondOfWriteDataPointsExpected the megabytesPerSecondOfWriteDataPointsExpected to set
	 */
	public void setMegabytesPerSecondOfWriteDataPointsExpected(Integer megabytesPerSecondOfWriteDataPointsExpected) {
		this.megabytesPerSecondOfWriteDataPointsExpected = megabytesPerSecondOfWriteDataPointsExpected;
	}

	/**
	 * @return the megabytesPerSecondOfWriteDataPointsReceived
	 */
	public Integer getMegabytesPerSecondOfWriteDataPointsReceived() {
		return megabytesPerSecondOfWriteDataPointsReceived;
	}

	/**
	 * @param megabytesPerSecondOfWriteDataPointsReceived the megabytesPerSecondOfWriteDataPointsReceived to set
	 */
	public void setMegabytesPerSecondOfWriteDataPointsReceived(Integer megabytesPerSecondOfWriteDataPointsReceived) {
		this.megabytesPerSecondOfWriteDataPointsReceived = megabytesPerSecondOfWriteDataPointsReceived;
	}

	/**
	 * @return the numberOfReadOperationsPerSecond
	 */
	public Integer getNumberOfReadOperationsPerSecond() {
		return numberOfReadOperationsPerSecond;
	}

	/**
	 * @param numberOfReadOperationsPerSecond the numberOfReadOperationsPerSecond to set
	 */
	public void setNumberOfReadOperationsPerSecond(Integer numberOfReadOperationsPerSecond) {
		this.numberOfReadOperationsPerSecond = numberOfReadOperationsPerSecond;
	}

	/**
	 * @return the numberOfReadOperationsPerSecondDataPointsExpected
	 */
	public Integer getNumberOfReadOperationsPerSecondDataPointsExpected() {
		return numberOfReadOperationsPerSecondDataPointsExpected;
	}

	/**
	 * @param numberOfReadOperationsPerSecondDataPointsExpected the numberOfReadOperationsPerSecondDataPointsExpected to set
	 */
	public void setNumberOfReadOperationsPerSecondDataPointsExpected(
			Integer numberOfReadOperationsPerSecondDataPointsExpected) {
		this.numberOfReadOperationsPerSecondDataPointsExpected = numberOfReadOperationsPerSecondDataPointsExpected;
	}

	/**
	 * @return the numberOfReadOperationsPerSecondDataPointsReceived
	 */
	public Integer getNumberOfReadOperationsPerSecondDataPointsReceived() {
		return numberOfReadOperationsPerSecondDataPointsReceived;
	}

	/**
	 * @param numberOfReadOperationsPerSecondDataPointsReceived the numberOfReadOperationsPerSecondDataPointsReceived to set
	 */
	public void setNumberOfReadOperationsPerSecondDataPointsReceived(
			Integer numberOfReadOperationsPerSecondDataPointsReceived) {
		this.numberOfReadOperationsPerSecondDataPointsReceived = numberOfReadOperationsPerSecondDataPointsReceived;
	}

	/**
	 * @return the numberOfWriteOperationsPerSecond
	 */
	public Integer getNumberOfWriteOperationsPerSecond() {
		return numberOfWriteOperationsPerSecond;
	}

	/**
	 * @param numberOfWriteOperationsPerSecond the numberOfWriteOperationsPerSecond to set
	 */
	public void setNumberOfWriteOperationsPerSecond(Integer numberOfWriteOperationsPerSecond) {
		this.numberOfWriteOperationsPerSecond = numberOfWriteOperationsPerSecond;
	}

	/**
	 * @return the numberOfWriteOperationsPerSecondDataPointsExpected
	 */
	public Integer getNumberOfWriteOperationsPerSecondDataPointsExpected() {
		return numberOfWriteOperationsPerSecondDataPointsExpected;
	}

	/**
	 * @param numberOfWriteOperationsPerSecondDataPointsExpected the numberOfWriteOperationsPerSecondDataPointsExpected to set
	 */
	public void setNumberOfWriteOperationsPerSecondDataPointsExpected(
			Integer numberOfWriteOperationsPerSecondDataPointsExpected) {
		this.numberOfWriteOperationsPerSecondDataPointsExpected = numberOfWriteOperationsPerSecondDataPointsExpected;
	}

	/**
	 * @return the numberOfWriteOperationsPerSecondDataPointsReceived
	 */
	public Integer getNumberOfWriteOperationsPerSecondDataPointsReceived() {
		return numberOfWriteOperationsPerSecondDataPointsReceived;
	}

	/**
	 * @param numberOfWriteOperationsPerSecondDataPointsReceived the numberOfWriteOperationsPerSecondDataPointsReceived to set
	 */
	public void setNumberOfWriteOperationsPerSecondDataPointsReceived(
			Integer numberOfWriteOperationsPerSecondDataPointsReceived) {
		this.numberOfWriteOperationsPerSecondDataPointsReceived = numberOfWriteOperationsPerSecondDataPointsReceived;
	}

	/**
	 * @return the monthlyStorageCost
	 */
	public Integer getMonthlyStorageCost() {
		return monthlyStorageCost;
	}

	/**
	 * @param monthlyStorageCost the monthlyStorageCost to set
	 */
	public void setMonthlyStorageCost(Integer monthlyStorageCost) {
		this.monthlyStorageCost = monthlyStorageCost;
	}

	/**
	 * @return the recommendedDiskSize
	 */
	public String getRecommendedDiskSize() {
		return recommendedDiskSize;
	}

	/**
	 * @param recommendedDiskSize the recommendedDiskSize to set
	 */
	public void setRecommendedDiskSize(String recommendedDiskSize) {
		this.recommendedDiskSize = recommendedDiskSize;
	}

	/**
	 * @return the recommendedDiskType
	 */
	public String getRecommendedDiskType() {
		return recommendedDiskType;
	}

	/**
	 * @param recommendedDiskType the recommendedDiskType to set
	 */
	public void setRecommendedDiskType(String recommendedDiskType) {
		this.recommendedDiskType = recommendedDiskType;
	}

	/**
	 * @return the gigabytesForRecommendedDiskSize
	 */
	public Integer getGigabytesForRecommendedDiskSize() {
		return gigabytesForRecommendedDiskSize;
	}

	/**
	 * @param gigabytesForRecommendedDiskSize the gigabytesForRecommendedDiskSize to set
	 */
	public void setGigabytesForRecommendedDiskSize(Integer gigabytesForRecommendedDiskSize) {
		this.gigabytesForRecommendedDiskSize = gigabytesForRecommendedDiskSize;
	}

	/**
	 * @return the suitability
	 */
	public String getSuitability() {
		return suitability;
	}

	/**
	 * @param suitability the suitability to set
	 */
	public void setSuitability(String suitability) {
		this.suitability = suitability;
	}

	/**
	 * @return the suitabilityExplanation
	 */
	public String getSuitabilityExplanation() {
		return suitabilityExplanation;
	}

	/**
	 * @param suitabilityExplanation the suitabilityExplanation to set
	 */
	public void setSuitabilityExplanation(String suitabilityExplanation) {
		this.suitabilityExplanation = suitabilityExplanation;
	}
    
   
   
}
