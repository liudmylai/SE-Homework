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
	
	public static Employee newEmployee() {
		System.out.println("Enter employee info");
		System.out.print(" - Id: ");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.print(" - Dapartment: ");
		String department = scan.nextLine();
		System.out.print(" - First name: ");
		String fname = scan.nextLine();
		System.out.print(" - Last name: ");
		String lname = scan.nextLine();
		System.out.print(" - Age: ");
		int age = scan.nextInt();
		System.out.print(" - Gender: ");
		char gender = scan.next().charAt(0);
		System.out.print(" - Salary: ");
		double salary = scan.nextDouble();
		
		return new Employee(id, department, fname, lname, age, gender, salary);
	}
	
	public static Person1 newPerson1() {
		Person1 person = new Person1();
		System.out.println("Enter info");
		System.out.print(" - First name: ");
		String fname = scan.nextLine();
		person.setFname(fname);
		System.out.print(" - Last name: ");
		String lname = scan.nextLine();
		person.setLname(lname);
		System.out.print(" - Age: ");
		int age = scan.nextInt();
		person.setAge(age);
		
		return person;
	}
	
	public static void main(String[] args) {
		
		// create and display 'student' object 
		Student std1 = newStudent();
		std1.display();
		
		// create and display 'employee' object 
		Employee emp1 = newEmployee();
		emp1.display();
		System.out.println("Salary with bonus - " + emp1.calculate(500));
		
		// create and display 'person1' object 
		Person1 p1 = newPerson1();
		System.out.println("Person name: " + p1.getFname() + " " + p1.getLname());
		
		scan.close();
	}
}
