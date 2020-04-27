package part3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberPair {

	public static int[] pair(int a[], int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}

		for (int i = 0; i < a.length; i++) {
			int diff = target - a[i];

			if (map.containsKey(diff) && map.get(diff) != i) {
				return new int[] { i, map.get(diff) };
			}

		}

		throw new IllegalArgumentException("No pair found");

	}

	public static void main(String[] args) {

		// Method 1:
		int a[] = { 2, 5, 7, 11 };
		int num = 16;

		/*
		 * Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		 * 
		 * for (int i = 0; i < a.length; i++) { map.put(a[i], i); }
		 * 
		 * for (int i = 0; i < a.length; i++) { int diff = num - a[i];
		 * 
		 * if (map.containsKey(diff)) { System.out.print(diff + "  "); }
		 * 
		 * }
		 */

		// method 2
		System.out.println(Arrays.toString(pair(a, num)));

	}

}
