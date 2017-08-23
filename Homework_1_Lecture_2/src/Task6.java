import java.util.Scanner;

public class Task6 {
	/*
	 * Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите 
	 * им така, че а1 да има стойността на а2, а2 да има стойността на а3, а 
	 * а3 да има старата стойност на а1.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//цели числа
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int a3 = input.nextInt();
		
//		//числа с плаваща запетая
//		double a1 = input.nextDouble();
//		double a2 = input.nextDouble();
//		double a3 = input.nextDouble();
		
		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println("Новите стойности на 3-те числа са: " + a1 + " " + a2 + " " + a3);

	}

}
