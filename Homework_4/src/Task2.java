import java.util.Scanner;

public class Task2 {
	/*
	 * Имате квадратен двумерен масив от естествени числа, чийто стойности се
	 * въвеждат от конзолата. Да се отпечатат диагоналите на масива.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете големина на масива: ");
		int size = input.nextInt();
		int[][] arr2D = new int[size][size];
		System.out.println("Въведете елементите на масива: ");
		for (int row = 0; row < arr2D.length; row++) {
			for (int col = 0; col < arr2D[row].length; col++) {
				arr2D[row][col] = input.nextInt();
			}
		}
		for (int row = 0; row < arr2D.length; row++) {
			for (int col = 0; col < arr2D[row].length; col++) {
				if (row == col) {
					System.out.print(arr2D[row][col] + " ");
				}
			}
		}
		System.out.println();
		
		for (int row = arr2D.length-1; row >= 0 ; row--){
			System.out.print(arr2D[arr2D.length - row - 1][row] + " ");
		}

	}

}
