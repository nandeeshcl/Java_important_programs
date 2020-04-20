package part1;

import java.util.Stack;
import java.util.StringTokenizer;

class Test2 {
	static void reversE(String s) {

		Stack<Character> st = new Stack<Character>();

		char c[] = s.toCharArray();

		for (char i : c) {
			st.push(i);
		}

		while (!st.empty()) {
			System.out.print(st.pop() + " ");

		}

	}
}

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		StringTokenizer s = new StringTokenizer("Java Program Methods");

		while (s.hasMoreTokens()) {
			StringBuffer sb = new StringBuffer(s.nextToken());
			System.out.print(sb.reverse() + " ");
		}

		System.out.println();

		String s1 = new String("Welcom To Wipro");
		String st[] = s1.split(" ");

		for (String i : st) {
			StringBuffer sb = new StringBuffer(i);
			System.out.print(sb.reverse() + "  ");
			// System.out.print(i+" ");
		}

		System.out.println();

		// Method 3
		String str = new String("Welcom To Wipro");
		String st1[] = str.split(" ");

		for (String i : st1) {
			Test2.reversE(i);
		}

	}

}
