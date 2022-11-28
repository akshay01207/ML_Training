package com.bhavna.services;

public interface ZipServiceInterface {
	
	public void addAddress();

	public String searchAddress(int zip);

	public void setArea(String countryName, String stateName, String areaName, String cityName, int zipCode);

	public void printAll();
}
