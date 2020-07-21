
package com.vodafone.azuremigration.migration.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberOfGroups",
    "numberOfMachines",
    "numberOfAssessments",
    "createdTimestamp",
    "updatedTimestamp",
    "discoveryStatus",
    "customerWorkspaceId",
    "customerWorkspaceLocation",
    "lastDiscoveryTimestamp",
    "lastDiscoverySessionId",
    "lastAssessmentTimestamp",
    "provisioningState"
})
public class ProjectProperties {

    @JsonProperty("numberOfGroups")
    private Integer numberOfGroups;
    @JsonProperty("numberOfMachines")
    private Integer numberOfMachines;
    @JsonProperty("numberOfAssessments")
    private Integer numberOfAssessments;
    @JsonProperty("createdTimestamp")
    private String createdTimestamp;
    @JsonProperty("updatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("discoveryStatus")
    private String discoveryStatus;
    @JsonProperty("customerWorkspaceId")
    private String customerWorkspaceId;
    @JsonProperty("customerWorkspaceLocation")
    private String customerWorkspaceLocation;
    @JsonProperty("lastDiscoveryTimestamp")
    private String lastDiscoveryTimestamp;
    @JsonProperty("lastDiscoverySessionId")
    private String lastDiscoverySessionId;
    @JsonProperty("lastAssessmentTimestamp")
    private String lastAssessmentTimestamp;
    @JsonProperty("provisioningState")
    private String provisioningState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numberOfGroups")
    public Integer getNumberOfGroups() {
        return numberOfGroups;
    }

    @JsonProperty("numberOfGroups")
    public void setNumberOfGroups(Integer numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @JsonProperty("numberOfMachines")
    public Integer getNumberOfMachines() {
        return numberOfMachines;
    }

    @JsonProperty("numberOfMachines")
    public void setNumberOfMachines(Integer numberOfMachines) {
        this.numberOfMachines = numberOfMachines;
    }

    @JsonProperty("numberOfAssessments")
    public Integer getNumberOfAssessments() {
        return numberOfAssessments;
    }

    @JsonProperty("numberOfAssessments")
    public void setNumberOfAssessments(Integer numberOfAssessments) {
        this.numberOfAssessments = numberOfAssessments;
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

    @JsonProperty("discoveryStatus")
    public String getDiscoveryStatus() {
        return discoveryStatus;
    }

    @JsonProperty("discoveryStatus")
    public void setDiscoveryStatus(String discoveryStatus) {
        this.discoveryStatus = discoveryStatus;
    }

    @JsonProperty("customerWorkspaceId")
    public String getCustomerWorkspaceId() {
        return customerWorkspaceId;
    }

    @JsonProperty("customerWorkspaceId")
    public void setCustomerWorkspaceId(String customerWorkspaceId) {
        this.customerWorkspaceId = customerWorkspaceId;
    }

    @JsonProperty("customerWorkspaceLocation")
    public String getCustomerWorkspaceLocation() {
        return customerWorkspaceLocation;
    }

    @JsonProperty("customerWorkspaceLocation")
    public void setCustomerWorkspaceLocation(String customerWorkspaceLocation) {
        this.customerWorkspaceLocation = customerWorkspaceLocation;
    }

    @JsonProperty("lastDiscoveryTimestamp")
    public String getLastDiscoveryTimestamp() {
        return lastDiscoveryTimestamp;
    }

    @JsonProperty("lastDiscoveryTimestamp")
    public void setLastDiscoveryTimestamp(String lastDiscoveryTimestamp) {
        this.lastDiscoveryTimestamp = lastDiscoveryTimestamp;
    }

    @JsonProperty("lastDiscoverySessionId")
    public String getLastDiscoverySessionId() {
        return lastDiscoverySessionId;
    }

    @JsonProperty("lastDiscoverySessionId")
    public void setLastDiscoverySessionId(String lastDiscoverySessionId) {
        this.lastDiscoverySessionId = lastDiscoverySessionId;
    }

    @JsonProperty("lastAssessmentTimestamp")
    public String getLastAssessmentTimestamp() {
        return lastAssessmentTimestamp;
    }

    @JsonProperty("lastAssessmentTimestamp")
    public void setLastAssessmentTimestamp(String lastAssessmentTimestamp) {
        this.lastAssessmentTimestamp = lastAssessmentTimestamp;
    }

    @JsonProperty("provisioningState")
    public String getProvisioningState() {
        return provisioningState;
    }

    @JsonProperty("provisioningState")
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
