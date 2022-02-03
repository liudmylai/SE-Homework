// Write a for loop for the given output:
//     1.    1, 3, 5, 7, 9
//     2.    2, 4, 6, 8, 10

public class PrintNumbers {
    public static void main (String[] args) {
        // for (int i = 1; i <= 2; i++) {
        //     System.out.print(i + ".    ");
        //     for (int j = i; j <= 8 + i; j += 2){
        //         System.out.print(j + (j < 8 + i ? ", " : ""));
        //     }
        //   System.out.println();
        // }
        
        for (int i = 1; i <= 2; i++) {
            System.out.print(i + ".    ");
            for (int j = 1, x = i; j <= 5; j++, x += 2){
               System.out.print(x + (j < 5 ? ", " : ""));
             }
          System.out.println();
        }
    }
}