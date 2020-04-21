package part2;

public class MissingNumber {

	public static void main(String[] args) {

		// Method 1
		int a[] = { 2, 1, 5, 3, 4, 7 };

		int n = a.length + 1;

		int sum = (n * (n + 1)) / 2;

		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
		}

		System.out.println("Missing numbe is: " + sum);

		// Method 2
		int b[] = { 2, 3, 4, 6, 7 };

		int c = 0;

		for (int j : b) {
			c = c + j;
		}

		int d = 0;
		for (int i = 2; i <= 7; i++) {
			d = d + i;
		}

		System.out.println("Missing number is: " + (d - c));

	}

}
