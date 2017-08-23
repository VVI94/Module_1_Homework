import java.util.Scanner;

public class Task3 {
	/*
	 * Да се състави програма, чрез която се въвеждат последователно две редици от
	 * символи без интервали. Програмата да извежда съобщение за резултата от
	 * сравнението им по позиции. Пример: хипопотам, хипопотук Изход: Двата низа са
	 * с равна дължина. Разлика по позиции: 8 а-у 9 м-к
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String first = input.next();
		String sec = input.next();

		if (first.length() > sec.length()) {
			System.out.println("Първият низ е по-дълъг.");
		}
		if (first.length() < sec.length()) {
			System.out.println("Вторият низ е по-дълъг");
		}																									
		if (first.length() == sec.length()) {
			System.out.println("Двата низа са с равна дължина");
			if (first.equals(sec)) {
				System.out.println("Двата низа са еднакви.");
			}
		}

	}

}
