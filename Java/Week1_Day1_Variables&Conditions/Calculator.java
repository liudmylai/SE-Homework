//  Add, subtract, multiply, and divide (quotient & remainder) two numbers and display the output
class Calculator {
    public static void main(String[] args) {
        int inum1 = 10, inum2 = 3;
        int sum = inum1 + inum2;
        System.out.println("The sum of " + inum1 + " add " + inum2 + " is " + sum);
        int sub = inum1 - inum2;
        System.out.println("The subtraction of " + inum2 + " from " + inum1 + " is " + sub);
        int mult = inum1 * inum2;
        System.out.println("Multiplying " + inum1 + " by " + inum2 + " is " + mult);
        int quot = inum1 / inum2;
        int rem = inum1 % inum2;
        System.out.println("Dividing " + inum1 + " by " + inum2 + " is " + quot + "R" + rem);
    }
}