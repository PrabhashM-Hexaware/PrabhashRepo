package com.vodafone.azuremigration.migration.model;

import lombok.Data;

@Data
public class AssessmentVMUptime {

    private String daysPerMonth;
    /**
	 * @return the hoursPerDay
	 */
	public String getHoursPerDay() {
		return hoursPerDay;
	}
	/**
	 * @param hoursPerDay the hoursPerDay to set
	 */
	public void setHoursPerDay(String hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}
	private String hoursPerDay;
	/**
	 * @return the daysPerMonth
	 */
	public String getDaysPerMonth() {
		return daysPerMonth;
	}
	/**
	 * @param daysPerMonth the daysPerMonth to set
	 */
	public void setDaysPerMonth(String daysPerMonth) {
		this.daysPerMonth = daysPerMonth;
	}   

}