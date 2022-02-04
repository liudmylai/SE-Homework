// Take a character from the user and determine if it's a consonant or a vowel.

import java.util.Scanner;

public class VowlOrConsonant {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your letter: ");
        char ch = scan.next().charAt(0);
        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || 
            ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || 
            ch == 'U' || ch == 'u') {
            System.out.println("'" + ch + "' is a Vowl");
        }
        else if ((ch >= 65 && ch <=90) || (ch >= 97 && ch <= 122)) {
            System.out.println("'" + ch + "' is a Consonant");
        }
        else {
            System.out.println("'" + ch + "' is neither a Vowl nor a Consonant");
        }

    }
}