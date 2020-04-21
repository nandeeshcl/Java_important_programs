package part1;

import utils.BaseClass;

//number which is sum of positive divisor   6=1+2+3  10!=1+2+5   6 is PN and 10 is not PN
public class PerfectNumber extends BaseClass {

	public static void main(String[] args) {

		int sum = 0;

		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) // if number is divisor then add
			{
				sum = sum + i;
			}
		}

		if (sum == num) {
			System.out.println("Number " + num + " is a perfect number");
		}

		else {
			System.out.println("Number " + num + " is a not perfect number");
		}

	}

}
