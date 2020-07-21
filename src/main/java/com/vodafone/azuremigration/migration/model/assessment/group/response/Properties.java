
package com.vodafone.azuremigration.migration.model.assessment.group.response;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "groupStatus",
    "groupType",
    "machineCount",
    "assessments",
    "areAssessmentsRunning",
    "createdTimestamp",
    "updatedTimestamp"
})
public class Properties {

    @JsonProperty("groupStatus")
    private String groupStatus;
    @JsonProperty("groupType")
    private String groupType;
    @JsonProperty("machineCount")
    private Integer machineCount;
    @JsonProperty("assessments")
    private List<Object> assessments = null;
    @JsonProperty("areAssessmentsRunning")
    private Boolean areAssessmentsRunning;
    @JsonProperty("createdTimestamp")
    private String createdTimestamp;
    @JsonProperty("updatedTimestamp")
    private String updatedTimestamp;
   
    @JsonProperty("groupStatus")
    public String getGroupStatus() {
        return groupStatus;
    }

    @JsonProperty("groupStatus")
    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    @JsonProperty("groupType")
    public String getGroupType() {
        return groupType;
    }

    @JsonProperty("groupType")
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    @JsonProperty("machineCount")
    public Integer getMachineCount() {
        return machineCount;
    }

    @JsonProperty("machineCount")
    public void setMachineCount(Integer machineCount) {
        this.machineCount = machineCount;
    }

    @JsonProperty("assessments")
    public List<Object> getAssessments() {
        return assessments;
    }

    @JsonProperty("assessments")
    public void setAssessments(List<Object> assessments) {
        this.assessments = assessments;
    }

    @JsonProperty("areAssessmentsRunning")
    public Boolean getAreAssessmentsRunning() {
        return areAssessmentsRunning;
    }

    @JsonProperty("areAssessmentsRunning")
    public void setAreAssessmentsRunning(Boolean areAssessmentsRunning) {
        this.areAssessmentsRunning = areAssessmentsRunning;
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

}
