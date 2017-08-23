
public class Task11 {
	/*
	 * Да се създаде метод, който отпечатва масив в конзолата.
	 */
	static void printArr(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5, 8, 7, 88, 5, 75 };
		printArr(numbers);

	}

}
