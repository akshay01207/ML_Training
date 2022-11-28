package com.bhavna.main;

import java.util.Scanner;

import com.bhavna.services.ZipServiceImplementation;

public class ZipMain {

	public static void main(String[] args) {
		getAddress();
//		 setAddress();
//		printAddress();
	}

	public static void getAddress() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the zipcode : ");
			int zip = sc.nextInt();

			ZipServiceImplementation data = new ZipServiceImplementation();
			data.addAddress();
			System.out.println("Result is :\n" + data.searchAddress(zip));
		}
		catch(Exception e) {
			 System.out.println("Invalid Input Exception");
		}
	}

	public static void setAddress() {
		ZipServiceImplementation data = new ZipServiceImplementation();
		data.setArea("India", "Uttar Pradesh", "Bulandshahr", "Sikandrabad", 203205);
	}

	public static void printAddress() {
		ZipServiceImplementation data = new ZipServiceImplementation();

		System.out.println("All the Data Listed Here");
		data.addAddress();
		data.printAll();
	}

}
