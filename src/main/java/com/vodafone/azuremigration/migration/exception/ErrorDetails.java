package com.vodafone.azuremigration.migration.exception;

import org.springframework.http.HttpStatus;

public class ErrorDetails  {
	String message;
	HttpStatus code;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getCode() {
		return code;
	}
	public void setCode(HttpStatus code) {
		this.code = code;
  }
  public ErrorDetails(HttpStatus status, String message) {
    this.code = status;
    this.message = message;
  }
}
