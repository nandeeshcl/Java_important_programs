package part2;

public class MaxMinValueInArray {

	public static void main(String[] args) {

		int a[] = { 2, 1, 4, 3, 55, 3, 9 };

		int max = a[0];

		for (int i : a) {
			if (i > max) {
				max = i;
			}
		}

		System.out.println("Max is: " + max);
	}

}
