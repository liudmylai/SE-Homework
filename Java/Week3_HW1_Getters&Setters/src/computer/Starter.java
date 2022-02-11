package computer;

public class Starter {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		Computer computer2 = new Computer();
		Computer computer3 = new Computer();
		Computer computer4 = new Computer();
		Computer computer5 = new Computer();
		
		computer1.setName("Lenovo");
		computer1.setPrice(826.00);
		computer1.setYear(2020);
		
		computer2.setPrice(949.00);
		computer2.setName("Apple");
		computer2.setYear(2021);
		
		computer3.setName("Dell");
		computer3.setPrice(859.00);
		computer3.setYear(2021);
		
		computer4.setName("HP");
		computer4.setPrice(984.00);
		computer4.setYear(2021);
		
		computer5.setName("Asus");
		computer5.setPrice(810.00);
		computer5.setYear(2021);
		
		System.out.println("List of brands: " + computer1.getName() + ", " + computer2.getName() + ", " + computer3.getName() + ", " + computer4.getName() + ", " + computer5.getName());

		Computer.displayTotalCount();

		double averagePrice = Computer.getAveragePrice();
		System.out.println("Average price: $" + averagePrice);
	}

}
