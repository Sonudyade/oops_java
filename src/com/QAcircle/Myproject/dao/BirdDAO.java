package com.QAcircle.Myproject.dao;

import com.QAcircle.Myproject.dto.ParrotBirdDTO;

public class BirdDAO {
private ParrotBirdDTO[] parrotbirddto= new ParrotBirdDTO[10];
	
	public void save(ParrotBirdDTO parrot) {
		parrotbirddto[0]= parrot;
	}
	public String deleteByColor(String color) {
		for(int i=0;i<parrotbirddto.length;i++) {
			if(parrotbirddto[0]!=null&& parrotbirddto[i].getColor().equals(color)) {
		}
			parrotbirddto[i] = null;
			return"Deleted"+ color;
		}
	
	return"Color"+color+"not present";


}
}
