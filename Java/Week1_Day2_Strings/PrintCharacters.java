//2. Using a while loop, print each character of the string 'Hello World'
public class PrintCharacters {
	public static void main(String[] args) {
		String text = "Hello World";
		int i = 0;
		while (i < text.length()) {
			System.out.print(text.charAt(i++));
		}
	}
}