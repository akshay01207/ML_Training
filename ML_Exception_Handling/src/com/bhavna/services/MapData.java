package com.bhavna.services;

import java.util.*;

import com.bhavna.models.LogData;

public class MapData {
	Map<String, ArrayList<LogData>> employeeSuccessHashMap = new HashMap<String, ArrayList<LogData>>();
	Map<String, ArrayList<LogData>> employeeFailureHashMap = new HashMap<String, ArrayList<LogData>>();

	public void createMap(String name, LogData logData) {
		if (employeeSuccessHashMap.containsKey(name) || !isValidName(name) ) {
			if (employeeFailureHashMap.containsKey(name)) {
				employeeFailureHashMap.get(name).add(logData);
			} else {
				employeeFailureHashMap.put(name, new ArrayList<LogData>());
				employeeFailureHashMap.get(name).add(logData);
			}
		} else {
			employeeSuccessHashMap.put(name, new ArrayList<LogData>());
			employeeSuccessHashMap.get(name).add(logData);
		}
	}

	public void display() {
		
		System.out.println("Success HashMap : ");
		employeeSuccessHashMap.forEach((key, value) -> System.out.println(key + " : " + value));

		System.out.println("\nFailure HashMap : ");
		employeeFailureHashMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}
	
	public static boolean isValidName(String name) {
        for (int i = 0; i < name.length(); ++i) {
            char ch = name.charAt(i);

           // If the character is not a letter and not a whitespace, return false.
            if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                return false;
            }
        }
        return true;
    }

}
