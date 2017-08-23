import java.util.Scanner;

public class Task7 {
	/*
	 * Напишете програма, която първо чете масив и после създава нов масив със
	 * същия размер по следния начин: стойността на всеки елемент от втория
	 * масив да е равна на сбора от предходния и следващият елемент на
	 * съответния елемент от първия масив. Да се изведе получения масив.
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете големината на масива: ");
		int index = input.nextInt();
		int[] firstArr = new int[index];
		int[] secArr = new int[firstArr.length];
		
		for (int fIndex = 0; fIndex < firstArr.length; fIndex++) {
			firstArr[fIndex] = input.nextInt();
		}
		
		secArr[0] = firstArr[1];
		secArr[secArr.length - 1] = firstArr[firstArr.length - 2];
		for (int secIndex = 1; secIndex < secArr.length-1; secIndex++) {
			secArr[secIndex] = firstArr[secIndex -1] + firstArr[secIndex + 1];
		}
		
		for (int i = 0; i < secArr.length; i++) {
			System.out.print(secArr[i]);
		}
		

	}

}
