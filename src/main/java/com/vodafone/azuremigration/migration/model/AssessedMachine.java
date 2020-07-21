
package com.vodafone.azuremigration.migration.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "application",
    "IPAddress",
    "skuModal"
})
public class AssessedMachine {

    @JsonProperty("application")
    private String application;
    @JsonProperty("IPAddress")
    private List<String> iPAddress;
    @JsonProperty("skuModal")
    private String skuModal;
   
    @JsonProperty("application")
    public String getApplication() {
        return application;
    }

    @JsonProperty("application")
    public void setApplication(String application) {
        this.application = application;
    }

 

    @JsonProperty("skuModal")
    public String getSkuModal() {
        return skuModal;
    }

    @JsonProperty("skuModal")
    public void setSkuModal(String skuModal) {
        this.skuModal = skuModal;
    }

	public List<String> getiPAddress() {
		return iPAddress;
	}

	public void setiPAddress(List<String> iPAddress) {
		this.iPAddress = iPAddress;
	}

	
}
