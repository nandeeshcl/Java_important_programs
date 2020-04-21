package part2;

public class PowerOfNumber {

	public static void main(String[] args) {

		int base = 2;
		int exponent = 3;

		int power = 1;

		while (exponent > 0) {
			power = power * base;
			exponent--;
		}

		System.out.println(base + " to the power of " + exponent + " is " + power);
	}

}
