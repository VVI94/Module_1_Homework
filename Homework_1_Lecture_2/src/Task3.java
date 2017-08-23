import java.util.Scanner;

public class Task3 {
	/*
	 * Въведете 2 различни числа от конзолата и разменете стойността им.
	 * Разпечатайте новите стойности.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//цели числа
		int firstNum = input.nextInt();
		int secNum = input.nextInt();
		int temp;
		
//		//числа с плаваща запетая
//		double firstNum = input.nextDouble();
//		double secNum = input.nextDouble();
//		double temp;
		
		temp = firstNum;
		firstNum = secNum;
		secNum = temp;
		
		System.out.println("Новите стойности на числата са: " + firstNum + " и " + secNum);

	}

}
