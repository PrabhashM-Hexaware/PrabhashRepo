package com.vodafone.azuremigration.migration.model;

import java.util.List;

import lombok.Data;

@Data
public class Properties {

    private String azureLocation;
    private String azureOfferCode;
    private String eaSubscriptionId;
    private String azurePricingTier;
    private String azureStorageRedundancy;
    private String scalingFactor;
    private String percentile;
    private String timeRange;
    private String perfDataStartTime;
    private String perfDataEndTime;
    private String stage;
    private String currency;
    private String reservedInstance;
    private String azureHybridUseBenefit;
    private String discountPercentage;
    private String confidenceRatingInPercentage;
    private String sizingCriterion;
    private String azureDiskType;
    private List<String> azureVmFamilies;
    private String pricesTimestamp;
    private String createdTimestamp;
    private String updatedTimestamp;
    private String monthlyComputeCost;
    private String monthlyBandwidthCost;
    private String monthlyStorageCost;
    private String monthlyPremiumStorageCost;
    private String monthlyStandardSSDStorageCost;
    private String status;
    private String numberOfMachines;
    private String groupType;
    private AssessmentVMUptime vmUptime;
    private AssessmentSuitabilitySummary suitabilitySummary;
	
	/**
	 * @return the azureOfferCode
	 */
	public String getAzureOfferCode() {
		return azureOfferCode;
	}
	/**
	 * @param azureOfferCode the azureOfferCode to set
	 */
	public void setAzureOfferCode(String azureOfferCode) {
		this.azureOfferCode = azureOfferCode;
	}
	/**
	 * @return the eaSubscriptionId
	 */
	public String getEaSubscriptionId() {
		return eaSubscriptionId;
	}
	/**
	 * @param eaSubscriptionId the eaSubscriptionId to set
	 */
	public void setEaSubscriptionId(String eaSubscriptionId) {
		this.eaSubscriptionId = eaSubscriptionId;
	}
	/**
	 * @return the azureLocation
	 */
	public String getAzureLocation() {
		return azureLocation;
	}
	/**
	 * @param azureLocation the azureLocation to set
	 */
	public void setAzureLocation(String azureLocation) {
		this.azureLocation = azureLocation;
	}
	/**
	 * @return the azurePricingTier
	 */
	public String getAzurePricingTier() {
		return azurePricingTier;
	}
	/**
	 * @param azurePricingTier the azurePricingTier to set
	 */
	public void setAzurePricingTier(String azurePricingTier) {
		this.azurePricingTier = azurePricingTier;
	}
	/**
	 * @return the azureStorageRedundancy
	 */
	public String getAzureStorageRedundancy() {
		return azureStorageRedundancy;
	}
	/**
	 * @param azureStorageRedundancy the azureStorageRedundancy to set
	 */
	public void setAzureStorageRedundancy(String azureStorageRedundancy) {
		this.azureStorageRedundancy = azureStorageRedundancy;
	}
	/**
	 * @return the scalingFactor
	 */
	public String getScalingFactor() {
		return scalingFactor;
	}
	/**
	 * @param scalingFactor the scalingFactor to set
	 */
	public void setScalingFactor(String scalingFactor) {
		this.scalingFactor = scalingFactor;
	}
	/**
	 * @return the percentile
	 */
	public String getPercentile() {
		return percentile;
	}
	/**
	 * @param percentile the percentile to set
	 */
	public void setPercentile(String percentile) {
		this.percentile = percentile;
	}
	/**
	 * @return the timeRange
	 */
	public String getTimeRange() {
		return timeRange;
	}
	/**
	 * @param timeRange the timeRange to set
	 */
	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}
	/**
	 * @return the perfDataStartTime
	 */
	public String getPerfDataStartTime() {
		return perfDataStartTime;
	}
	/**
	 * @param perfDataStartTime the perfDataStartTime to set
	 */
	public void setPerfDataStartTime(String perfDataStartTime) {
		this.perfDataStartTime = perfDataStartTime;
	}
	/**
	 * @return the perfDataEndTime
	 */
	public String getPerfDataEndTime() {
		return perfDataEndTime;
	}
	/**
	 * @param perfDataEndTime the perfDataEndTime to set
	 */
	public void setPerfDataEndTime(String perfDataEndTime) {
		this.perfDataEndTime = perfDataEndTime;
	}
	/**
	 * @return the stage
	 */
	public String getStage() {
		return stage;
	}
	/**
	 * @param stage the stage to set
	 */
	public void setStage(String stage) {
		this.stage = stage;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the reservedInstance
	 */
	public String getReservedInstance() {
		return reservedInstance;
	}
	/**
	 * @param reservedInstance the reservedInstance to set
	 */
	public void setReservedInstance(String reservedInstance) {
		this.reservedInstance = reservedInstance;
	}
	/**
	 * @return the azureHybridUseBenefit
	 */
	public String getAzureHybridUseBenefit() {
		return azureHybridUseBenefit;
	}
	/**
	 * @param azureHybridUseBenefit the azureHybridUseBenefit to set
	 */
	public void setAzureHybridUseBenefit(String azureHybridUseBenefit) {
		this.azureHybridUseBenefit = azureHybridUseBenefit;
	}
	/**
	 * @return the discountPercentage
	 */
	public String getDiscountPercentage() {
		return discountPercentage;
	}
	/**
	 * @return the suitabilitySummary
	 */
	public AssessmentSuitabilitySummary getSuitabilitySummary() {
		return suitabilitySummary;
	}
	/**
	 * @param suitabilitySummary the suitabilitySummary to set
	 */
	public void setSuitabilitySummary(AssessmentSuitabilitySummary suitabilitySummary) {
		this.suitabilitySummary = suitabilitySummary;
	}
	/**
	 * @param discountPercentage the discountPercentage to set
	 */
	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	/**
	 * @return the confidenceRatingInPercentage
	 */
	public String getConfidenceRatingInPercentage() {
		return confidenceRatingInPercentage;
	}
	/**
	 * @param confidenceRatingInPercentage the confidenceRatingInPercentage to set
	 */
	public void setConfidenceRatingInPercentage(String confidenceRatingInPercentage) {
		this.confidenceRatingInPercentage = confidenceRatingInPercentage;
	}
	/**
	 * @return the sizingCriterion
	 */
	public String getSizingCriterion() {
		return sizingCriterion;
	}
	/**
	 * @param sizingCriterion the sizingCriterion to set
	 */
	public void setSizingCriterion(String sizingCriterion) {
		this.sizingCriterion = sizingCriterion;
	}
	/**
	 * @return the azureDiskType
	 */
	public String getAzureDiskType() {
		return azureDiskType;
	}
	/**
	 * @param azureDiskType the azureDiskType to set
	 */
	public void setAzureDiskType(String azureDiskType) {
		this.azureDiskType = azureDiskType;
	}
	/**
	 * @return the azureVmFamilies
	 */
	public List<String> getAzureVmFamilies() {
		return azureVmFamilies;
	}
	/**
	 * @param azureVmFamilies the azureVmFamilies to set
	 */
	public void setAzureVmFamilies(List<String> azureVmFamilies) {
		this.azureVmFamilies = azureVmFamilies;
	}
	/**
	 * @return the pricesTimestamp
	 */
	public String getPricesTimestamp() {
		return pricesTimestamp;
	}
	/**
	 * @param pricesTimestamp the pricesTimestamp to set
	 */
	public void setPricesTimestamp(String pricesTimestamp) {
		this.pricesTimestamp = pricesTimestamp;
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
	 * @return the monthlyComputeCost
	 */
	public String getMonthlyComputeCost() {
		return monthlyComputeCost;
	}
	/**
	 * @param monthlyComputeCost the monthlyComputeCost to set
	 */
	public void setMonthlyComputeCost(String monthlyComputeCost) {
		this.monthlyComputeCost = monthlyComputeCost;
	}
	/**
	 * @return the monthlyBandwidthCost
	 */
	public String getMonthlyBandwidthCost() {
		return monthlyBandwidthCost;
	}
	/**
	 * @param monthlyBandwidthCost the monthlyBandwidthCost to set
	 */
	public void setMonthlyBandwidthCost(String monthlyBandwidthCost) {
		this.monthlyBandwidthCost = monthlyBandwidthCost;
	}
	/**
	 * @return the monthlyStorageCost
	 */
	public String getMonthlyStorageCost() {
		return monthlyStorageCost;
	}
	/**
	 * @param monthlyStorageCost the monthlyStorageCost to set
	 */
	public void setMonthlyStorageCost(String monthlyStorageCost) {
		this.monthlyStorageCost = monthlyStorageCost;
	}
	/**
	 * @return the monthlyPremiumStorageCost
	 */
	public String getMonthlyPremiumStorageCost() {
		return monthlyPremiumStorageCost;
	}
	/**
	 * @param monthlyPremiumStorageCost the monthlyPremiumStorageCost to set
	 */
	public void setMonthlyPremiumStorageCost(String monthlyPremiumStorageCost) {
		this.monthlyPremiumStorageCost = monthlyPremiumStorageCost;
	}
	/**
	 * @return the monthlyStandardSSDStorageCost
	 */
	public String getMonthlyStandardSSDStorageCost() {
		return monthlyStandardSSDStorageCost;
	}
	/**
	 * @param monthlyStandardSSDStorageCost the monthlyStandardSSDStorageCost to set
	 */
	public void setMonthlyStandardSSDStorageCost(String monthlyStandardSSDStorageCost) {
		this.monthlyStandardSSDStorageCost = monthlyStandardSSDStorageCost;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the numberOfMachines
	 */
	public String getNumberOfMachines() {
		return numberOfMachines;
	}
	/**
	 * @param numberOfMachines the numberOfMachines to set
	 */
	public void setNumberOfMachines(String numberOfMachines) {
		this.numberOfMachines = numberOfMachines;
	}
	/**
	 * @return the groupType
	 */
	public String getGroupType() {
		return groupType;
	}
	/**
	 * @param groupType the groupType to set
	 */
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	/**
	 * @return the vmUptime
	 */
	public AssessmentVMUptime getVmUptime() {
		return vmUptime;
	}
	/**
	 * @param vmUptime the vmUptime to set
	 */
	public void setVmUptime(AssessmentVMUptime vmUptime) {
		this.vmUptime = vmUptime;
	}
    
}