import java.util.Scanner;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length and width of the first rectangle: ");
		double len1 = scan.nextDouble();
		double wid1 = scan.nextDouble();

		System.out.println("Enter length and width of the second rectangle: ");
		double len2 = scan.nextDouble();
		double wid2 = scan.nextDouble();
		
		Rectangle rectangle1 = new Rectangle (len1, wid1);
		Rectangle rectangle2 = new Rectangle (len2, wid2);

		System.out.println("The area of the first rectangle with length " + len1 + " and width " + wid1 + " is equal to " + rectangle1.area());
		System.out.println("The area of the second rectangle with length " + len2 + " and width " + wid2 + " is equal to " + rectangle2.area());
		
		scan.close();
	}

}
