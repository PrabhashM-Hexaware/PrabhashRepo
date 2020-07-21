
package com.vodafone.azuremigration.migration.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "skuModal",
    "GBP3PerMonth",
    "GBP1PerMonth",
    "payGDP",
    "hybridGDP3PerMonth",
    "hybridGDP1PerMonth",
    "hybridpayGDP",
    "application",
    "GDP3PerMonth",
    "GDP1PerMonth"
})
public class AssessedMachinesCost {

    @JsonProperty("skuModal")
    private String skuModal;
    @JsonProperty("GBP3PerMonth")
    private Double gBP3PerMonth;
    @JsonProperty("GBP1PerMonth")
    private Double gBP1PerMonth;
    @JsonProperty("payGDP")
    private Double payGDP;
    @JsonProperty("hybridGDP3PerMonth")
    private Double hybridGDP3PerMonth;
    @JsonProperty("hybridGDP1PerMonth")
    private Double hybridGDP1PerMonth;
    @JsonProperty("hybridpayGDP")
    private Double hybridpayGDP;
    @JsonProperty("application")
    private String application;
    @JsonProperty("GDP3PerMonth")
    private Double gDP3PerMonth;
    @JsonProperty("GDP1PerMonth")
    private Double gDP1PerMonth;
    
    @JsonProperty("skuModal")
    public String getSkuModal() {
        return skuModal;
    }

    @JsonProperty("skuModal")
    public void setSkuModal(String skuModal) {
        this.skuModal = skuModal;
    }

    @JsonProperty("GBP3PerMonth")
    public Double getGBP3PerMonth() {
        return gBP3PerMonth;
    }

    @JsonProperty("GBP3PerMonth")
    public void setGBP3PerMonth(Double gBP3PerMonth) {
        this.gBP3PerMonth = gBP3PerMonth;
    }

    @JsonProperty("GBP1PerMonth")
    public Double getGBP1PerMonth() {
        return gBP1PerMonth;
    }

    @JsonProperty("GBP1PerMonth")
    public void setGBP1PerMonth(Double gBP1PerMonth) {
        this.gBP1PerMonth = gBP1PerMonth;
    }

    @JsonProperty("payGDP")
    public Double getPayGDP() {
        return payGDP;
    }

    @JsonProperty("payGDP")
    public void setPayGDP(Double payGDP) {
        this.payGDP = payGDP;
    }

    @JsonProperty("hybridGDP3PerMonth")
    public Double getHybridGDP3PerMonth() {
        return hybridGDP3PerMonth;
    }

    @JsonProperty("hybridGDP3PerMonth")
    public void setHybridGDP3PerMonth(Double hybridGDP3PerMonth) {
        this.hybridGDP3PerMonth = hybridGDP3PerMonth;
    }

    @JsonProperty("hybridGDP1PerMonth")
    public Double getHybridGDP1PerMonth() {
        return hybridGDP1PerMonth;
    }

    @JsonProperty("hybridGDP1PerMonth")
    public void setHybridGDP1PerMonth(Double hybridGDP1PerMonth) {
        this.hybridGDP1PerMonth = hybridGDP1PerMonth;
    }

    @JsonProperty("hybridpayGDP")
    public Double getHybridpayGDP() {
        return hybridpayGDP;
    }

    @JsonProperty("hybridpayGDP")
    public void setHybridpayGDP(Double hybridpayGDP) {
        this.hybridpayGDP = hybridpayGDP;
    }

    @JsonProperty("application")
    public String getApplication() {
        return application;
    }

    @JsonProperty("application")
    public void setApplication(String application) {
        this.application = application;
    }

    @JsonProperty("GDP3PerMonth")
    public Double getGDP3PerMonth() {
        return gDP3PerMonth;
    }

    @JsonProperty("GDP3PerMonth")
    public void setGDP3PerMonth(Double gDP3PerMonth) {
        this.gDP3PerMonth = gDP3PerMonth;
    }

    @JsonProperty("GDP1PerMonth")
    public Double getGDP1PerMonth() {
        return gDP1PerMonth;
    }

    @JsonProperty("GDP1PerMonth")
    public void setGDP1PerMonth(Double gDP1PerMonth) {
        this.gDP1PerMonth = gDP1PerMonth;
    }

}
