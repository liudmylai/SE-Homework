import java.util.Scanner;

public class Calculator {
	static double Add(double num1, double num2) {
		return num1 + num2;
	}
	static double Subtract(double num1, double num2) {
		return num1 - num2;
	}
	static double Multiply(double num1, double num2) {
		return num1 * num2;
	}
	static double Divide(double num1, double num2) {
		return num1 / num2;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.print("\nEnter the second number: ");
		double num2 = scan.nextDouble();
		System.out.println("\nOptions:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
		boolean isInvalidOption;
		double result = 0;
		do {
			isInvalidOption = false;
			System.out.print("\nChoose an option: ");
			int option = scan.nextInt();
			switch(option) {
			case 1:
				result = Add(num1, num2);
				break;
			case 2:
				result = Subtract(num1, num2);
				break;
			case 3:
				result = Multiply(num1, num2);
				break;
			case 4:
				result = Divide(num1, num2);
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
