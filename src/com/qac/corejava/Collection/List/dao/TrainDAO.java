package com.qac.corejava.Collection.List.dao;

import java.util.LinkedList;

import com.qac.corejava.Collection.List.dto.TrainDTO;


public class TrainDAO {
	LinkedList list = new LinkedList();
	public String save(TrainDTO train) {
		list.add(train);
		return train.getName()+"data saved";
	}

	
	
	
	public String getByName(String name) {
		LinkedList nameList = new LinkedList();
		for(int i=0;i<list.size(); i++) {
			TrainDTO dto = (TrainDTO)list.get(i);
			if (dto.getName().equals(name)) {
				nameList.add(dto);
			}
		}
		return name;
	}
	public LinkedList getByOrigin(String origin) {
		LinkedList nameList = new LinkedList();
		for(int i=0;i<list.size(); i++) {
			TrainDTO dto = (TrainDTO)list.get(i);
			if (dto.getOrigin().equals(origin)) {
				nameList.add(dto);
				
			}
		}
		return nameList;
	}
	public String removeByName(String name) {
		LinkedList nameList = new LinkedList();
		for(int i=0;i<list.size(); i++) {
			TrainDTO dto = (TrainDTO)list.get(i);
			if (dto.getName().equals(name)) {
				nameList.add(dto);
		
			}
		}
		return name;
	
		
	}




	public LinkedList getAll() {
		return list;
		
		
		
			}

}
