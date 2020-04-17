package part1;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 1, 5 };

		Arrays.sort(a);

		int n = a.length;
		int k = 5;

		int l = 0;
		int h = n - 1;

		boolean flag = false;

		while (l <= h) {
			int m = (l + h) / 2;

			if (a[m] == k) {

				System.out.println("EF");
				flag = true;
				break;
			}

			else if (a[m] < k) {
				l = m + 1;
			}

			else {
				h = m - 1;
			}
		}

		if (flag == false) {
			System.out.println("Element not found");
		}

		// Using built in Binary Search method in Arrays class
		System.out.println(Arrays.binarySearch(a, k)); // negative: NF Positive : Found
	}

}
