import java.util.Scanner;

public class Task14 {
	/*
	 * Да се състави програма, която по въведени координати на 2 позиции
	 * от шахматната дъска извежда отговор дали са оцветени в еднакъв или 
	 * различен цвят.
	 * Шахматната дъска е квадратна.
	 * Въвеждат се две двойки числа от интервала [1..8].
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte xa = input.nextByte();
		byte xb = input.nextByte();
		byte ya = input.nextByte();
		byte yb = input.nextByte();
		
		if(xa % 2 == 0 && ya % 2 == 0 && xb % 2 == 0 && yb % 2 == 0){ // ако всички са четни
			System.out.println("Позициите са с еднакъв цвят");
		}else if(xa % 2 != 0 && ya % 2 != 0 && xb % 2 != 0 && yb % 2 != 0){ // ако всички са нечетни
			System.out.println("Позициите са с еднакъв цвят");
		}else if (xa % 2 == 0 && xb % 2 == 0 && ya % 2 != 0 && yb % 2 != 0){ //  ч ч н н
			System.out.println("Позициите са с еднакъв цвят");
		}else if (xa % 2 == 0 && xb % 2 != 0 && ya % 2 == 0 && yb % 2 != 0){ //  ч  н ч н
			System.out.println("Позициите са с еднакъв цвят");
		}else if (xa % 2 == 0 && xb % 2 != 0 && ya % 2 != 0 && yb % 2 == 0){ //  ч н н ч
			System.out.println("Позициите са с еднакъв цвят");
		}else if (xa % 2 != 0 && xb % 2 != 0 && ya % 2 == 0 && yb % 2 == 0){ //  н н ч ч
			System.out.println("Позициите са с еднакъв цвят");
		}else if (xa % 2 != 0 && xb % 2 == 0 && ya % 2 != 0 && yb % 2 == 0){ // н ч н ч
			System.out.println("Позициите са с еднакъв цвят");
		}else if (xa % 2 != 0 && xb % 2 == 0 && ya % 2 == 0 && yb % 2 != 0){ //  н ч ч н
			System.out.println("Позициите са с еднакъв цвят");
		}else{
			System.out.println("Позициите са с различен цвят");
		}
		
		
		

	}

}
