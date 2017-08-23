import java.util.Scanner;

public class Task6 {
	/*
	 * Да се състави програма, чрез която се въвежда изречение с отделни думи. Като
	 * резултат на екрана да се извежда същия текст, но всяка отделна дума да
	 * започва с главна буква, а следващите я букви да са малки. Пример: супер яката
	 * задача Изход: Супер Яката Задача
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String[] wordOfSentence = sentence.split(" ");
		String newSentence = "";
		for (int index = 0; index < wordOfSentence.length; index++) {
			newSentence += wordOfSentence[index].substring(0,1).toUpperCase() + wordOfSentence[index].substring(1) + " ";
		}
		System.out.println(newSentence);

	}

}
