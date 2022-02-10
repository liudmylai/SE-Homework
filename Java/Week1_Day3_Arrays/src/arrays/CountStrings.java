package arrays;

import java.util.Scanner;

//Display the number of times a user entered string is found in the given string array.
public class CountStrings {
	public static void main(String[] args) {
		String[] colors = {"red", "blue", "black", "red", "yellow", "red", "black"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your color: ");
		String userColor = scan.next();
		int count = 0;
		for (String color : colors) {
			if (color.equalsIgnoreCase(userColor)) {
				count++;
			}
		}
		System.out.println("'" + userColor + "' is found " + count + " times");
		scan.close();
	}
}
