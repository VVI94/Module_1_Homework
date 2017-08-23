import java.util.Scanner;

public class Task10 {
	/*
	 * Въведете число от клавиатурата и определете дали е просто. Просто число е
	 * това което се дели САМО на 1 и на себе си.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

//		if (num < 2) {
//			System.out.println("Числото не е просто.");
//		} else {
//			if (num == 2) {
//				System.out.println("Числото е просто.");
//			} else {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						System.out.println("Числото не е просто.");
						break;
					} else {
						System.out.println("Числото е просто.");
						break;
					}
				}
			}
	//	}
	//}

}
