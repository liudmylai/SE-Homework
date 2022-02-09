import java.util.Scanner;

//1. Write a Java program to display the total numbers of characters in a user entered String
public class TotalCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text:");
		String text = scan.nextLine();
		String temp = text;
		int count = 0;
		while (!temp.isEmpty()) {
			temp = temp.substring(1);
			count++;
		}
		System.out.println("The total numbers of characters is: " + count);
		scan.close();
	}
}