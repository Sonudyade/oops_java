package com.qac.corejava.oops.Abstraction.Upcasting;
import com.qac.corejava.oops.Abstraction.Upcasting.dao.EnglishTeacherDao;
import com.qac.corejava.oops.Abstraction.Upcasting.dao.MathsTeacherDao;
import com.qac.corejava.oops.Abstraction.Upcasting.dao.StudentDao;
import com.qac.corejava.oops.Abstraction.Upcasting.dto.StudentDto;



public class Tester {
	public static void main(String[]args) {
		EnglishTeacherDao englishteacherdao = new StudentDao();
		englishteacherdao .isEnglishTeacher();
		 
		 MathsTeacherDao mathsteacherdao =new StudentDao();
		 mathsteacherdao.isTeacher();
		 mathsteacherdao.isTeaching();
		 
		 StudentDto studentdto = new StudentDto();
		 studentdto.setAge((byte)23);
		 studentdto.setName("Rashi");
		 studentdto.setRollNo((byte)25);
		 
		 System.out.println(studentdto.getName());
		 System.out.println(studentdto.getAge());
		 System.out.println(studentdto.getRollNo());
		 
		 
		 
		 
		
		 
		 
	}

}
