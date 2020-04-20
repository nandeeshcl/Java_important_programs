package part1;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		String s = "Java Programming";

		Stack<Character> st = new Stack<Character>();

		char c[] = s.toCharArray();

		for (char i : c) {
			st.push(i);
		}

		while (!st.empty()) {
			System.out.print(st.pop());

		}
		System.out.println();

	}

}
