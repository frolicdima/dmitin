package ru.dmitin.models;

public class Teacher extends Profession {
	public Teacher(String name, String diploma, String placeOfWork, int experience, String specialization, String gender) {
		this.name = name;
		this.diploma = diploma;
		this.placeOfWork = placeOfWork;
		this.experience = experience;
		this.specialization = specialization;
		this.gender = gender;
	}
	
	public void teach(Student student) {
		//Profession teacher = new Teacher("name", "diploma", "placeOfWork", 10, "specialization", "gender");
		//Student student1 = new Student("Костоваров Илья");
		System.out.println("Учитель " + this.name + "учит студента " + student.getName() + "дисциплине " + this.specialization);
	}
	
	/*public examine(Student student) {
		Profession teacher = new Teacher("name", "diploma", "placeOfWork", 10, "specialization", "gender");
		System.out.println("Учитель " + teacher.getName() + "принимает экзамен у некого студента, для которого у меня не существует класса, по дисциплине " + teacher.getSpecialization());
	}
	
	public review(Homework homework) {
		Profession teacher = new Teacher("name", "diploma", "placeOfWork", 10, "specialization", "gender");
		System.out.println("Учитель " + teacher.getName() + "проверяет домашнее задание некого студента, для которого у меня не существует класса, по дисциплине " + teacher.getSpecialization() + ". Учителя это бесит потому что он занимается этим уже " + teacher.getexperience() + " лет.");
	}*/
}