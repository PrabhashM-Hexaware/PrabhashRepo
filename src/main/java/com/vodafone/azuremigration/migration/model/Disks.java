package com.vodafone.azuremigration.migration.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Disks {
   
    private Scsi00 scsi00;

	/**
	 * @return the scsi00
	 */
	public Scsi00 getScsi00() {
		return scsi00;
	}

	/**
	 * @param scsi00 the scsi00 to set
	 */
	public void setScsi00(Scsi00 scsi00) {
		this.scsi00 = scsi00;
	}
   
    

   
}
