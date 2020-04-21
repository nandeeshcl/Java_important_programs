package part1;

import java.util.Set;
import java.util.TreeSet;

//common elements in an array
public class Intersection_of_Two_Array {

	public static void main(String[] args) {

		int a1[] = { 2, 3, 4, 5 };
		int a2[] = { 1, 3, 5, 6 };

		Set<Integer> s = new TreeSet<Integer>();

		for (int i : a1) {
			s.add(i);

		}

		for (int j : a2) {
			if (s.add(j)) {

			} else {
				System.out.print(j + " ");
			}

		}

	}

}
