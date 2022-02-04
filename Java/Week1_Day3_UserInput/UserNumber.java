// Take a number from the user and print the first 10 multiples of that number.
import java.util.Scanner;

public class UserNumber {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}