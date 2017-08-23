import java.util.Scanner;

public class Task5 {
	/*
	 * Да се въведат от потребителя 2 числа. И да се изведат на екрана всички
	 * числа от по-малкото до по-голямото.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Въведете първото число:");
		int first = input.nextInt();
		System.out.println("Въведете второто число:");
		int second = input.nextInt();
		int start;
		int end;

		if (first <= second) {
			start = first;
			end = second;
		} else {
			start = second;
			end = first;
		}

//		for (int i = start; i <= end; i++) {
//			System.out.print(i + " ");
//		}

		while (start <= end) {
			System.out.print(start + " ");
			start++;
		}

	}

}
