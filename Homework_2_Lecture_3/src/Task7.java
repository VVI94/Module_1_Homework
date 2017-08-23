import java.util.Iterator;
import java.util.Scanner;

public class Task7 {
	/*
	 * Започвайки от 3, да се изведат на екрана първите n числа които се делят
	 * на 3. Числата да са разделени със запетая.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Въведете n:");
		int n = input.nextInt();
		int result = 0;

		for (int i = 1; i <= n; i++) {
			result += 3;
			System.out.print(result);
			if (i < n) {
				System.out.print(", ");
			}
		}

	}

}
