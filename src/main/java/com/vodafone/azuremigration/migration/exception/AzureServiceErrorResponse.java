package com.vodafone.azuremigration.migration.exception;



public class AzureServiceErrorResponse{
	
	private int errorCode;
	private String messageLink;
	
	public AzureServiceErrorResponse(){
		
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessageLink() {
		return messageLink;
	}
	public void setMessageLink(String messageLink) {
		this.messageLink = messageLink;
	}
	
	

}
