package com.Collections.app.Set;

import java.util.List;
import java.util.Stack;

public class StudentListTest {

	public static void main(String[] args) {

		Student student1 = new Student(1001, "Syed Nawazish", "Alzohar Academy");
		Student student2 = new Student(1002, "Saif Qazi", "Alzohar Academy");
		Student student3 = new Student(1003, "Shahid Khan", "Alzohar Academy");
		Student student4 = new Student(1004, "Rahezam Khan", "Alzohar Academy");
		Student student5 = new Student(1005, "Tauheed Shaikh", "Alzohar Academy");

		List<Student> listOfStudents = new Stack<Student>();

		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);
		listOfStudents.add(student4);
		listOfStudents.add(student5);
		listOfStudents.add(0, student5);
		System.out.println("-------------------------------------");
		
		
		for (Student std : listOfStudents) {
			System.out.println(std);
			
		
		}
		

	}

}
