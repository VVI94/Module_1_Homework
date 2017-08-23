import java.util.Scanner;

public class Task2 {
	/*
	 * Въведете 2 различни цели числа от конзолата. Запишете тяхната сума,
	 * разлика, произведение, остатък от деление и целочислено деление в отделни
	 * променливи и разпечатайте тези резултати в конзолата. Опитайте същото с
	 * числа с плаваща запетая.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//Цели числа
		int firstNum = input.nextInt();
		int secNum = input.nextInt();
		int sum, diff, product, divWithReminder, division;
		
//		//числа с плаваща запетая
//		double firstNum = input.nextDouble();
//		double secNum = input.nextDouble();
//		double sum, diff, product, divWithReminder, division;

		sum = firstNum + secNum;
		diff = firstNum - secNum;
		product = firstNum * secNum;
		divWithReminder = firstNum % secNum;
		division = firstNum / secNum;
		
		System.out.println("Сумата на двете числа е: " + sum);
		System.out.println("Разликата на двете числа е: " + diff);
		System.out.println("Произведението на двете числа е: " + product);
		System.out.println("Остатъка от делението на двете числа е: " + divWithReminder);
		System.out.println("Делението на двете числа е: " + division);

	}

}
