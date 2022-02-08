import java.util.Scanner;

public class Calculator {
	static Scanner scan = new Scanner(System.in);

	static double Add() {
		double num1 = getFirstNumber();
		double num2 = getSecondNumber();
		return num1 + num2;
	}
	static double Subtract() {
		double num1 = getFirstNumber();
		double num2 = getSecondNumber();
		return num1 - num2;
	}
	static double Multiply() {
		double num1 = getFirstNumber();
		double num2 = getSecondNumber();
		return num1 * num2;
	}
	static double Divide() {
		double num1 = getFirstNumber();
		double num2 = getSecondNumber();
		return num1 / num2;
	}
	
	static double getFirstNumber() {
		System.out.print("\nEnter the first number: ");
		return scan.nextDouble();
	}

	static double getSecondNumber() {
		System.out.print("\nEnter the second number: ");
		return scan.nextDouble();
	}
	
	public static void main(String[] args) {
		System.out.println("OPTIONS\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
		boolean isInvalidOption;
		double result = 0;
		do {
			isInvalidOption = false;
			System.out.print("\nChoose an option: ");
			int option = scan.nextInt();
			switch(option) {
			case 1:
				result = Add();
				break;
			case 2:
				result = Subtract();
				break;
			case 3:
				result = Multiply();
				break;
			case 4:
				result = Divide();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				isInvalidOption = true;
				System.out.println("Invalid Entry, Try Again.");
				break;
			}
		} while (isInvalidOption);
		System.out.println("\nResult is " + result);
		scan.close();
	}
}
