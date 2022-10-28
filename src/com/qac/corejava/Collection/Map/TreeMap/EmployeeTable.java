package com.qac.corejava.Collection.Map.TreeMap;

import java.util.TreeMap;

public class EmployeeTable {
	public static void main(String[] args) {
		
		TreeMap map= new TreeMap();
		map.put(1, "Sony");
		map.put(2, "Kaveri");
		map.put(3, "Sudha");
		
		System.out.println(map);
		System.out.println(map.lastKey());
		System.out.println(map.get(2));
		System.out.println(map.floorKey(1));
		System.out.println(map.isEmpty());
		System.out.println(map.descendingKeySet());
		System.out.println(map.descendingMap());
		System.out.println(map.remove(1));
		
	}
	

}
