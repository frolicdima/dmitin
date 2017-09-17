package ru.dmitin.models;

public class Profession {
	public String name;
	public String diploma;
	public String placeOfWork;
	public int experience;
	public String specialization;
	public String gender;
	
	public Profession(String name, String diploma, String placeOfWork, int experience, String specialization, String gender) {
		this.name = name;
		this.diploma = diploma;
		this.placeOfWork = placeOfWork;
		this.experience = experience;
		this.specialization = specialization;
		this.gender = gender;
	}
	
	public Profession() {
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDiploma() {
		return this.diploma;
	}
	
	public String getPlaceOfWork() {
		return this.placeOfWork;
	}
	
	public int getExperience() {
		return this.experience;
	}
	
	public String getSpecialization() {
		return this.specialization;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	/*public selfEducation(Profession profession) {
		Profession profession = new Profession("name", "diploma", "placeOfWork", 10, "specialization", "gender");
		System.out.println(getName() + "занимается самообразованием.");
	}*/
}