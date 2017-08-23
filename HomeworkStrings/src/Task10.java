import java.util.Scanner;

public class Task10 {
	/*
	 * Да се състави програма, която по даден низ връща друг, символите, на който са
	 * получени като към всеки код на символ от ASCII таблицата е добавеното числото
	 * 5 и е записан новополучения символ. Пример : Вход: Hello Изход: Mjqqt
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		char[] wordCh = word.toCharArray();
		String newWord = "";
		
		for (int index = 0; index < wordCh.length; index++) {
			newWord += (char)(wordCh[index] + 5);
		}
		System.out.println(newWord);

	}

}
