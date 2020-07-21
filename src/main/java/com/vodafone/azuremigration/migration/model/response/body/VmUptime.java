
package com.vodafone.azuremigration.migration.model.response.body;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "daysPerMonth",
    "hoursPerDay"
})
public class VmUptime {

    @JsonProperty("daysPerMonth")
    private Integer daysPerMonth;
    @JsonProperty("hoursPerDay")
    private Integer hoursPerDay;
    
    @JsonProperty("daysPerMonth")
    public Integer getDaysPerMonth() {
        return daysPerMonth;
    }

    @JsonProperty("daysPerMonth")
    public void setDaysPerMonth(Integer daysPerMonth) {
        this.daysPerMonth = daysPerMonth;
    }

    @JsonProperty("hoursPerDay")
    public Integer getHoursPerDay() {
        return hoursPerDay;
    }

    @JsonProperty("hoursPerDay")
    public void setHoursPerDay(Integer hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

}
