// Write Fibonnaci series (Links to an external site.) for the first n numbers in the series (n is a user entered value)

import java.util.Scanner;

public class Fibonnaci {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scan.nextInt();
        int result, prevNum = 0, currNum = 1;
        for (int i = 1; i <= num; i++) {
            // use this line to print Fibonacci Sequence from '0' 
            System.out.print(prevNum + (i < num ? ", " : ""));
            result = prevNum + currNum; 
            prevNum = currNum;
            currNum = result;
            // use this line to print Fibonacci Sequence w/o the first '0, 1'
            // System.out.print(result + (i < num ? ", " : ""));
        }
    }
}