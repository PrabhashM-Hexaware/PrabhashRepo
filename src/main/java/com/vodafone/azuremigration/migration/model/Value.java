package com.vodafone.azuremigration.migration.model;


import lombok.Data;

@Data
public class Value {
 
    private String id;
    
    private String name;
 
    private String eTag;
   
    private String type;
    
    private AssessedMachinesProperties properties;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the eTag
	 */
	public String geteTag() {
		return eTag;
	}

	/**
	 * @param eTag the eTag to set
	 */
	public void seteTag(String eTag) {
		this.eTag = eTag;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the properties
	 */
	public AssessedMachinesProperties getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(AssessedMachinesProperties properties) {
		this.properties = properties;
	}
    
  
}
