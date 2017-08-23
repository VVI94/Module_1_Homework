import java.util.Scanner;

public class Task2 {
	/*
	 * Нека по въведен масив да се конструира нов, като половината му елементи
	 * са точно като на оригиналния, а другите да са тези елементи, но в обратен
	 * ред. Последно, да се изведе новия масив на екрана.
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете големина на масива: ");
		int index = input.nextInt();
		int[] firstArr = new int[index];
		int[] secArr = new int [index * 2];
		
		for (int fillFirstArr = 0; fillFirstArr < firstArr.length; fillFirstArr++) {
			System.out.print("Въведете " + (fillFirstArr+1) + "-тия елемент: ");
			firstArr[fillFirstArr] = input.nextInt();
			secArr[fillFirstArr] = firstArr[fillFirstArr];
		}
		for (int secIndex = secArr.length - 1, fIndex = 0; secIndex >= index; secIndex--, fIndex++) {
			secArr[secIndex] = firstArr[fIndex];
		}
		for (int printIndex = 0; printIndex < secArr.length; printIndex++) {
			System.out.print(secArr[printIndex] + " ");
		}

	}

}
