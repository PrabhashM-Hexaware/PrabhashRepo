package com.vodafone.azuremigration.migration.model.project;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Properties {

	private List<String> registeredTools = null;
	
	/*
	 * public Properties() {
	 * 
	 * }
	 * 
	 * public List<String> getRegisteredTools() { return registeredTools; }
	 * 
	 * public void setRegisteredTools(List<String> registeredTools) {
	 * this.registeredTools = registeredTools; }
	 * 
	 */	
	 

}
