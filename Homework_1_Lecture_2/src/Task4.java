import java.util.Scanner;

public class Task4 {
	/*
	 * Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//цели числа
		int firstNum = input.nextInt();
		int secNum = input.nextInt();
//		//числа с плаваща запетая
//		double firstNum = input.nextDouble();
//		double secNum = input.nextDouble();
		if (firstNum > secNum) {
			System.out.println("В нарастващ ред числата са: " + secNum + firstNum);
		} else if (firstNum == secNum) {
			System.out.println("Числата са равни!");
		} else {
			System.out.println("В нарастващ ред числата са: " + firstNum + secNum);
		}

	}

}
