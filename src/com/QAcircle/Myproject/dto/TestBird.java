package com.QAcircle.Myproject.dto;

import com.QAcircle.Myproject.dao.BirdDAO;

public class TestBird {
	public static void main(String[] args) {
		ParrotBirdDTO parrot = new ParrotBirdDTO();
		
		parrot.setColor("Green");
		parrot.setName("Parrot");
		parrot.setStay("Forest");
		
ParrotBirdDTO parrot1 = new ParrotBirdDTO();
		
		parrot1.setColor("Green1");
		parrot1.setName("Parrot1");
		parrot1.setStay("Forest1");
		
		BirdDAO dao = new BirdDAO ();
		dao.save(parrot);
		
		String print=dao.deletedByName("parrot");
		System.out.println(print);
		
		String show= dao.deleteByColor("Green");
		System.out.println(show);
		
		String replace=dao.deleteByStay("Forest");
		System.out.println(replace);
		
	}

}
