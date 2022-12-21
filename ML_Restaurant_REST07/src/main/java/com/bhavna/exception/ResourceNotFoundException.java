package com.bhavna.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus()
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 8742231533992207116L;
	private String resourceName;
	private String fieldName;
	private long fieldValue;

	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue)); // Post not found
																									// with id : 1
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public long getFieldValue() {
		return fieldValue;
	}
}
