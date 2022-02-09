import java.util.Scanner;

//5. Print the total number of consonants and vowels in a given string
public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some text:");
		String str = scan.nextLine();
		int vowels = 0, consonants = 0;
		for (int i = 0, x = str.length(); i < x; i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
				    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowels++; 
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);
		scan.close();
	}
}