package com.bhavna.services;

import java.util.*;

import com.bhavna.models.LogData;

public class MapData {
	Map<String, ArrayList<LogData>> employeeHasMap = new HashMap<String, ArrayList<LogData>>();

	public void createMap(String name, LogData logData) {
		if (employeeHasMap.containsKey(name)) {
			employeeHasMap.get(name).add(logData);
		} else {
			employeeHasMap.put(name, new ArrayList<LogData>());
			employeeHasMap.get(name).add(logData);
		}
	}

	public void display() {
		employeeHasMap.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
