import java.util.Scanner;

//3. Take two strings form the user and compare if they're equal or not. Display a message saying the strings are equal or not equal
public class EqualStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string:");
		String first = scan.nextLine();
		System.out.println("\nEnter second string:");
		String second = scan.nextLine();
		if (first.equals(second)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		scan.close();
	}
}