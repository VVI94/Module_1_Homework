
public class Task14 {
	/*
	 * Да се състави метод, който приема за стойност число N и връща стойността на
	 * N! (N факториел).
	 */

	static long factorial(int n) {
		for (int end = n; end > 1; end--) {
			n *= (end - 1);
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

}
