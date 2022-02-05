// Write a program to see if a user entered string is a palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some string: ");
        String str = scan.nextLine().toLowerCase();
        boolean isPalindrome = true;

        // split the text in half and do a mirrored character comparison
        for (int i = 0, n = str.length(), x = (int) Math.floor(n / 2); i < x; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Your string is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
    }
}