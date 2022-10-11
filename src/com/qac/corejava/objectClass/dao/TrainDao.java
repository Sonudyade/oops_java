package com.qac.corejava.objectClass.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.qac.corejava.objectClass.dto.TrainDto;

public class TrainDao {
	String s, name;
	Scanner r = new Scanner(System.in);

	ArrayList methods = new ArrayList();

	
	public TrainDto[] traindto = new TrainDto[10]; 
	
	public void save(TrainDto train) {
		traindto[0] = train;
	}
	public String getByName(String name) {
		for(int i=0;i<traindto.length; i++) {
			if (traindto[i]!=null&&traindto[i].getName().equals(name)) {
				traindto[i]= null;
				return"getName"+name;
			}
		}
		return "getName"+name;
	}
	public String getByOrigin(String origin) {
		for(int i=0;i<traindto.length; i++) {
			if (traindto[i]!=null&&traindto[i].getOrigin().equals(origin)) {
				traindto[i]= null;
				return"getOrigin"+origin;
			}
		}
		return "getOrigin"+origin;
	}
	
	
	public String getAll() {
		for(int i=0;i<traindto.length; i++) {
			if (traindto[i]!=null&&traindto[i].getAll().equals(i)) {
				traindto[i]= null;
				return"getAll";
			}
		}
		return "getAll";
			
		}
	public String removeByName(String ArrayList) {
		for(int i=0;i<traindto.length; i++) {
			if (traindto[i]!=null&&traindto[i].getremoveName().equals(ArrayList)) {
				traindto[i]= null;
				return"removeName"+ArrayList;
			}
		}
		return "RemoveName"+ArrayList;
	
		
	}
		
	

}
