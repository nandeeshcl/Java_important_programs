package part3;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {

		int a[] = { 1, 2, 0, 3, 0, 4 };

		int count = 0;
		int n = a.length;

		// all non zero elements are put at begining
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				a[count++] = a[i];
			}
		}

		// append all zero elements at end
		while (count < n) {
			a[count++] = 0;

		}

		// print
		System.out.println(Arrays.toString(a));

	}

}
