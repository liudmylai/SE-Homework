package oopconcepts;

// 1. Create a Person class that should have a parameterized constructor to make objects. 
public class Person {
	String fname;
	String lname;
	int age;
	char gender;
	
	public Person() {}
	
	public Person(String fname, String lname, int age, char gender) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
	}
	public void display() {
		System.out.println("Personal info:");
		System.out.println("Name: " + this.fname + " " + this.lname);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
	}

}
