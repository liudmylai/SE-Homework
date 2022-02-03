// Use a while loop to print out the even number from 1 to 20

public class PrintEvenNumber {
    public static void main (String[] args) {
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
