package com.QAcircle.Myproject.dao;

import com.QAcircle.Myproject.dto.MedicalStudentDTO;

public class StudentDAO {
	private MedicalStudentDTO[]medicalstudents= new MedicalStudentDTO [10];
	
	public void save(MedicalStudentDTO  student) {
		medicalstudents[0]= student;
	  	
	}
	public String deleteByDept(String Dept) {
		
		
		
		for (int i = 0; i<medicalstudents.length;i++) {
			if(medicalstudents[i]!= null&&medicalstudents[i].getDept().equals(Dept)) {
				medicalstudents[i]=null;
				return "deleted" + Dept;
			}
		}
		return"Dept"+ Dept +"not present";
	}
	public String deletedByAddress(String Address) {
		if(medicalstudents[0]!= null&&medicalstudents[0].getAddress().equals(Address)) {
			medicalstudents[0]=null;
			return "deleted"  + Address;
		}
	
	return "Address" +Address+ " not  present";

}
	public String deletedByName(String name) {
		if(medicalstudents[0]!= null&&medicalstudents[0].getName().equals(name)) {
			medicalstudents[0]=null;
			return "deleted"  + name;
		}
	
	return "Name" +name+ " not  present";

}
	public void print() {
		for (int i = 0; i<medicalstudents.length;i++) {
			System.out.println(medicalstudents[0].getAddress());
			System.out.println(medicalstudents[0].getAge());
			System.out.println(medicalstudents[0].getDept());
			System.out.println(medicalstudents[0].getMoNo());
			System.out.println(medicalstudents[0].getName());
			System.out.println(medicalstudents[0].getYear());
		}
		
	}
}
