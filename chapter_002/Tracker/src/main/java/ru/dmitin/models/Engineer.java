package ru.dmitin.models;

public class Engineer extends Profession {
	public Engineer(String diploma, String placeOfWork, int experience, String specialization, String gender) {
		this.diploma = diploma;
		this.placeOfWork = placeOfWork;
		this.experience = experience;
		this.specialization = specialization;
		this.gender = gender;
	}
	
	/*public selfEducation(Engineer engineer) {
		
	}
	
	public design(Project project) {
		
	}
	
	public mentoring(Engineer engineer) {
		
	}
	
	public help(Teacher teacher) {
		System.out.println(инженер this.name учит teacher.getName())
	}*/
}