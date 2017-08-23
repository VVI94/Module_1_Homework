import java.util.Scanner;

public class Task7 {
	/*
	 * Да се състави програма, която чете набор от думи разделени с интервал. Като
	 * резултат да се извеждат броя на въведените думи, както и броя знаци в
	 * най-дългата дума. Пример: asd fg hjkl Изход: 3 думи, най-дългата е с 4
	 * символа.
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split(" ");
		int countOfWords = words.length;
		int maxLength = 0;
		
		for (int index = 0; index < words.length; index++) {
			if(words[index].length() > maxLength) {
				maxLength = words[index].length();
			}
		}
		
		System.out.println(countOfWords + " думи, най-дългата е с " + maxLength + " символа.");

	}

}
