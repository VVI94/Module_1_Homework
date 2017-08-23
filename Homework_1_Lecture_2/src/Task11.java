import java.util.Scanner;

public class Task11 {
	/*
	 * Съставете програма, която по дадено трицифренo число проверява
	 * дали числото се дели на всяка своя цифра. Във въведеното число да
	 * няма цифра 0.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете трицифрено число, което не съдържа цифрата 0: ");
		short num = input.nextShort();
		
		if(num < 100 || num > 999){
			System.out.println("Числото не е трицифрено!");
		}
		else{			
			byte dig1 = (byte) (num / 100);
			byte dig2 = (byte) ((num / 10) % 10);
			byte dig3 = (byte) (num % 10);
			
			System.out.println(dig1);
			System.out.println(dig2);
			System.out.println(dig3);
			
			if(dig1 == 0|| dig2 == 0|| dig3 == 0){
				System.out.println("Числото не трябва да съдържа 0!");
			}
			else{
				if(num % dig1 == 0 && num % dig2 == 0 && num % dig3 == 0){
					System.out.println("Числото се дели на всичките си цифри!");
				}
				else{
					System.out.println("Числото не се дели на всичките си цифри!");
				}
			}
			
		}

	}

}
