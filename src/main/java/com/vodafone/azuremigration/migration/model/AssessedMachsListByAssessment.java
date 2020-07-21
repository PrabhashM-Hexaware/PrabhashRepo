
package com.vodafone.azuremigration.migration.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class AssessedMachsListByAssessment {

private List<Value> value;
@JsonIgnore
private String nextLink;


/**
 * @return the value
 */
public List<Value> getValue() {
	return value;
}

/**
 * @param value the value to set
 */
public void setValue(List<Value> value) {
	this.value = value;
}
}
