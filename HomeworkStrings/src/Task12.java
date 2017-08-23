
public class Task12 {
	/*
	 * Да се създаде метод, който приема за входни данни число N и връща масив от
	 * числа с дължина N, който съдържа всички числа от 1 до N.
	 */

	static int[] generateArray(int num) {
		int[] numbers = new int[num];
		
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = index + 1;
		}
		return numbers;
	}
	static void printArr(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
	}
	public static void main(String[] args) {
		int[] numbers = generateArray(15);
		printArr(numbers);
		

	}

}
