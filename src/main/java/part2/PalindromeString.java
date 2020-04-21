package part2;

import java.util.Stack;

public class PalindromeString {

	public static void main(String[] args) {

		// Method 1
		String str = "Appu";
		char ch[] = str.toCharArray();
		String rev = "";
		Stack s = new Stack();
		for (char c : ch) {
			s.push(c);
		}
		while (!s.isEmpty()) {
			rev = rev + s.pop();
		}
		System.out.println(rev);

		// Method2
		String str1 = "Appu";
		char ch1[] = str.toCharArray();
		String rev1 = "";

		for (int i = ch1.length - 1; i >= 0; i--) {
			rev1 = rev1 + ch1[i];
		}
		System.out.println(rev);

	}

}
