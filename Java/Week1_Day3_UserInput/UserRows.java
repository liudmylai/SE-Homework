import java.util.Scanner;
//  Take a number of rows from the user. Write a for loop for each output below (for this example, the user wanted five rows): 
//  1       54321
//  12      4321
//  123     321
//  1234    21
//  12345   1
public class UserRows {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int userRows = scan.nextInt();

        for(int i = 1, max = userRows; i <= userRows; i++, max--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            for(int j = 1; j <= max; j++){
                System.out.print(" ");
            }

            for(int j = max; j >= 1; j--){
                System.out.print(j);
            }

            System.out.println();
            
        }
    }
}