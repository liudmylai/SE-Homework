// Determine if a number is negative, positive, or zero. 
public class Positive {
    public static void main (String[] args) {
        int num = 7;
        if (num > 0) {
            System.out.println("Number " + num + " is positive");
        } else if (num < 0) {
            System.out.println("Number " + num + " is negative");
        } else {
            System.out.println("It is zero");
        }
    }
}