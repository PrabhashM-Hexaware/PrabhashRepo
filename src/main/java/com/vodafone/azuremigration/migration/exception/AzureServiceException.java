package com.vodafone.azuremigration.migration.exception;

public class AzureServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1034395805318812779L;
	
	private String errorMessage;
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public AzureServiceException(String errorMessage){
		super(errorMessage);
		this.errorMessage=errorMessage;
	}
	
	public AzureServiceException(){
		
		super();
	}

}
