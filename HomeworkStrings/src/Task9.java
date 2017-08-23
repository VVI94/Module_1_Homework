import java.util.Scanner;

public class Task9 {
	/*
	 * Да се състави програма, чрез която по въведен низ съдържащ букви, цифри, знак
	 * минус '-' се извежда сборът на въведените числа като се отчита знакът '-'
	 * пред съответното число. Вход: asd-12sdf45-56asdf100 Изход: -12 45 -56 100
	 * Сума = 77
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		String nums = text.replaceAll("[^0-9, -]", " ");
		System.out.println(nums);

	}

}
