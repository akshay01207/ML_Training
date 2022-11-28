package com.bhavna.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bhavna.models.Area;

public class ZipServiceImplementation implements ZipServiceInterface {
	static List<Area> addressList = new ArrayList<Area>();

	public void addAddress() {
		// Creating Address
		Area address1 = new Area("India", "Haryana", "Gurgaon","Sector 20", 20011);
		Area address2 = new Area("India", "Uttar Pradesh", "Greater Noida","Kasna", 201308);
		Area address3 = new Area("India", "Uttar Pradesh", "Noida","Sector 62", 201301);
		Area address4 = new Area("India", "Delhi", "New Delhi","Vasant Vihar", 110010);
		Area address5 = new Area("India", "Himanchal Pradesh", "Shimla","new Shimla", 110011);

		addressList.add(address1);
		addressList.add(address2);
		addressList.add(address3);
		addressList.add(address4);
		addressList.add(address5);
	}

	public String searchAddress(int zip) {
		String zipCode = Integer.toString(zip);
		int zipLength = zipCode.length();
		if (zipLength <= 6) {
			for (int i = 0; i < addressList.size(); i++) {
				if (((Area) addressList.get(i)).getZipCode() == zip) {
					return addressList.get(i).toString();
				}
			}
			return "Not Found";
		}
		return "Invalid ZipCode";
	}

	public void setArea(String countryName, String stateName, String areaName, String cityName, int zipCode) {
		Area areaData = new Area(countryName, stateName, areaName, cityName, zipCode);
		addressList.add(areaData);
		for (Area data : addressList) {
			System.out.println(data);
		}
		System.out.println("Sucessfully Added");

	}

	public void printAll() {
		Iterator<Area> itr = addressList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
