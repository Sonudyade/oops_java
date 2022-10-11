package com.qac.corejava.objectClass;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

import com.qac.corejava.objectClass.dao.TrainDao;
import com.qac.corejava.objectClass.dto.TrainDto;

public class TestTrain {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("train getByname");
		String getByname = sc.nextLine();
		
		System.out.println("Train getBydestination");
		String destination= sc.nextLine();
		
		System.out.println("Train getByOrigin");
		String getByOrigin= sc.nextLine();
			
		TrainDto train = new TrainDto();
	
		train.setName("Udhyana Express");
		train.setOrigin("Bidar");
		train.setDestination("Bangalore");
		train.setCost(500);
		train.setSpeed(100);
		train.setTiming(9);
		
		ArrayList train1 = new ArrayList();
		train1.addAll( train1);
		train1.add("Nanded Express");
		train1.add("Nanded");
		train1.add(100);
		train1.add("9PM");
		train1.add("Bidar");
		System.out.println(train1);
		
	
		System.out.println(train);

		
		TrainDto train2 = new TrainDto();
		train2.setCost(600);
		train2.setDestination("Mysure");
		train2.setName("Basava Express");
		train2.setOrigin("Bangalore");
		train2.setSpeed(90);

	
		TrainDao dao = new TrainDao();
			dao.save(train);
	
		
		String print= dao.getByName("Udhyana Express");
		System.out.println(print);
		
		String show= dao.getByOrigin("Bidar");
		System.out.println(show);
		
		String display= dao.removeByName("Udhyana Express");
		System.out.println(display);
		String removeByName= sc.nextLine();
		
		String response= dao.getAll();
		System.out.println(response);
		
		
		
	}
	
	

	

}
