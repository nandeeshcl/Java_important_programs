package part1;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {

		int a[] = { 2, 5, 1, 3, 6 };

		NavigableSet<Integer> set1 = new TreeSet<Integer>();

		for (int i : a) {
			set1.add(i);
		}

		NavigableSet<Integer> set2 = new TreeSet<Integer>(set1.descendingSet());

		System.out.println(set2);

		set2.pollFirst();

		System.out.println("Second element is: " + set2.first());

	}

}
