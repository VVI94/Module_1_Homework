import java.util.Scanner;

public class Task2 {
	/*
	 * Да се състави програма, чрез която от клавиатурата се въвеждат последователно
	 * две думи с дължина 10-20 знака. Програмата да размени първите им 5 знака и да
	 * изведе дължината на по-дългата, както и новото им съдържание. Пример:
	 * uchilishe uchenik Изход: 9 uchenishe
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String firstWord = input.next();
		String secWord = input.next();

		String firstFive = firstWord.substring(0, 5);
		String secFive = secWord.substring(0, 5);

		String newFirst = firstFive + secWord.substring(5);
		String newSec = secFive + firstWord.substring(5);

		if (newFirst.length() > newSec.length()) {
			System.out.println(newFirst.length() + " " + newFirst);
		} else {
			System.out.println(newSec.length() + " " + newSec);
		}

	}
}
