// Write a for loop that iterates from 1 - 20. Should print “prime” for all prime numbers.

// public class PrimeNumbers {
//     public static void main (String[] args) {
//         for (int i = 1; i <= 20; i++) {
//             System.out.println(i + (i <= 3 || (i % 2 != 0 && i % 3 != 0) ? " - prime" : ""));
//         }
//     }
// }

public class PrimeNumbers {
    public static void main (String[] args) {
        for (int i = 1; i <= 200; i++) {
            boolean isPrime = true;
            for (int j = 2, s = (int) Math.sqrt(i); j <= s; j++) {
                if ( i % j == 0) {
                    isPrime = false;
                    break;
                } 
            }
            System.out.println(i + (isPrime ? " - prime" : ""));
        }
    }
}