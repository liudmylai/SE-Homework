//  Write a for loop to display the following outputs: 
//  1                    11111
//  22                   2222
//  333                  333
//  4444                 44
//  55555                5

public class NestedLoop {
    public static void main (String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.print("          ");
            for(int j = i; j <= 5; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}