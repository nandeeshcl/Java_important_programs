package part3;

import utils.BaseClass;

public class PrimeNumberFrom1toN extends BaseClass {

	static boolean isPrime;

	public static void main(String[] args) {

		System.out.println("Enter the number");
		int n = sc.nextInt();

		System.out.println("Prime numbers from 1 to " + n + " are:");
		for (int i = 2; i <= n; i++) {
			isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			
			 if(isPrime) { System.out.print(i+" "); } //to print all
			 
		}

		

	}

}
