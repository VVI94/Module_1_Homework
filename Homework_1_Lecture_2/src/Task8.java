import java.util.Scanner;

public class Task8 {
	/*
	 * Да се състави програма, която чете от конзолата 4-цифренo естествено
	 * число от интервала [1000.. 9999]. От това число се формират 2 нови
	 * 2-цифрени числа. Първото число се формира от 1-та и 4-та цифра на
	 * въведеното число. Второто число се формира от 2-рa - 3-та цифра на
	 * въведеното число. Като резултат да се изведе дали 1-то ново число e
	 * по-малко <, равно = или по-голямо от 2-то число.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете число в интервала между 1000 и 9999:");
		short number = input.nextShort();
		byte firstNum;
		byte secNum;
		if (number < 1000 || number > 9999) {
			System.out.println("Числото не е в посочения интервал");
		} else {

			byte dig1 = (byte) (number / 1000);
			byte dig2 = (byte) ((number / 100) % 10);
			byte dig3 = (byte) ((number / 10) % 10);
			byte dig4 = (byte) (number % 10);

			firstNum = (byte) ((dig1 * 10) + dig4);
			secNum = (byte) ((dig2 * 10) + dig3);

			if (firstNum < secNum) {
				System.out.println("по-малко (" + firstNum + "<" + secNum + ")");
			} else if (firstNum == secNum) {
				System.out.println("равни (" + firstNum + "=" + secNum + ")");
			} else {
				System.out.println("по-голямо (" + firstNum + ">" + secNum + ")");
			}
		}

	}

}
