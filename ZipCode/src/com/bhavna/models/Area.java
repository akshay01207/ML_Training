package com.bhavna.models;

public class Area extends State {
	private String areaName;
	private String cityName;
	private int zipCode;

	public Area() {
		super();
	}

	public Area(String countryName, String stateName, String areaName, String cityName, int zipCode) {
		super(countryName, stateName);
		this.areaName = areaName;
		this.cityName = cityName;
		this.zipCode = zipCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "[areaName = " + areaName + ", cityName = " + cityName + ", zipCode = " + zipCode + ", StateName = "
				+ getStateName() + ", CountryName = " + getCountryName() + "]";
	}

}
