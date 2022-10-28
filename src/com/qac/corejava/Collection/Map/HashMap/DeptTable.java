package com.qac.corejava.Collection.Map.HashMap;

import java.util.HashMap;

public class DeptTable {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(20, "Testing");
		map.put(30, "Salesman");
		map.put(40, "Develop");
		map.put(50, "Admin");
		map.put(null, "");
	
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.hashCode());
		System.out.println(map.remove(50));
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
	}

}