import java.util.Scanner;

public class Task8 {
	/*
	 * Да се състави програма, чрез която се въвежда ред от символи (стринг, низ).
	 * Програмата да изведе на екрана дали въведения стринг е палиндром, т.е. дали
	 * четен отляво-надясно и отдясно-наляво е един и същ. Вход: капак Изход: да.
	 * Вход: тенджера Изход: не.
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		char[] inputOfChar = word.toCharArray();
		String revWord = "";
		
		for (int index = inputOfChar.length - 1; index >= 0 ; index--) {
			revWord += inputOfChar[index];
		}
		if(word.equals(revWord)) {
			System.out.println("Да.");
		}else {
			System.out.println("Не.");
		}

	}

}
