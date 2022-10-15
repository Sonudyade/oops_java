package com.qac.corejava.objectClass;
import com.qac.corejava.objectClass.dto.TrainDto;

import java.util.ArrayList;
import java.util.Scanner;

import com.qac.corejava.objectClass.dao.TrainDao;
import com.qac.corejava.objectClass.dto.TrainDto;

public class TestTrain {
	public static void main(String [] args) {
		
		TrainDao dao = new TrainDao();
		
		TrainDto train = new TrainDto();
	
		train.setName("Udhyana Express");
		train.setOrigin("Bidar");
		train.setDestination("Bangalore");
		train.setCost(500);
		train.setSpeed(100);
		
		
		TrainDto train1 = new TrainDto();
		train1.setName("Basava Express");
		train1.setOrigin("Bangalore");
		train1.setDestination("Mysure");
		train1.setCost(600);
		train1.setSpeed(90);
	
		
		dao.save(train);
		dao.save(train1);
		
		String show = dao.getByName("Udhyana Express");
		System.out.println(show);
		
		ArrayList response = dao.getAll();
		System.out.println(response);
		
		ArrayList display = dao.getByOrigin("Bidar");
		System.out.println(display);
		
		String print = dao.removeByName("Udhyana Express");
		System.out.println(print);
		
		
	}
}
	


