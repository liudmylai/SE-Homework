package oopconcepts;

import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	public static Student newStudent() {
		System.out.println("Enter student info");
		System.out.print(" - First name: ");
		String fname = scan.nextLine();
		System.out.print(" - Last name: ");
		String lname = scan.nextLine();
		System.out.print(" - Age: ");
		int age = scan.nextInt();
		System.out.print(" - Gender: ");
		char gender = scan.next().charAt(0);
		System.out.print(" - Graduation Year: ");
		int graduationYear = scan.nextInt();
		scan.nextLine();
		System.out.print(" - Major subject: ");
		String major = scan.nextLine();
		System.out.print(" - Grades (separated by space): ");
		String[] gradeValues = scan.nextLine().split(" ");
		int[] grades = new int[gradeValues.length];
		for (int i = 0; i < gradeValues.length; i++) {
			grades[i] = Integer.parseInt(gradeValues[i]);
		}
		return new Student(fname, lname, age, gender, graduationYear, major, grades);
	}
	
	public static void main(String[] args) {

		Student std1 = newStudent();
		System.out.println("Student " + std1.fname + " " + std1.lname + ", GPA: " + std1.calculateGpa());
		scan.close();
	}

}
