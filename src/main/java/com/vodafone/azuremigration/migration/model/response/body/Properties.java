
package com.vodafone.azuremigration.migration.model.response.body;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "azureLocation",
    "azureOfferCode",
    "eaSubscriptionId",
    "azurePricingTier",
    "azureStorageRedundancy",
    "scalingFactor",
    "percentile",
    "timeRange",
    "perfDataStartTime",
    "perfDataEndTime",
    "stage",
    "currency",
    "reservedInstance",
    "azureHybridUseBenefit",
    "discountPercentage",
    "confidenceRatingInPercentage",
    "sizingCriterion",
    "azureDiskType",
    "azureVmFamilies",
    "vmUptime",
    "pricesTimestamp",
    "createdTimestamp",
    "updatedTimestamp",
    "monthlyComputeCost",
    "monthlyBandwidthCost",
    "monthlyStorageCost",
    "monthlyPremiumStorageCost",
    "monthlyStandardSSDStorageCost",
    "suitabilitySummary",
    "status",
    "numberOfMachines",
    "groupType"
})
public class Properties {

    @JsonProperty("azureLocation")
    private String azureLocation;
    @JsonProperty("azureOfferCode")
    private String azureOfferCode;
    @JsonProperty("eaSubscriptionId")
    private Object eaSubscriptionId;
    @JsonProperty("azurePricingTier")
    private String azurePricingTier;
    @JsonProperty("azureStorageRedundancy")
    private String azureStorageRedundancy;
    @JsonProperty("scalingFactor")
    private Double scalingFactor;
    @JsonProperty("percentile")
    private String percentile;
    @JsonProperty("timeRange")
    private String timeRange;
    @JsonProperty("perfDataStartTime")
    private String perfDataStartTime;
    @JsonProperty("perfDataEndTime")
    private String perfDataEndTime;
    @JsonProperty("stage")
    private String stage;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("reservedInstance")
    private String reservedInstance;
    @JsonProperty("azureHybridUseBenefit")
    private String azureHybridUseBenefit;
    @JsonProperty("discountPercentage")
    private Double discountPercentage;
    @JsonProperty("confidenceRatingInPercentage")
    private Object confidenceRatingInPercentage;
    @JsonProperty("sizingCriterion")
    private String sizingCriterion;
    @JsonProperty("azureDiskType")
    private String azureDiskType;
    @JsonProperty("azureVmFamilies")
    private List<Object> azureVmFamilies = null;
    @JsonProperty("vmUptime")
    private VmUptime vmUptime;
    @JsonProperty("pricesTimestamp")
    private String pricesTimestamp;
    @JsonProperty("createdTimestamp")
    private String createdTimestamp;
    @JsonProperty("updatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("monthlyComputeCost")
    private Double monthlyComputeCost;
    @JsonProperty("monthlyBandwidthCost")
    private Double monthlyBandwidthCost;
    @JsonProperty("monthlyStorageCost")
    private Double monthlyStorageCost;
    @JsonProperty("monthlyPremiumStorageCost")
    private Double monthlyPremiumStorageCost;
    @JsonProperty("monthlyStandardSSDStorageCost")
    private Double monthlyStandardSSDStorageCost;
    @JsonProperty("suitabilitySummary")
    private SuitabilitySummary suitabilitySummary;
    @JsonProperty("status")
    private String status;
    @JsonProperty("numberOfMachines")
    private Integer numberOfMachines;
    @JsonProperty("groupType")
    private String groupType;
   
    @JsonProperty("azureLocation")
    public String getAzureLocation() {
        return azureLocation;
    }

    @JsonProperty("azureLocation")
    public void setAzureLocation(String azureLocation) {
        this.azureLocation = azureLocation;
    }

    @JsonProperty("azureOfferCode")
    public String getAzureOfferCode() {
        return azureOfferCode;
    }

    @JsonProperty("azureOfferCode")
    public void setAzureOfferCode(String azureOfferCode) {
        this.azureOfferCode = azureOfferCode;
    }

    @JsonProperty("eaSubscriptionId")
    public Object getEaSubscriptionId() {
        return eaSubscriptionId;
    }

    @JsonProperty("eaSubscriptionId")
    public void setEaSubscriptionId(Object eaSubscriptionId) {
        this.eaSubscriptionId = eaSubscriptionId;
    }

    @JsonProperty("azurePricingTier")
    public String getAzurePricingTier() {
        return azurePricingTier;
    }

    @JsonProperty("azurePricingTier")
    public void setAzurePricingTier(String azurePricingTier) {
        this.azurePricingTier = azurePricingTier;
    }

    @JsonProperty("azureStorageRedundancy")
    public String getAzureStorageRedundancy() {
        return azureStorageRedundancy;
    }

    @JsonProperty("azureStorageRedundancy")
    public void setAzureStorageRedundancy(String azureStorageRedundancy) {
        this.azureStorageRedundancy = azureStorageRedundancy;
    }

    @JsonProperty("scalingFactor")
    public Double getScalingFactor() {
        return scalingFactor;
    }

    @JsonProperty("scalingFactor")
    public void setScalingFactor(Double scalingFactor) {
        this.scalingFactor = scalingFactor;
    }

    @JsonProperty("percentile")
    public String getPercentile() {
        return percentile;
    }

    @JsonProperty("percentile")
    public void setPercentile(String percentile) {
        this.percentile = percentile;
    }

    @JsonProperty("timeRange")
    public String getTimeRange() {
        return timeRange;
    }

    @JsonProperty("timeRange")
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    @JsonProperty("perfDataStartTime")
    public String getPerfDataStartTime() {
        return perfDataStartTime;
    }

    @JsonProperty("perfDataStartTime")
    public void setPerfDataStartTime(String perfDataStartTime) {
        this.perfDataStartTime = perfDataStartTime;
    }

    @JsonProperty("perfDataEndTime")
    public String getPerfDataEndTime() {
        return perfDataEndTime;
    }

    @JsonProperty("perfDataEndTime")
    public void setPerfDataEndTime(String perfDataEndTime) {
        this.perfDataEndTime = perfDataEndTime;
    }

    @JsonProperty("stage")
    public String getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(String stage) {
        this.stage = stage;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("reservedInstance")
    public String getReservedInstance() {
        return reservedInstance;
    }

    @JsonProperty("reservedInstance")
    public void setReservedInstance(String reservedInstance) {
        this.reservedInstance = reservedInstance;
    }

    @JsonProperty("azureHybridUseBenefit")
    public String getAzureHybridUseBenefit() {
        return azureHybridUseBenefit;
    }

    @JsonProperty("azureHybridUseBenefit")
    public void setAzureHybridUseBenefit(String azureHybridUseBenefit) {
        this.azureHybridUseBenefit = azureHybridUseBenefit;
    }

    @JsonProperty("discountPercentage")
    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    @JsonProperty("discountPercentage")
    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @JsonProperty("confidenceRatingInPercentage")
    public Object getConfidenceRatingInPercentage() {
        return confidenceRatingInPercentage;
    }

    @JsonProperty("confidenceRatingInPercentage")
    public void setConfidenceRatingInPercentage(Object confidenceRatingInPercentage) {
        this.confidenceRatingInPercentage = confidenceRatingInPercentage;
    }

    @JsonProperty("sizingCriterion")
    public String getSizingCriterion() {
        return sizingCriterion;
    }

    @JsonProperty("sizingCriterion")
    public void setSizingCriterion(String sizingCriterion) {
        this.sizingCriterion = sizingCriterion;
    }

    @JsonProperty("azureDiskType")
    public String getAzureDiskType() {
        return azureDiskType;
    }

    @JsonProperty("azureDiskType")
    public void setAzureDiskType(String azureDiskType) {
        this.azureDiskType = azureDiskType;
    }

    @JsonProperty("azureVmFamilies")
    public List<Object> getAzureVmFamilies() {
        return azureVmFamilies;
    }

    @JsonProperty("azureVmFamilies")
    public void setAzureVmFamilies(List<Object> azureVmFamilies) {
        this.azureVmFamilies = azureVmFamilies;
    }

    @JsonProperty("vmUptime")
    public VmUptime getVmUptime() {
        return vmUptime;
    }

    @JsonProperty("vmUptime")
    public void setVmUptime(VmUptime vmUptime) {
        this.vmUptime = vmUptime;
    }

    @JsonProperty("pricesTimestamp")
    public String getPricesTimestamp() {
        return pricesTimestamp;
    }

    @JsonProperty("pricesTimestamp")
    public void setPricesTimestamp(String pricesTimestamp) {
        this.pricesTimestamp = pricesTimestamp;
    }

    @JsonProperty("createdTimestamp")
    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    @JsonProperty("createdTimestamp")
    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @JsonProperty("updatedTimestamp")
    public String getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    @JsonProperty("updatedTimestamp")
    public void setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    @JsonProperty("monthlyComputeCost")
    public Double getMonthlyComputeCost() {
        return monthlyComputeCost;
    }

    @JsonProperty("monthlyComputeCost")
    public void setMonthlyComputeCost(Double monthlyComputeCost) {
        this.monthlyComputeCost = monthlyComputeCost;
    }

    @JsonProperty("monthlyBandwidthCost")
    public Double getMonthlyBandwidthCost() {
        return monthlyBandwidthCost;
    }

    @JsonProperty("monthlyBandwidthCost")
    public void setMonthlyBandwidthCost(Double monthlyBandwidthCost) {
        this.monthlyBandwidthCost = monthlyBandwidthCost;
    }

    @JsonProperty("monthlyStorageCost")
    public Double getMonthlyStorageCost() {
        return monthlyStorageCost;
    }

    @JsonProperty("monthlyStorageCost")
    public void setMonthlyStorageCost(Double monthlyStorageCost) {
        this.monthlyStorageCost = monthlyStorageCost;
    }

    @JsonProperty("monthlyPremiumStorageCost")
    public Double getMonthlyPremiumStorageCost() {
        return monthlyPremiumStorageCost;
    }

    @JsonProperty("monthlyPremiumStorageCost")
    public void setMonthlyPremiumStorageCost(Double monthlyPremiumStorageCost) {
        this.monthlyPremiumStorageCost = monthlyPremiumStorageCost;
    }

    @JsonProperty("monthlyStandardSSDStorageCost")
    public Double getMonthlyStandardSSDStorageCost() {
        return monthlyStandardSSDStorageCost;
    }

    @JsonProperty("monthlyStandardSSDStorageCost")
    public void setMonthlyStandardSSDStorageCost(Double monthlyStandardSSDStorageCost) {
        this.monthlyStandardSSDStorageCost = monthlyStandardSSDStorageCost;
    }

    @JsonProperty("suitabilitySummary")
    public SuitabilitySummary getSuitabilitySummary() {
        return suitabilitySummary;
    }

    @JsonProperty("suitabilitySummary")
    public void setSuitabilitySummary(SuitabilitySummary suitabilitySummary) {
        this.suitabilitySummary = suitabilitySummary;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("numberOfMachines")
    public Integer getNumberOfMachines() {
        return numberOfMachines;
    }

    @JsonProperty("numberOfMachines")
    public void setNumberOfMachines(Integer numberOfMachines) {
        this.numberOfMachines = numberOfMachines;
    }

    @JsonProperty("groupType")
    public String getGroupType() {
        return groupType;
    }

    @JsonProperty("groupType")
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

}
