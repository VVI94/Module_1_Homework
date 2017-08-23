
public class Task1 {
	/*
	 * Имате двумерен масив 6х5 от естествени числа, чийто стойности са въведени
	 * предварително. Да се състави програма, чрез която се извеждат елементите
	 * от масива с най-малката и най-голямата стойност.
	 */

	public static void main(String[] args) {

		int[][] array2d = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };

		int min = array2d[0][0];
		int max = array2d[0][0];
		
		for (int row = 0; row < array2d.length; row++) {			
			for (int col = 0; col < array2d[row].length; col++) {
				if(array2d[row][col] <= min){
					min = array2d[row][col];
				}
				if(array2d[row][col] >= max){
					max = array2d[row][col];
				}				
			}
		}
		System.out.println("Най-малката стойност в масива е " + min);
		System.out.println("Най-голямата стойност в масива е " + max);

	}

}
