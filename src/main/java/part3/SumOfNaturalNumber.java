package part3;

class Count {
	static int sum(int n) {
		if (n == 0) {
			return 0;
		}

		return n + sum(n - 1);
	}
}

public class SumOfNaturalNumber {

	public static void main(String[] args) {

		int n = 5;

		// Method 1: using formula
		int sum = n * (n + 1) / 2;
		System.out.println(sum);

		// Method 2:

		int res = 0;
		for (int i = 1; i <= n; i++) {
			res = res + i;
		}

		System.out.println(res);

		// Using recursion
		System.out.println(Count.sum(5));

	}

}
