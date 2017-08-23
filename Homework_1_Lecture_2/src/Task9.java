import java.util.Scanner;

public class Task9 {
	/*
	 * Да се състави програма, която чете от конзолата 2 естествени двуцифрени
	 * числа a,b. Програмата да изведе в конзолата дали последната цифра от
	 * произведението на двете числа е четна, както и самата цифра. Входни
	 * данни: a,b - естествени числа от интервала [10..99].
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете две числа в интервала от 10 до 99");
		byte fNum = input.nextByte();
		byte sNum = input.nextByte();
		short product = 0;
		byte lDigit = 0;


		if ((fNum < 10 || fNum > 99) || sNum < 10 || sNum > 99) {
			System.out.println("Числата не са в посочения интервал!");
		} else {
			product = (short) (fNum * sNum);
			lDigit = (byte) (product % 10);

			if (lDigit % 2 == 0) {
				System.out.println(product + ", " + lDigit + " четна");
			} else {
				System.out.println(product + ", " + lDigit + " нечетна");
			}
		}

	}

}
