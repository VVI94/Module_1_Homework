import java.util.Scanner;

public class Task5 {
	/*
	 * Да се състави програма, чрез която се въвеждат 2 редици от знаци (думи). Ако
	 * в двете редици участва един и същи знак, да се изведе на екрана първата
	 * редица хоризонтално, а втората вертикално, така че да се пресичат в общия си
	 * знак. Ако редиците нямат общ знак да се изведе само уведомително съобщение.
	 * Пример : м а шапка и н а
	 */
	static void printWords(char[] arr, int position, String word) {
		for (int index = 0; index < arr.length; index++) {
			if (index != position) {
				System.out.println(arr[index]);
			} else {
				System.out.println(word);
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String firstWord = input.nextLine();
		String secWord = input.nextLine();
		int posFirstChar = -1;
		int posSecChar = -1;

		char[] firstWordToChars = firstWord.toCharArray();
		char[] secWordToChars = secWord.toCharArray();

		if (firstWord.indexOf(secWordToChars[0]) != -1) {
			posFirstChar = firstWord.indexOf(secWordToChars[0]);
		}
		if (secWord.indexOf(firstWordToChars[0]) != -1) {
			posSecChar = secWord.indexOf(firstWordToChars[0]);
		}

		if (posFirstChar != -1) {
			printWords(firstWordToChars, posFirstChar, secWord);
		}
		if (posSecChar != -1) {
			printWords(secWordToChars, posSecChar, firstWord);
		}

	}

}
