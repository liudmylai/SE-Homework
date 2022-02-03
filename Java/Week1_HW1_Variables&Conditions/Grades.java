// Write an if/else statement for the following requirements:
// If student gets 90 or higher: console log  A
// If students get 80 or above: console log B
// If students get 70 or above: console log C
// If students get 55 or above: console log D
// Any grade lower than 55 is F
public class Grades {
    public static void main (String[] args) {
        int score = 65;
        if (score >= 90) {
            System.out.println("A");
        } 
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 55) {
            System.out.println("D");
        }
        else if (score >= 0) {
            System.out.println("F");
        }
        else {
            System.out.println("Invalid score");
        }
    }
}