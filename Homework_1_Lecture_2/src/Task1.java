import java.util.Scanner;

public class Task1 {

	/*
	 * Да се изведат съобщения към потребителя и да се прочетат 2 числа от
	 * клавиатурата A и B (може да са с плаваща запетая – double). После да се
	 * прочете 3-то число C и да се провери дали то е м/у A и B. Да се изведе
	 * подходящо съобщение за това дали C е между A и B.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Въведете А: ");
		double a = input.nextDouble();
		System.out.println("Въведете В: ");
		double b = input.nextDouble();
		System.out.println("Въведете С: ");
		double c = input.nextDouble();

		if ((a < c && c < b) || (a > c && c > b)) {
			System.out.println("Числото " + c + " е между " + a + " и " + b);
		} else {
			System.out.println("Числото " + c + " не е между " + a + " и " + b);
		}

	}

}
