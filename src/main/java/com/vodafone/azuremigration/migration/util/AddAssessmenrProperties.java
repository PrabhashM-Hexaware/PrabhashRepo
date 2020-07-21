package com.vodafone.azuremigration.migration.util;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties
@Validated
@PropertySource("classpath:addAssessment.properties")
public class AddAssessmenrProperties {
	@NotEmpty
	private String eTag;
	@NotEmpty
	private String azureLocation;
	@NotEmpty
	private String azureOfferCode;
	@NotEmpty
	private String azurePricingTier;
	@NotEmpty
	private String azureStorageRedundancy;
	@NotNull
	private Double scalingFactor;
	@NotEmpty
	private String percentile;
	@NotEmpty
	private String timeRange;
	@NotEmpty
	private String stage;
	@NotEmpty
	private String currency;
	@NotEmpty
	private String azureHybridUseBenefit;
	@NotNull
	private Integer discountPercentage;
	@NotEmpty
	private String sizingCriterion;
	@NotNull
	private Integer daysPerMonth;
	@NotNull
    private Integer hoursPerDay;
	@NotEmpty
	private String azureDiskType;
	@NotEmpty
	private String reservedInstance;
	
	public String getAzureDiskType() {
		return azureDiskType;
	}

	public void setAzureDiskType(String azureDiskType) {
		this.azureDiskType = azureDiskType;
	}

	public String getReservedInstance() {
		return reservedInstance;
	}

	public void setReservedInstance(String reservedInstance) {
		this.reservedInstance = reservedInstance;
	}

	public String geteTag() {
		return eTag;
	}

	public void seteTag(String eTag) {
		this.eTag = eTag;
	}

	public String getAzureLocation() {
		return azureLocation;
	}

	public void setAzureLocation(String azureLocation) {
		this.azureLocation = azureLocation;
	}

	public String getAzureOfferCode() {
		return azureOfferCode;
	}

	public void setAzureOfferCode(String azureOfferCode) {
		this.azureOfferCode = azureOfferCode;
	}

	public String getAzurePricingTier() {
		return azurePricingTier;
	}

	public void setAzurePricingTier(String azurePricingTier) {
		this.azurePricingTier = azurePricingTier;
	}

	public String getAzureStorageRedundancy() {
		return azureStorageRedundancy;
	}

	public void setAzureStorageRedundancy(String azureStorageRedundancy) {
		this.azureStorageRedundancy = azureStorageRedundancy;
	}

	public Double getScalingFactor() {
		return scalingFactor;
	}

	public void setScalingFactor(Double scalingFactor) {
		this.scalingFactor = scalingFactor;
	}

	public String getPercentile() {
		return percentile;
	}

	public void setPercentile(String percentile) {
		this.percentile = percentile;
	}

	public String getTimeRange() {
		return timeRange;
	}

	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAzureHybridUseBenefit() {
		return azureHybridUseBenefit;
	}

	public void setAzureHybridUseBenefit(String azureHybridUseBenefit) {
		this.azureHybridUseBenefit = azureHybridUseBenefit;
	}

	public Integer getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Integer discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public String getSizingCriterion() {
		return sizingCriterion;
	}

	public void setSizingCriterion(String sizingCriterion) {
		this.sizingCriterion = sizingCriterion;
	}

	public Integer getDaysPerMonth() {
		return daysPerMonth;
	}

	public void setDaysPerMonth(Integer daysPerMonth) {
		this.daysPerMonth = daysPerMonth;
	}

	public Integer getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(Integer hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	@Override
	public String toString() {
		return "AddAssessmenrProperties [eTag=" + eTag + ", azureLocation=" + azureLocation + ", azureOfferCode="
				+ azureOfferCode + ", azurePricingTier=" + azurePricingTier + ", azureStorageRedundancy="
				+ azureStorageRedundancy + ", scalingFactor=" + scalingFactor + ", percentile=" + percentile
				+ ", timeRange=" + timeRange + ", stage=" + stage + ", currency=" + currency
				+ ", azureHybridUseBenefit=" + azureHybridUseBenefit + ", discountPercentage=" + discountPercentage
				+ ", sizingCriterion=" + sizingCriterion + ", daysPerMonth=" + daysPerMonth + ", hoursPerDay="
				+ hoursPerDay + ", azureDiskType=" + azureDiskType + ", reservedInstance=" + reservedInstance + "]";
	}

}
