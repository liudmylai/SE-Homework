package arrays;

import java.util.Scanner;

//In a given integer array, look for the user entered number and in which array locations that number was found
public class NumberLocation {
	public static void main(String[] args) {
		int[] numbers = {1, 25, 13, 4, 6, 81, 19, 13, 18, 13, 6};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int userNumber = scan.nextInt();
		String result = "";
		for (int i = 0, n = numbers.length; i < n; i++ ) {
			if (numbers[i] == userNumber) {
				//put comma before each index except the first one  
				result += result.isEmpty() ? i : ", " + i;
			} 
		}
		System.out.println(userNumber + " is " + (result.isEmpty() ? "not found" : "found at " + result + " locations"));
		scan.close();
	}
}
