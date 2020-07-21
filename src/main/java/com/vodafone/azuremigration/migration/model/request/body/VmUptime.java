
package com.vodafone.azuremigration.migration.model.request.body;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class VmUptime {

    
    private Integer daysPerMonth;
    
    private Integer hoursPerDay;
   
}
