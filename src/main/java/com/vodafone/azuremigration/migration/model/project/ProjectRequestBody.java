package com.vodafone.azuremigration.migration.model.project;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class ProjectRequestBody {

	private String eTag;

	private String location;

	private Properties properties;

	private Tags tags;

	/*
	 * public String getETag() { return eTag; }
	 * 
	 * public void setETag(String eTag) { this.eTag = eTag; }
	 * 
	 * public String getLocation() { return location; }
	 * 
	 * public void setLocation(String location) { this.location = location; }
	 * 
	 * public Properties getProperties() { return properties; }
	 * 
	 * public void setProperties(Properties properties) { this.properties =
	 * properties; }
	 * 
	 * public Tags getTags() { return tags; }
	 * 
	 * public void setTags(Tags tags) { this.tags = tags; }
	 */

}
