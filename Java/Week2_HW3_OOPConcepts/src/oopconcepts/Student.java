package oopconcepts;

import java.util.Arrays;
import java.util.Calendar;

public class Student extends Person implements PersonInterface {
	
	int graduationYear;
	String major;
	int[] grades;
	
	public Student(String fname, String lname, int age, char gender, int graduationYear, String major, int[] grades) {
		super(fname, lname, age, gender);
		this.graduationYear = graduationYear;
		this.major = major;
		this.grades = Arrays.copyOf(grades, grades.length);
	}
	
	public int graduateIn() {
		// src: https://stackoverflow.com/a/136434
		int year = Calendar.getInstance().get(Calendar.YEAR);
		if(graduationYear < year) {
			throw new ArithmeticException("The graduation year cannot be less then the current year."); 
		}
		return graduationYear - year;
	}
	
	public double calculateGpa() {
		double totalGPA = 0.0;
		for(int i=0; i < grades.length; i++) {
			totalGPA += calculate(grades[i]);
		}
		return totalGPA / grades.length;
	 }
	
	public void display() {
		System.out.println(ORGANIZATION);
		super.display();
		System.out.println("Graduation year: " + graduationYear);
		System.out.println("Major: " + major);
		System.out.println("Grades: " + Arrays.toString(grades));
		System.out.println("GPA: " + calculateGpa());
	}
	
	public double calculate(int grade) {
		double gpa = 0.0;
		if(grade >= 90) {
			gpa += 4.0;
		} else if (grade >= 80) {
			gpa += 3.0;
		} else if (grade >= 70) {
			gpa += 2.0;
		} else if (grade >= 60) {
			gpa += 1.0;
		}
		return gpa;
	}
	
}
