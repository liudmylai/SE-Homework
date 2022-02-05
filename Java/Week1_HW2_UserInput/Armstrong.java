// Determine whether a user entered number is an Armstrong number

import java.util.Scanner;

public class Armstrong {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scan.nextInt();
        int power = 0, sum = 0, x = num;
        
        // find the power based on the number of digits in a given number
        do {
            x/=10;
            power++;
        } while (x > 0);

        x = num;
        // find the sum of the digits of a given number each raised to the power
        do {
            sum += (int) Math.pow(x % 10, power);
            x/=10;
        } while (x > 0);

        System.out.println(num + " is " + (num == sum ? "an Armstrong number" : "not an Armstrong number"));
    }
}