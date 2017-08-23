import java.util.Scanner;

public class Task13 {
	/*
	 * Да се състави програма, която да отгатне колко е студено/топло по
	 * въведената температура t в градус Целзий. Температурните интервали са:
	 * 
	 * под -20 ледено студено; между 0 и -20 - студено; между 15 и 0 - хладно;
	 * между 25 и 15 - топло; над 25 – горещо.
	 * 
	 * Входни данни: цяло число от интервала [-100..100].
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte temperature = input.nextByte();

		if (temperature < -100 || temperature > 100) {
			System.out.println("Температурата не е в интервала -100 и 100 градуса.");
		} else {
			if (temperature < -20) {
				System.out.println("ледено студено");
			} else if (temperature < 0 && temperature >= -20) {
				System.out.println("студено");
			} else if (temperature < 15 && temperature >= 0) {
				System.out.println("хладно");
			} else if (temperature < 25 && temperature >= 15) {
				System.out.println("топло");
			} else {
				System.out.println("горещо");
			}
		}

	}

}
