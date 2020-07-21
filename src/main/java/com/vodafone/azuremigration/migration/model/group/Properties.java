
package com.vodafone.azuremigration.migration.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "provisioningState"
})
public class Properties {

    @JsonProperty("provisioningState")
    private String provisioningState;
    
    @JsonProperty("provisioningState")
    public String getProvisioningState() {
        return provisioningState;
    }

    @JsonProperty("provisioningState")
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    
}
