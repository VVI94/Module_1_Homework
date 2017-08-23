import java.util.Scanner;

public class Task4 {
	/*
	 * Да се състави програма, чрез която по въведени трите имена на двама човека
	 * разделени със запетая, се извежда чие име има по-голям сбор от ASCII кодовете
	 * на съставящите името букви. Пример: Anna Dosewa Asenowa,Iwo Peew Peew Изход:
	 * Anna Dosewa Asenowa
	 */
	static int SumOfChars(String name) {
		int sum = 0;
		char[] charsOfName = name.toCharArray();
		for (int index = 0; index < charsOfName.length; index++) {
			sum += charsOfName[index];
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String inputNames = input.nextLine();
		String[] names = inputNames.split(",");
		int sumFirstName = SumOfChars(names[0]);
		int sumSecName = SumOfChars(names[1]);
		
		if(sumFirstName > sumSecName) {
			System.out.println(names[0]);
		}else {
			System.out.println(names[1]);
		}

	}
}
