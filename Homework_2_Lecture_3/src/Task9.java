import java.util.Scanner;

public class Task9 {
	/*
	 * Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички числа
	 * от А до В на степен 2(разделени с запетая).Ако някое число е кратно на 3,
	 * да се изведе съобщение че числото се пропуска „skip 3“.Ако сумата от
	 * всички изведени числа (без пропуснатите) стане по-голяма от 200, да се
	 * прекрати извеждането.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Въведете А: ");
		short a = input.nextShort();
		System.out.println("Въведете В: ");
		short b = input.nextShort();
		short result = 1;
		short sum = 0;

		for (short i = a; i <= b; i++) {
			result = (short) (i * i);
			if (result % 3 == 0) {
				System.out.print("skip 3, ");
			} else {
				sum += result;
				if (sum > 200) {
					break;
				} else {
					System.out.print(result + ", ");
				}
			}
		}

	}

}
