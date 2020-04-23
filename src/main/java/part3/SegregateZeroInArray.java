package part3;

import java.util.Arrays;

public class SegregateZeroInArray {

	public static void main(String[] args) {

		int a[] = { 0, 1, 0, 1, 0, 0, 1, 1 };

		int count = 0;
		int n = a.length;

		// all non zero elements are put at begining
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				a[count++] = a[i];
			}
		}

		// append all zero elements at end
		while (count < n) {
			a[count++] = 1;

		}

		// print
		System.out.println(Arrays.toString(a));

	}

}
