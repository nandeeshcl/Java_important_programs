package part1;

import java.util.HashMap;
import java.util.Set;

public class Number_which_occurs_odd_number_of_times {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 2, 3, 5, 4, 5, 5, 4 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : a) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			}

			else {
				map.put(i, 1);
			}

		}

		Set<Integer> set = map.keySet();
		for (int j : set) {
			if (map.get(j) % 2 != 0) {
				System.out.print(j + "  ");
			}
		}

	}

}
