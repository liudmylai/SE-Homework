// Write a for loop that iterates from 1 - 20. Should print “prime” for all prime numbers.

public class PrimeNumbers {
    public static void main (String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + (i <= 3 || (i % 2 != 0 && i % 3 != 0) ? " - prime" : ""));
        }
    }
}