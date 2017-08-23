import java.util.Scanner;

public class Task4 {
	/*
	 * Да се прочете масив и да се отпечата дали е огледален. Следните масиви са
	 * огледални: 
	 * [3 7 7 3] 
	 * [4] 
	 * [1 55 1] 
	 * [6 27 -1 5 7 7 5 -1 27 6]
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете големина на масива: ");
		byte index = input.nextByte();
		int[] numbers = new int[index];
		boolean isItSpecular = false;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
//		if(index % 2 == 0){
//			
//		}
		for (int i = 0; i < numbers.length/2; i++) {
			if(numbers[i] == numbers[index - (i + 1)]){
				isItSpecular = true;
			}else{
				isItSpecular = false;
				break;
			}
		}
		if(numbers.length == 1){
			isItSpecular = true;
		}
		
		if(isItSpecular){
		System.out.println("Масива е огледален.");
		}else{
			System.out.println("Масива не е огледален.");
		}

	}

}
