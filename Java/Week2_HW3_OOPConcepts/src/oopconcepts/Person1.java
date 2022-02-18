package oopconcepts;

//4. Create another class as Person1 and declare private properties in it. Also create setter and getter methods in this class as public methods.
public class Person1 {
	
	private String fname;
	private String lname;
	private int age;
	

	public Person1() {}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

}
