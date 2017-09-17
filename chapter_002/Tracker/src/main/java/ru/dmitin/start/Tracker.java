package ru.dmitin.start;

import ru.dmitin.models.*;

public class Tracker {
	public static void main(String[] args) {
		Profession teacher1 = new Teacher("Иван Иванович Иванов", "ПТУ", "МГУ", 10, "математика", "муж");
		Student student1 = new Student("Василий Васильев");
		teacher1.teach(student1);
		//System.out.println(teacher1.getName() + " учит " + student1.getName());
	}
}