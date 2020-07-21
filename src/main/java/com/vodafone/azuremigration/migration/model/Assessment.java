
package com.vodafone.azuremigration.migration.model;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "priceAsOn",
    "AssessedMachines",
    "AssessedMachinesCosts",
    "AdditionalMachinesScopes"
})
public class Assessment {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("priceAsOn")
    private String priceAsOn;
    @JsonProperty("AssessedMachines")
    private List<AssessedMachine> assessedMachines = null;
    @JsonProperty("AssessedMachinesCosts")
    private List<AssessedMachinesCost> assessedMachinesCosts = null;
    @JsonProperty("AdditionalMachinesScopes")
    private AdditionalMachinesScopes additionalMachinesScopes;
    
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("priceAsOn")
    public String getPriceAsOn() {
        return priceAsOn;
    }

    @JsonProperty("priceAsOn")
    public void setPriceAsOn(String priceAsOn) {
        this.priceAsOn = priceAsOn;
    }

    @JsonProperty("AssessedMachines")
    public List<AssessedMachine> getAssessedMachines() {
        return assessedMachines;
    }

    @JsonProperty("AssessedMachines")
    public void setAssessedMachines(List<AssessedMachine> assessedMachines) {
        this.assessedMachines = assessedMachines;
    }

    @JsonProperty("AssessedMachinesCosts")
    public List<AssessedMachinesCost> getAssessedMachinesCosts() {
        return assessedMachinesCosts;
    }

    @JsonProperty("AssessedMachinesCosts")
    public void setAssessedMachinesCosts(List<AssessedMachinesCost> assessedMachinesCosts) {
        this.assessedMachinesCosts = assessedMachinesCosts;
    }

    @JsonProperty("AdditionalMachinesScopes")
    public AdditionalMachinesScopes getAdditionalMachinesScopes() {
        return additionalMachinesScopes;
    }

    @JsonProperty("AdditionalMachinesScopes")
    public void setAdditionalMachinesScopes(AdditionalMachinesScopes additionalMachinesScopes) {
        this.additionalMachinesScopes = additionalMachinesScopes;
    }

}
