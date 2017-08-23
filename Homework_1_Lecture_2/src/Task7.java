import java.util.Scanner;

public class Task7 {
	/*
	 * Въведете 3 променливи от клавиатурата – час (целочислен тип), сума 
	 * пари (число с плаваща запетая), дали съм здрав – булев тип.
	 * Съставете програма, която взема решения на базата на тези данни по следния начин:
	 *  - ако съм болен, няма да излизам
	 *  - ако имам пари, ще си купя лекарства
	 *  - ако нямам – ще стоя вкъщи и ще пия чай
	 *  - ако съм здрав, ще отида на кино с приятели 
	 *  - ако имам по-малко от 10 лв, ще отида на кафе.
	 *  Полученото решение покажете като съобщение в конзолата.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte hour = input.nextByte();
		float amount = input.nextFloat();
		boolean amIHealthy = input.hasNext();
		
		if(amIHealthy == false){
			System.out.println("Няма да излизам");
			if(amount > 0){
				System.out.println("Ще си купя лекарства");
			}else{
				System.out.println("Ще стоя вкъщи и ще пия чай");
			}
		}else{
			if(amount < 10) {
				System.out.println("Ще отида на кафе");
			}else{
				System.out.println("Ще отида на кино с приятели");
			}
		}

	}

}
