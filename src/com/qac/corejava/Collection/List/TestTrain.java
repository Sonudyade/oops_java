package com.qac.corejava.Collection.List;
import java.util.LinkedList;

import com.qac.corejava.Collection.List.dao.TrainDAO;
import com.qac.corejava.Collection.List.dto.TrainDTO;

public class TestTrain {
        public static void main(String [] args) {
		
		TrainDAO dao = new TrainDAO();
		
		TrainDTO train = new TrainDTO();
	
		train.setName("KSR Bengaluru Express");
		train.setOrigin("Bidar");
		train.setDestination("Bangalore");
		train.setCost(500);
		train.setSpeed(100);
		
		
		TrainDTO train1 = new TrainDTO();
		train1.setName("Mysure Express");
		train1.setOrigin("Bangalore");
		train1.setDestination("Mysure");
		train1.setCost(600);
		train1.setSpeed(90);
	
		
		dao.save(train);
		dao.save(train1);
		
		String show = dao.getByName("KSR Bengaluru Express");
		System.out.println(show);
		
		LinkedList display = dao.getByOrigin("Bidar");
		System.out.println(display);
		
	    LinkedList response = dao.getAll();
		System.out.println(response);
		
		String print = dao.removeByName("KSR Bengaluru Express");
		System.out.println(print);
		
	}

}
