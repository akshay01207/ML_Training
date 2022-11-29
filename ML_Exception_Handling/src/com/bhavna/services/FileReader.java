package com.bhavna.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bhavna.models.LogData;

public class FileReader {
	public MapData readFile(String fileLoc) {
		MapData mapData = new MapData();
		try {
			File file = new File(fileLoc);
			Scanner dataReader = new Scanner(file);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				String[] array = fileData.split("\t");
				LogData logData = new LogData(array[0], array[1], array[2]);
				mapData.createMap(logData.getName(), logData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexpected error occured!");
			exception.printStackTrace();
		}
		return mapData;
	}
}