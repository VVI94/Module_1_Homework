import java.util.Scanner;

public class Task6 {
	/*
	 * Да се прочете число от екрана(конзолата) и да се изведе сбора на всички
	 * числа между 1 и въведеното число. 
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете число: ");
		int end = input.nextInt();
		int result = 0;
		
		for(int i = 1; i <= end; i++){
			result += i;
		}
		System.out.println("Резултатът е " + result);

	}

}
