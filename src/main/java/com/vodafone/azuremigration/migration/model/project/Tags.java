
package com.vodafone.azuremigration.migration.model.project;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Tags {

	private String additionalProperties;
	
	/*
	 * public Tags() {
	 * 
	 * }
	 * 
	 * public String getAdditionalProperties() { return additionalProperties; }
	 * 
	 * public void setAdditionalProperty(String additionalProperties) {
	 * this.additionalProperties = additionalProperties; }
	 */

}
