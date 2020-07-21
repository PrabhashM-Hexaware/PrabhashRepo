
package com.vodafone.azuremigration.migration.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "miscellaneous",
    "GDP3PerMonth",
    "GDP1PerMonth",
    "payGDP"
})
public class AdditionalMachinesScopes {

    @JsonProperty("miscellaneous")
    private String miscellaneous;
    @JsonProperty("GDP3PerMonth")
    private Double gDP3PerMonth;
    @JsonProperty("GDP1PerMonth")
    private Double gDP1PerMonth;
    @JsonProperty("payGDP")
    private Double payGDP;
    
    @JsonProperty("miscellaneous")
    public String getMiscellaneous() {
        return miscellaneous;
    }

    @JsonProperty("miscellaneous")
    public void setMiscellaneous(String miscellaneous) {
        this.miscellaneous = miscellaneous;
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

    @JsonProperty("payGDP")
    public Double getPayGDP() {
        return payGDP;
    }

    @JsonProperty("payGDP")
    public void setPayGDP(Double payGDP) {
        this.payGDP = payGDP;
    }

}
