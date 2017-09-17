package ru.dmitin.models;

public class Doctor extends Profession {
	public Doctor(String diploma, String placeOfWork, int experience, String specialization, String gender) {
		this.diploma = diploma;
		this.placeOfWork = placeOfWork;
		this.experience = experience;
		this.specialization = specialization;
		this.gender = gender;
	}
	
	/*public selfEducation(Doctor doctor) {
		
	}
	
	public healAdult(Adult adult) {
		
	}
	
	public healChild(Child child) {
		
	}
	
	public mentoring(Student student) {
		
	}*/
}