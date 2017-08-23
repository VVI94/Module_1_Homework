import java.util.Scanner;

public class Task6 {
	/*
	 * Напишете програма, която първо чете 2 масива и после извежда съобщение
	 * дали са еднакви, и дали са с еднакъв размер.
	 * 
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Въведете големина на масивите: ");
		int index = input.nextInt();
		int[] firstArr = new int[index];
		int[] secArr = new int[index];
		boolean same = false;
		System.out.println("Въведете елементите на първия масив:");
		for (int firstIndex = 0; firstIndex < firstArr.length; firstIndex++) {
			System.out.print("Въведете " + (firstIndex + 1) + "-я елемент: ");
			firstArr[firstIndex] = input.nextInt();
		}
		System.out.println("Въведете елементите на втория масив:");
		for (int secIndex = 0; secIndex < secArr.length; secIndex++) {
			System.out.print("Въведете " + (secIndex + 1) + "-я елемент: ");
			secArr[secIndex] = input.nextInt();
		}
		for (int i = 0; i < secArr.length; i++) {
			if(firstArr[i] != secArr[i]){
				same = false;
				break;
			}else{
				same = true;
			}
		}
		if(same){
			System.out.println("Масивите са еднакви!");
		} else{
			System.out.println("Масивите не са еднакви!");
		}
	}

}
