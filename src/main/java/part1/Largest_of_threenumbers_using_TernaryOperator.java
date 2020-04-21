package part1;

public class Largest_of_threenumbers_using_TernaryOperator {

	public static void main(String[] args) {

		int a = 10, b = 222, c = 33;

		int large;

		large = (a > b) ? a : b;

		large = (large > c) ? large : c;

		System.out.println("Large is: " + large);

	}

}
