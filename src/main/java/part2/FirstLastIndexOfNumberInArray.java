package part2;

public class FirstLastIndexOfNumberInArray {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 4 };

		int n = 4;

		int firstindex = -1;
		int lastindex = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n && firstindex == -1) {
				firstindex = i;
			}

			if (a[i] == n && firstindex != -1) {
				lastindex = i;
			}
		}

		System.out.println("First index of a number " + n + " is " + firstindex);

		System.out.println("Last index of a number " + n + " is " + lastindex);

	}

}
