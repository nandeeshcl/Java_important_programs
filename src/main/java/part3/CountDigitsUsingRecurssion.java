package part3;

class Test {
	static int count(int n) {
		if (n == 0) {
			return 0;
		}

		return 1 + count(n / 10);

	}
}

public class CountDigitsUsingRecurssion {

	public static void main(String[] args) {

		System.out.println(Test.count(1234));

	}

}
