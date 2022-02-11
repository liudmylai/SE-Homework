package computer;

public class Computer {
	static int count;
	static double totalPrice;
	
	private String name;
	private int year;
	private double price;
	
	public Computer() {
		count++;
	} 
		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}
	
	/**
	 * Function name: setPrice
	 * 
	 * @param price (double)
	 * 
	 * inside the function:
	 * 1. update the total price of computers
	 * 2. set the price of current computer 
	 */
	public void setPrice(double price) {
		totalPrice = totalPrice - this.price + price;
		this.price = price;
	}
	
	/**
	 * Function name: displayTotalCount
	 * 
	 * inside the function:
	 * 1. print total number of computers
	 */
	public static void displayTotalCount() {
		System.out.println("Total number of computers: " + count);
	}
	
	/**
	 * Function name: getAveragePrice
	 * 
	 * @return (double)
	 * 
	 * inside the function:
	 * 1. return the average price of computers
	 */
	public static double getAveragePrice() {
		return totalPrice / count;
	}

		
}
