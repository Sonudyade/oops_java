package com.qac.corejava.Collection.List.dao;

import java.util.Collection;
import java.util.LinkedList;

import com.qac.corejava.Collection.List.dto.HospitalDTO;
import com.qac.corejava.Collection.List.dto.TrainDTO;

public class HospitalDAO {
	LinkedList list = new LinkedList();
	private LinkedList remove;

	public String save(HospitalDTO Hospital ) {
		list.add(Hospital);
		return Hospital.getName()+"data saved";
	}
	public String getByName(String name) {
		LinkedList nameList = new LinkedList();
		for(int i=0;i<list.size(); i++) {
			HospitalDTO dto = (HospitalDTO)list.get(i);
			if (dto.getName().equals(name)) {
				nameList.add(dto);
			}
		}
		return name;

}
	public String getByWard(String ward) {
		LinkedList nameList = new LinkedList();
		for(int i=0;i<list.size(); i++) {
			HospitalDTO dto = (HospitalDTO)list.get(i);
			if (dto.getWard().equals(ward)) {
				nameList.add(dto);
			}
		}
		return ward;
}
	public String removeByName(String name) {
		LinkedList nameList = new LinkedList();
		for(int i=0;i<list.size(); i++) {
			HospitalDTO Hospital = (HospitalDTO)list.get(i);
			if (Hospital.getName().equals(name)) {
				nameList.add(Hospital);
			}
		}
		return name;
	}
	public LinkedList getAll() {
		return list;
	}
	

	public LinkedList removeAll() {
		return remove;
	}
	}

	



	