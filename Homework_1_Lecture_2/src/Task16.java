import java.util.Scanner;

public class Task16 {
	/*
	 * Въведено е трицифрено естествено число от вида abc. Трябва да се провери
	 * дали: ако a = b = c - Изход: цифрите са равни; ако a>b>c - Изход: цифрите
	 * са във възходящ ред; ако a<b<c цифрите са в низходящ ред; и изход:
	 * цифрите са ненаредени, за неописаните случаи. Да се състави програма,
	 * която извежда резултата от проверката за наредба на цифрите в числото.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		short num = input.nextShort();
		byte a, b, c;

		a = (byte) (num / 100);
		b = (byte) ((num / 10) % 10);
		c = (byte) (num % 10);

		if (a == b && b == c) {
			System.out.println("Цифрите са равни");
		} else if (a > b && b > c) {
			System.out.println("Цифрите са във възходящ ред");
		} else if (a < b && b < c) {
			System.out.println("Цифрите са в низходящ ред");
		} else {
			System.out.println("Цифрите са ненаредени за описаните случаи");
		}

	}

}
