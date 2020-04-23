package part3;

public class MatrixAddition {

	public static void main(String[] args) {
		int m, n, i, j;

		int first[][] = { { 1, 2 }, { 5, 10 }, { 2, 6 } };
		int second[][] = { { 2, 6 }, { 1, 2 }, { 5, 3 } };

		m = first.length; // rows in first matrix
		n = first[0].length; // columns in first matrix

		int sum[][] = new int[m][n];

		// System.out.println("Calculating Sum of 2 matrices....");

		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				sum[i][j] = first[i][j] + second[i][j]; // replace '+' with '-' to subtract matrices

		System.out.println("Sum of 2 matrices....");

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				System.out.print(sum[i][j] + "\t");

			System.out.println();
		}

	}

}
