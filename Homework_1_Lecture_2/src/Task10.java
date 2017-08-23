import java.util.Scanner;

public class Task10 {
	/*
	 * Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
	 * 3 литра и ги ползвате едновременно.
	 * Да се състави програма, която по даден обем извежда как ще прелеете
	 * течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
	 * кофите. Кофите не могат да се ползват с частично количество вода.
	 * Входни данни: естествено число от интервала [10..9999].
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		short volume = input.nextShort();
		short count = 0;
		byte leftSpace = 0;
		
		if(volume % 5 == 0){
			count = (short) (volume / 5);
			System.out.println(count + " пъти по 2 литра,");
			System.out.println(count + " пъти по 3 литра");
		}else{
			count = (short) (volume / 5);
			System.out.println(count + " пъти по 2 литра,");
			System.out.println(count + " пъти по 3 литра");
			leftSpace = (byte) (volume - (5 * count));
			if(leftSpace == 2){
				System.out.println("допълнително кофа от 2 литра");
			}else{
				System.out.println("допълнително кофа от 3 литра");
			}
					
		}

	}

}
