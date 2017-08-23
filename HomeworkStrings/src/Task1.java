import java.util.Scanner;

public class Task1 {
	/*
	 * Да се състави програма, чрез която се въвеждат два низа съдържащи до 40
	 * главни и малки букви. Като резултат на екрана да се извеждат низовете само с
	 * главни и само с малки букви. Пример: Abcd Efgh Изход: ABCD abcd EFGH efgh
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String firstString = input.nextLine();
		String secString = input.nextLine();

		System.out.println(firstString.toUpperCase() + " " + firstString.toLowerCase());
		System.out.println(firstString.toUpperCase() + " " + secString.toLowerCase());
	}
}
