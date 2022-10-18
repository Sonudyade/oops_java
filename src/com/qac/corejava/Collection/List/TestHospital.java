package com.qac.corejava.Collection.List;

import java.util.LinkedList;

import com.qac.corejava.Collection.List.dao.HospitalDAO;
import com.qac.corejava.Collection.List.dto.HospitalDTO;


public class TestHospital {
	
	public static void main(String[] args) {
		
		HospitalDAO dao =new HospitalDAO();
		HospitalDTO hospital =new HospitalDTO();
		
		hospital.setName("Apollo Hospital");
		hospital.setAddress("Bangalore");
		hospital.setWard("General Ward");
		
		HospitalDTO hospital1=new HospitalDTO();
		hospital1.setName("Apex Hospital");
		hospital1.setAddress("Bidar");
		hospital1.setWard("Genetal Ward");
		
		dao.save(hospital);
		dao.save(hospital1);
		
		String show = dao.getByName("Apollo Hospital");
		System.out.println(show);
		
		String display = dao.getByWard("General Ward");
		System.out.println(display);
		
	    String print = dao.removeByName("Apollo Hospital");
		System.out.println(print);
		
		LinkedList response = dao.getAll();
		System.out.println(response);
		
		LinkedList resp=dao.removeAll();
		System.out.println(resp);
		
	}

		
	}


