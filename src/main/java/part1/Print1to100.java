package part1;

public class Print1to100 {

	public static void print(int n) {
		if (n <= 100) {
			System.out.print(n + " ");
			n = n + 1;
			print(n);
		}
	}

	public static void main(String[] args) {

		print(1);

	}

}
