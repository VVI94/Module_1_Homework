
public class Task13 {
	/*
	 * Да се създаде метод, който приема два масива от числа и връща масив, съдържащ
	 * всички елементи на подадените масиви, като в първата част на масива са
	 * елементите на първия подаден масив, а във втората част – тези на втория
	 * подаден масив
	 */
	
	static int[] uniteArrays(int[] first, int[] second) {
		int[] uniteArr = new int[first.length + second.length];
		int index = 0;
		for (index = 0; index < first.length; index++) {
			uniteArr[index] = first[index];
			}
		for (int secIndex = 0, secArrindex = index; secIndex < second.length; secIndex++, secArrindex++) {
			uniteArr[secArrindex] = second[secIndex];
			}
		return uniteArr;
	}
	static void printArr(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		int[] firstArr = {1,2,5,4,7,8,5,4,7,55,5};
		int[] secArr = {123456789,5,57,333333,55,1,4,6,85,5,5874};
		
		int[] unite = uniteArrays(firstArr, secArr);
		printArr(unite);

	}

}
