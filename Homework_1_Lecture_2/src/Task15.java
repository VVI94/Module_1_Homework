import java.util.Scanner;

public class Task15 {
	/*
	 * Да се състави програма, която въвежда естествено число от интервала [0..24]. 
	 * Програмата да изведе съответстващо съобщение съобразно въведения час. 
	 * Периодите са: 
	 * [18..4] - Добър вечер; 
	 * [4..9] - Добро утро; 
	 * [9..18] - Добър ден
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte number = input.nextByte();

		if (number < 0 || number > 24) {
			System.out.println("Числото трябва да е в интервала от 0 до 24");
		} else {
			if (number >= 9 && number < 18) {
				System.out.println("Добър ден");
			} else if (number >= 4 && number < 9) {
				System.out.println("Добро утро");
			} else {
				System.out.println("Добър вечер");
			}
		}

	}

}
