package com.vodafone.azuremigration.migration.util;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties
@Validated
@PropertySource("classpath:project.properties")
public class ProjectProperties {
	
	@NotEmpty
	private String project_etag;
	@NotEmpty
	private String project_location;
	@NotEmpty
	private String project_registeredTools;
	@NotEmpty
	private String project_additionalProperties;
	@NotEmpty
	private String resource_group_location;
	public String getProject_etag() {
		return project_etag;
	}
	public void setProject_etag(String project_etag) {
		this.project_etag = project_etag;
	}
	public String getProject_location() {
		return project_location;
	}
	public void setProject_location(String project_location) {
		this.project_location = project_location;
	}
	public String getProject_registeredTools() {
		return project_registeredTools;
	}
	public void setProject_registeredTools(String project_registeredTools) {
		this.project_registeredTools = project_registeredTools;
	}
	public String getProject_additionalProperties() {
		return project_additionalProperties;
	}
	public void setProject_additionalProperties(String project_additionalProperties) {
		this.project_additionalProperties = project_additionalProperties;
	}
	public String getResource_group_location() {
		return resource_group_location;
	}
	public void setResource_group_location(String resource_group_location) {
		this.resource_group_location = resource_group_location;
	}
	@Override
	public String toString() {
		return "ProjectProperties [project_etag=" + project_etag + ", project_location=" + project_location
				+ ", project_registeredTools=" + project_registeredTools + ", project_additionalProperties="
				+ project_additionalProperties + ", resource_group_location=" + resource_group_location + "]";
	}
	
	

}
