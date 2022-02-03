// Using switch case, do the following:
// Store a number between 1-7
// If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
// Anything other than 1-7 would default to "Invalid Input"
public class DayOfWeek {
    public static void main (String[] args) {
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}