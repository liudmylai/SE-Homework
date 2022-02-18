package oopconcepts;

public class Employee extends Person implements PersonInterface {
	
	int id;
	double salary;
	String department;
	
	public Employee(int id, String department, String fname, String lname, int age, char gender, double salary) {
		super(fname, lname, age, gender);
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	
	public void display() {
		System.out.println(ORGANIZATION);
		super.display();
		System.out.println("Id: " + id);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}
	
	public  double calculate(int bonus) {
		double newsalary = salary + bonus;
		return newsalary;
	}
}
