package arrays;

//Display the average of a given integer array 
public class Average {
	public static void main(String[] args) {
		int[] intArray = {3, 27, 15, 8, 12};
		int sum = 0, num = intArray.length;
		for (int x : intArray) {
			sum += x;
		}
		int average = sum / num;
		System.out.println("Average is: " + average);
	}
}
