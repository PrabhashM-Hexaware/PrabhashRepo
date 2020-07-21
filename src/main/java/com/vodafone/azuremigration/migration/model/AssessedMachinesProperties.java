
package com.vodafone.azuremigration.migration.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
@Data
public class AssessedMachinesProperties {
    private List<String> groups = null;  
    private String discoveredTimestamp;  
    private String createdTimestamp;    
    private String updatedTimestamp;  
    private String bootType;   
    private String datacenterContainer;  
    private String datacenterManagementServerName;  
    private String datacenterMachineArmId;    
    private String datacenterManagementServerArmId;  
    private String description;   
    private String displayName;  
    private Integer megabytesOfMemory;    
    private Integer numberOfCores;   
    private String operatingSystemType;  
    private String operatingSystemName;  
    private String operatingSystemVersion;   
    private Integer monthlyPremiumStorageCost;
    private Integer monthlyStandardSSDStorageCost;
    private Integer confidenceRatingInPercentage;
    private Integer monthlyBandwidthCost;   
    private Integer monthlyStorageCost;    
    private Disks disks;    
    private NetworkAdapters networkAdapters;   
    private String recommendedSize;    
    private Integer numberOfCoresForRecommendedSize;   
    private Integer megabytesOfMemoryForRecommendedSize;    
    private Integer monthlyComputeCostForRecommendedSize;  
    private Double percentageCoresUtilization;   
    private Double percentageMemoryUtilization;    
    private Integer percentageCoresUtilizationDataPointsExpected;   
    private Integer percentageCoresUtilizationDataPointsReceived;   
    private Integer percentageMemoryUtilizationDataPointsExpected;  
    private Integer percentageMemoryUtilizationDataPointsReceived;   
    private String suitability;
    private String suitabilityExplanation;
    private String suitabilityDetail;
    private String operatingSystemArchitecture;
    
	/**
	 * @return the groups
	 */
	public List<String> getGroups() {
		return groups;
	}
	/**
	 * @param groups the groups to set
	 */
	public void setGroups(List<String> groups) {
		this.groups = groups;
	}
	/**
	 * @return the discoveredTimestamp
	 */
	public String getDiscoveredTimestamp() {
		return discoveredTimestamp;
	}
	/**
	 * @param discoveredTimestamp the discoveredTimestamp to set
	 */
	public void setDiscoveredTimestamp(String discoveredTimestamp) {
		this.discoveredTimestamp = discoveredTimestamp;
	}
	/**
	 * @return the createdTimestamp
	 */
	public String getCreatedTimestamp() {
		return createdTimestamp;
	}
	/**
	 * @param createdTimestamp the createdTimestamp to set
	 */
	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	/**
	 * @return the updatedTimestamp
	 */
	public String getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	/**
	 * @param updatedTimestamp the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(String updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}
	/**
	 * @return the bootType
	 */
	public String getBootType() {
		return bootType;
	}
	/**
	 * @param bootType the bootType to set
	 */
	public void setBootType(String bootType) {
		this.bootType = bootType;
	}
	/**
	 * @return the datacenterContainer
	 */
	public String getDatacenterContainer() {
		return datacenterContainer;
	}
	/**
	 * @param datacenterContainer the datacenterContainer to set
	 */
	public void setDatacenterContainer(String datacenterContainer) {
		this.datacenterContainer = datacenterContainer;
	}
	

	/**
	 * @return the datacenterMachineArmId
	 */
	public String getDatacenterMachineArmId() {
		return datacenterMachineArmId;
	}
	/**
	 * @param datacenterMachineArmId the datacenterMachineArmId to set
	 */
	public void setDatacenterMachineArmId(String datacenterMachineArmId) {
		this.datacenterMachineArmId = datacenterMachineArmId;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * @return the megabytesOfMemory
	 */
	public Integer getMegabytesOfMemory() {
		return megabytesOfMemory;
	}
	/**
	 * @param megabytesOfMemory the megabytesOfMemory to set
	 */
	public void setMegabytesOfMemory(Integer megabytesOfMemory) {
		this.megabytesOfMemory = megabytesOfMemory;
	}
	/**
	 * @return the numberOfCores
	 */
	public Integer getNumberOfCores() {
		return numberOfCores;
	}
	/**
	 * @param numberOfCores the numberOfCores to set
	 */
	public void setNumberOfCores(Integer numberOfCores) {
		this.numberOfCores = numberOfCores;
	}
	
	
	/**
	 * @return the monthlyBandwidthCost
	 */
	public Integer getMonthlyBandwidthCost() {
		return monthlyBandwidthCost;
	}
	/**
	 * @param monthlyBandwidthCost the monthlyBandwidthCost to set
	 */
	public void setMonthlyBandwidthCost(Integer monthlyBandwidthCost) {
		this.monthlyBandwidthCost = monthlyBandwidthCost;
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
	 * @return the disks
	 */
	public Disks getDisks() {
		return disks;
	}
	/**
	 * @param disks the disks to set
	 */
	public void setDisks(Disks disks) {
		this.disks = disks;
	}
	/**
	 * @return the networkAdapters
	 */
	public NetworkAdapters getNetworkAdapters() {
		return networkAdapters;
	}
	/**
	 * @param networkAdapters the networkAdapters to set
	 */
	public void setNetworkAdapters(NetworkAdapters networkAdapters) {
		this.networkAdapters = networkAdapters;
	}
	/**
	 * @return the recommendedSize
	 */
	public String getRecommendedSize() {
		return recommendedSize;
	}
	/**
	 * @param recommendedSize the recommendedSize to set
	 */
	public void setRecommendedSize(String recommendedSize) {
		this.recommendedSize = recommendedSize;
	}
	/**
	 * @return the numberOfCoresForRecommendedSize
	 */
	public Integer getNumberOfCoresForRecommendedSize() {
		return numberOfCoresForRecommendedSize;
	}
	/**
	 * @param numberOfCoresForRecommendedSize the numberOfCoresForRecommendedSize to set
	 */
	public void setNumberOfCoresForRecommendedSize(Integer numberOfCoresForRecommendedSize) {
		this.numberOfCoresForRecommendedSize = numberOfCoresForRecommendedSize;
	}
	/**
	 * @return the megabytesOfMemoryForRecommendedSize
	 */
	public Integer getMegabytesOfMemoryForRecommendedSize() {
		return megabytesOfMemoryForRecommendedSize;
	}
	/**
	 * @param megabytesOfMemoryForRecommendedSize the megabytesOfMemoryForRecommendedSize to set
	 */
	public void setMegabytesOfMemoryForRecommendedSize(Integer megabytesOfMemoryForRecommendedSize) {
		this.megabytesOfMemoryForRecommendedSize = megabytesOfMemoryForRecommendedSize;
	}
	/**
	 * @return the monthlyComputeCostForRecommendedSize
	 */
	public Integer getMonthlyComputeCostForRecommendedSize() {
		return monthlyComputeCostForRecommendedSize;
	}
	/**
	 * @param monthlyComputeCostForRecommendedSize the monthlyComputeCostForRecommendedSize to set
	 */
	public void setMonthlyComputeCostForRecommendedSize(Integer monthlyComputeCostForRecommendedSize) {
		this.monthlyComputeCostForRecommendedSize = monthlyComputeCostForRecommendedSize;
	}
	/**
	 * @return the percentageCoresUtilization
	 */
	public Double getPercentageCoresUtilization() {
		return percentageCoresUtilization;
	}
	/**
	 * @param percentageCoresUtilization the percentageCoresUtilization to set
	 */
	public void setPercentageCoresUtilization(Double percentageCoresUtilization) {
		this.percentageCoresUtilization = percentageCoresUtilization;
	}
	/**
	 * @return the percentageMemoryUtilization
	 */
	public Double getPercentageMemoryUtilization() {
		return percentageMemoryUtilization;
	}
	/**
	 * @param percentageMemoryUtilization the percentageMemoryUtilization to set
	 */
	public void setPercentageMemoryUtilization(Double percentageMemoryUtilization) {
		this.percentageMemoryUtilization = percentageMemoryUtilization;
	}
	/**
	 * @return the percentageCoresUtilizationDataPointsExpected
	 */
	public Integer getPercentageCoresUtilizationDataPointsExpected() {
		return percentageCoresUtilizationDataPointsExpected;
	}
	/**
	 * @param percentageCoresUtilizationDataPointsExpected the percentageCoresUtilizationDataPointsExpected to set
	 */
	public void setPercentageCoresUtilizationDataPointsExpected(Integer percentageCoresUtilizationDataPointsExpected) {
		this.percentageCoresUtilizationDataPointsExpected = percentageCoresUtilizationDataPointsExpected;
	}
	/**
	 * @return the percentageCoresUtilizationDataPointsReceived
	 */
	public Integer getPercentageCoresUtilizationDataPointsReceived() {
		return percentageCoresUtilizationDataPointsReceived;
	}
	/**
	 * @param percentageCoresUtilizationDataPointsReceived the percentageCoresUtilizationDataPointsReceived to set
	 */
	public void setPercentageCoresUtilizationDataPointsReceived(Integer percentageCoresUtilizationDataPointsReceived) {
		this.percentageCoresUtilizationDataPointsReceived = percentageCoresUtilizationDataPointsReceived;
	}
	/**
	 * @return the percentageMemoryUtilizationDataPointsExpected
	 */
	public Integer getPercentageMemoryUtilizationDataPointsExpected() {
		return percentageMemoryUtilizationDataPointsExpected;
	}
	/**
	 * @param percentageMemoryUtilizationDataPointsExpected the percentageMemoryUtilizationDataPointsExpected to set
	 */
	public void setPercentageMemoryUtilizationDataPointsExpected(Integer percentageMemoryUtilizationDataPointsExpected) {
		this.percentageMemoryUtilizationDataPointsExpected = percentageMemoryUtilizationDataPointsExpected;
	}
	/**
	 * @return the percentageMemoryUtilizationDataPointsReceived
	 */
	public Integer getPercentageMemoryUtilizationDataPointsReceived() {
		return percentageMemoryUtilizationDataPointsReceived;
	}
	/**
	 * @param percentageMemoryUtilizationDataPointsReceived the percentageMemoryUtilizationDataPointsReceived to set
	 */
	public void setPercentageMemoryUtilizationDataPointsReceived(Integer percentageMemoryUtilizationDataPointsReceived) {
		this.percentageMemoryUtilizationDataPointsReceived = percentageMemoryUtilizationDataPointsReceived;
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
	public String getDatacenterManagementServerName() {
		return datacenterManagementServerName;
	}
	public void setDatacenterManagementServerName(String datacenterManagementServerName) {
		this.datacenterManagementServerName = datacenterManagementServerName;
	}
	public String getDatacenterManagementServerArmId() {
		return datacenterManagementServerArmId;
	}
	public void setDatacenterManagementServerArmId(String datacenterManagementServerArmId) {
		this.datacenterManagementServerArmId = datacenterManagementServerArmId;
	}
	public String getOperatingSystemType() {
		return operatingSystemType;
	}
	public void setOperatingSystemType(String operatingSystemType) {
		this.operatingSystemType = operatingSystemType;
	}
	public String getOperatingSystemName() {
		return operatingSystemName;
	}
	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}
	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}
	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
	public Integer getMonthlyPremiumStorageCost() {
		return monthlyPremiumStorageCost;
	}
	public void setMonthlyPremiumStorageCost(Integer monthlyPremiumStorageCost) {
		this.monthlyPremiumStorageCost = monthlyPremiumStorageCost;
	}
	public Integer getMonthlyStandardSSDStorageCost() {
		return monthlyStandardSSDStorageCost;
	}
	public void setMonthlyStandardSSDStorageCost(Integer monthlyStandardSSDStorageCost) {
		this.monthlyStandardSSDStorageCost = monthlyStandardSSDStorageCost;
	}
	public Integer getConfidenceRatingInPercentage() {
		return confidenceRatingInPercentage;
	}
	public void setConfidenceRatingInPercentage(Integer confidenceRatingInPercentage) {
		this.confidenceRatingInPercentage = confidenceRatingInPercentage;
	}
	public String getSuitabilityDetail() {
		return suitabilityDetail;
	}
	public void setSuitabilityDetail(String suitabilityDetail) {
		this.suitabilityDetail = suitabilityDetail;
	}
	public String getOperatingSystemArchitecture() {
		return operatingSystemArchitecture;
	}
	public void setOperatingSystemArchitecture(String operatingSystemArchitecture) {
		this.operatingSystemArchitecture = operatingSystemArchitecture;
	}
   
}
