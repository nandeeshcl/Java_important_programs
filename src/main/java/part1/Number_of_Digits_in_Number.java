package part1;

import utils.BaseClass;

public class Number_of_Digits_in_Number extends BaseClass {

	public static void main(String[] args) {

		int count = 0;

		System.out.println("Eneter the number...");
		int num = sc.nextInt();

		int temp = num;

		while (num != 0) {
			num = num / 10; // 345 34 3
			count = count + 1;
		}

		System.out.println("Number of digits in " + temp + " is " + count);

	}

}
