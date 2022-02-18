package oopconcepts;

public class Employee extends Person {
	
	double salary;
	String department;
	
	public Employee(String department, String fname, String lname, int age, char gender, double salary) {
		super(fname, lname, age, gender);
		this.salary = salary;
		this.department = department;
	}
}
