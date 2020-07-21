package com.vodafone.azuremigration.migration.util;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties
@Validated
@PropertySource("classpath:application.properties")
public class ApplicationProperties {
	@NotEmpty
	private String subscriptionId;
	@NotEmpty
	private String grant_type;
	@NotEmpty
	private String client_id;
	@NotEmpty
	private String client_secret;
	@NotEmpty
	private String resource;
	@NotEmpty
	private String tenant_id;
	@NotEmpty
	private String api_version;
	@NotEmpty
	private String resourceGroupName;
	@NotEmpty
	private String projectName;
	@NotEmpty
	private String groupName;
	@NotEmpty
	private String assessmentName;
	@NotEmpty
	private String resourceGroup;
	@NotEmpty
	private String assessmentProject;
	
	public String getResourceGroup() {
		return resourceGroup;
	}
	public void setResourceGroup(String resourceGroup) {
		this.resourceGroup = resourceGroup;
	}
	public String getAssessmentProject() {
		return assessmentProject;
	}
	public void setAssessmentProject(String assessmentProject) {
		this.assessmentProject = assessmentProject;
	}
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getResourceGroupName() {
		return resourceGroupName;
	}
	public void setResourceGroupName(String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getAssessmentName() {
		return assessmentName;
	}
	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}
	
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(String tenant_id) {
		this.tenant_id = tenant_id;
	}
	public String getApi_version() {
		return api_version;
	}
	public void setApi_version(String api_version) {
		this.api_version = api_version;
	}
	@Override
	public String toString() {
		return "ApplicationProperties [subscriptionId=" + subscriptionId + ", grant_type=" + grant_type + ", client_id="
				+ client_id + ", client_secret=" + client_secret + ", resource=" + resource + ", tenant_id=" + tenant_id
				+ ", api_version=" + api_version + ", resourceGroupName=" + resourceGroupName + ", projectName="
				+ projectName + ", groupName=" + groupName + ", assessmentName=" + assessmentName + ", resourceGroup="
				+ resourceGroup + ", assessmentProject=" + assessmentProject + "]";
	}
}
