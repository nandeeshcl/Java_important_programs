package part1;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2 };
		Set<Integer> set = new TreeSet<Integer>();

		for (int i : a) {
			if (set.add(i)) { }
			else {
				System.out.println("Duplicate element found: " + i);
			     }
		}

	}

}
