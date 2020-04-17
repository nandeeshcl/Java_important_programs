package part1;

import utils.BaseClass;

public class FibinacciSeries extends BaseClass {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		int sum;

		System.out.println("Enter value of n:");
		int n = sc.nextInt();

		System.out.print(first + " " + second + " 5");

		for (int i = 2; i < n; i++) {
			sum = first + second;
			System.out.print(sum + " ");
			first = second;
			second = sum;
		}

	}

}
