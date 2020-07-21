package com.vodafone.azuremigration.migration.model;

import lombok.Data;

@Data
public class AssessmentSuitabilitySummary {

    private String suitable;

	/**
	 * @return the suitable
	 */
	public String getSuitable() {
		return suitable;
	}

	/**
	 * @param suitable the suitable to set
	 */
	public void setSuitable(String suitable) {
		this.suitable = suitable;
	}
    

}