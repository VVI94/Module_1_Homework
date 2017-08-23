import java.util.Scanner;

public class Task1 {
	/*
	 * Да се прочете масив и да се намери най-малкото число кратно на 3 от
	 * масива.
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете големина на масива: ");
		int index = input.nextInt();
		int[] array = new int[index];
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Въведете " + (i+1) + "-тия елемент: " );
			array[i] = input.nextInt();
		}
		int min = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0){
				if(array[i] < min || min == 0){
				min = array[i];
				}
			}
		}
		System.out.println(min);

	}

}
