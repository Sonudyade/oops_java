package com.QAcircle.Myproject.dto;

import com.QAcircle.Myproject.dao.BirdDAO;

public class TestBird {
	public static void main(String[] args) {
		ParrotBirdDTO parrot = new ParrotBirdDTO();
		
		parrot.setColor("Green");
		parrot.setName("Parrot");
		parrot.setStay("Forest");
	}

}
