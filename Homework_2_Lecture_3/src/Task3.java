
public class Task3 {
	/*
	 * Да се изведат на екрана всички нечетни числа от -10 до 10.
	 */

	public static void main(String[] args) {

//		byte start = -10;

//		while (start <= 10) {
//			if (start % 2 != 0) {
//				System.out.println(start);
//			}
//			start++;
//		}

		for (byte i = -10; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
