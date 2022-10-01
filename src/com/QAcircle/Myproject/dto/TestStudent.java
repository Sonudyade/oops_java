package com.QAcircle.Myproject.dto;

import com.QAcircle.Myproject.dao.StudentDAO;

public class TestStudent {
	public static void main(String[] args) {
	
	
	
	MedicalStudentDTO student = new MedicalStudentDTO();
	student.setName("Sony");
	student.setAge(23);
	student.setAddress("Bidar");
	student.setDept("Dental");
	student.setYear(4);
	
	MedicalStudentDTO student1 = new MedicalStudentDTO();
	student1.setName("Anushka");
	student1.setAge(23);
	student1.setAddress("Bidar");
	student1.setDept("Dental");
	student1.setYear(4);
	
	StudentDAO dao = new StudentDAO();
	dao.save(student);
	
	String response=dao.deleteByDept("Dental");
	System.out.println(response);
	
	String display=dao.deletedByAddress("Bidar");
	System.out.println(display);
	
	String show =dao.deletedByName("Anushka");
	System.out.println(show);
	

	
	


}
}