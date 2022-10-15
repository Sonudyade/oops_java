package com.qac.corejava.objectClass.dao;
import com.qac.corejava.objectClass.dto.TrainDto;

import java.util.ArrayList;
import java.util.Scanner;

import com.qac.corejava.objectClass.dto.TrainDto;

public class TrainDao {
	

	ArrayList list = new ArrayList();
	public String save(TrainDto train) {
		list.add(train);
		return train.getName()+"data saved";
	}

	
	
	
	public String getByName(String name) {
		ArrayList nameList = new ArrayList();
		for(int i=0;i<list.size(); i++) {
			TrainDto dto = (TrainDto)list.get(i);
			if (dto.getName().equals(name)) {
				nameList.add(dto);
			}
		}
		return name;
	}
	public ArrayList getByOrigin(String origin) {
		ArrayList nameList = new ArrayList();
		for(int i=0;i<list.size(); i++) {
			TrainDto dto = (TrainDto)list.get(i);
			if (dto.getOrigin().equals(origin)) {
				nameList.add(dto);
				
			}
		}
		return nameList;
	}
	public String removeByName(String name) {
		ArrayList nameList = new ArrayList();
		for(int i=0;i<list.size(); i++) {
			TrainDto dto = (TrainDto)list.get(i);
			if (dto.getName().equals(name)) {
				nameList.add(dto);
		
			}
		}
		return name;
	
		
	}




	public ArrayList getAll() {
		return list;
		
		
		
			}
		
	

}
