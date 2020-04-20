package part1;

class Test1 {
	static int fact(int n) {

		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}

	}
}

public class Factorial {

	public static void main(String[] args) {

		System.out.println(Test1.fact(5));

	}

}
