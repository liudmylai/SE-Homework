import java.util.Scanner;

//4. Print a given string in reverse order without using the reverse() method
public class Reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text:");
		String str = scan.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		scan.close();
	}
}