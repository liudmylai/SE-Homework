// Swap two numbers: Store two numbers in separate variables, display their initial values, swap them, and display them again.
public class SwapTwoNumbers {
    public static void main (String[] args) {
        int num1 = 20;
        int num2 = 14;
        System.out.println("Initial: num1=" + num1 + ", num2=" + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Swapped: num1=" + num1 + ", num2=" + num2);
    }
}