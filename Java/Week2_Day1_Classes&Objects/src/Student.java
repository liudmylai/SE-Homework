public class Student {
	String id;
	String fname;
	String lname;
	String email;
	double sub1;
	double sub2;
	double sub3;
	
	public Student (String id, String fname, String lname, String email, double sub1, double sub2, double sub3) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public void displayInfo() {
		System.out.println("Student ID: " + id);
		System.out.println("First Name: " + fname);
		System.out.println("Last Name: " + lname);
		System.out.println("Student email: " + email);
		System.out.println("Subject 1: " + sub1);
		System.out.println("Subject 2: " + sub2);
		System.out.println("Subject 3: " + sub3 + "\n");
	}
	
	public double getAverage() {
		return ((sub1 + sub2 + sub3)/3);
	}
	public void printAverage() {
		System.out.println("ID: " + id + " - the average of three subjects: " + getAverage());
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("0001", "Todd", "Hopkins", "Thop@gmail.org", 90.5, 80.0, 70.0);
		Student student2 = new Student("0002", "Mario", "Wells", "Wario@gmail.org", 80.3, 80.5, 100.0);
		
		student1.displayInfo();
		student2.displayInfo();
		
		student1.printAverage();
		student2.printAverage();
	}
}
