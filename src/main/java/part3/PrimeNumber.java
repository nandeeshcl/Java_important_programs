package part3;

import utils.BaseClass;

public class PrimeNumber extends BaseClass {

	static boolean isPrime;
	static int n;

	public static void main(String[] args) {

		System.out.println("Enter the number");
		n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

		}

		if (isPrime) {
			System.out.println(n + " is Prime number");
		}

		else {
			System.out.println(n + " is Not a Prime number");
		}

	}

}
