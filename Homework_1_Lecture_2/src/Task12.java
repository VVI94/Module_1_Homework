import java.util.Scanner;

public class Task12 {
	/*
	 * Високосни години са всички години кратни на 4 с изключения столетията, но
	 * без столетия кратни на 400, т.е. 1900 не е високосна, но 1600 и 2000 са
	 * високосни. Съставете програма, която по дадени ден, месец, година
	 * отпечатва следващата дата. Входни данни: три числа за ден, месец, година.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte day = input.nextByte();
		byte month = input.nextByte();
		short year = input.nextShort();
		byte newDay = 1;
		byte newMonth = 1;
		short newYear;

		if (year % 4 == 0 && year % 400 == 0) { // ако годината е високосна
			if (month == 2) {
				if (day == 29) {
					newMonth = (byte) (month + 1);
					System.out.println(newDay + ", " + newMonth + ", " + year);
				} else {
					newDay = (byte) (day + 1);
					newMonth = (byte) (month + 1);
					System.out.println(newDay + ", " + newMonth + ", " + year);
				}
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				if (day == 31) {
					if (month == 12) {
						newYear = (short) (year + 1);
						System.out.println(newDay + ", " + newMonth + ", " + newYear);
					} else {
						newMonth = (byte) (month + 1);
						System.out.println(newDay + ", " + newMonth + ", " + year);
					}
				} else {
					newDay = (byte) (day + 1);
					newMonth = (byte) (month + 1);
					System.out.println(newDay + ", " + newMonth + ", " + year);
				}
			}
		} else {
			if (month == 2) {
				if (day == 28) {
					newMonth = (byte) (month + 1);
					System.out.println(newDay + ", " + newMonth + ", " + year);
				} else {
					newDay = (byte) (day + 1);
					newMonth = (byte) (month + 1);
					System.out.println(newDay + ", " + newMonth + ", " + year);
				}
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				if (day == 31) {
					if (month == 12) {
						newYear = (short) (year + 1);
						System.out.println(newDay + ", " + newMonth + ", " + newYear);
					} else {
						newMonth = (byte) (month + 1);
						System.out.println(newDay + ", " + newMonth + ", " + year);
					}
				} else {
					newDay = (byte) (day + 1);
					newMonth = (byte) (month + 1);
					System.out.println(newDay + ", " + newMonth + ", " + year);
				}
			}
		}
	}
}
