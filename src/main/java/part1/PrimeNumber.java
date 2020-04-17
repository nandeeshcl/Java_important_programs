package part1;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 11;
		int count = 0;

		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}

			if (count == 1) {
				System.out.println("Prime number");
			}

			else {
				System.out.println("Not a prime number");
			}
		}

		else {
			System.out.println("Not a prime number");
		}

	}

}
