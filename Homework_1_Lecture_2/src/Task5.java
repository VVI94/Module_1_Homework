import java.util.Scanner;

public class Task5 {
	/*
	 * Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//цели числа
		int firstNum = input.nextInt();
		int secNum = input.nextInt();
		int thirdNum = input.nextInt();
		
//		// с плаваща запетая
//		double firstNum = input.nextDouble();
//		double secNum = input.nextDouble();
//		double thirdNum = input.nextDouble();

		if (firstNum > secNum && firstNum > thirdNum) {
			if (secNum > thirdNum) {
				System.out.println("Числата в низходящ ред са: " + firstNum + " " + secNum + " " + thirdNum);
			} else {
				System.out.println("Числата в низходящ ред са: " + firstNum + " " + thirdNum + " " + secNum);
			}
		} else if (secNum > firstNum && secNum > thirdNum) {
			if (firstNum > thirdNum) {
				System.out.println("Числата в низходящ ред са: " + secNum + " " + firstNum + " " + thirdNum);
			} else {
				System.out.println("Числата в низходящ ред са: " + secNum + " " + thirdNum + " " + firstNum);
			}
		} else {
			if (firstNum > secNum) {
				System.out.println("Числата в низходящ ред са: " + thirdNum + " " + firstNum + " " + secNum);
			} else {
				System.out.println("Числата в низходящ ред са: " + thirdNum + " " + secNum + " " + firstNum);
			}
		}
	}

}
