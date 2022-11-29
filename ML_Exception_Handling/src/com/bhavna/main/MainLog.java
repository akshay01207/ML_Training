package com.bhavna.main;

import com.bhavna.services.FileReader;
import com.bhavna.services.MapData;

public class MainLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader=new FileReader();
		MapData mapData=fileReader.readFile("C:\\Users\\akshay.kumar\\Documents\\ML Training\\a.txt");
		mapData.display();

	}

}