//  Use a while loop to add up the numbers 1 to 20 into one variable. Print out the sum at the end
public class AddNumbers {
    public static void main (String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 20) {
            sum += num;
            num++;
        }
        System.out.print(sum);
    }
}