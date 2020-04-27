package part3;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		int a[] = { 2, 1, 3, 5, 6, 0, 1 };

		Stack<Integer> s = new Stack<Integer>();

		for (int i = 0; i < a.length; i++) {
			// initially stack is empty push frst element
			if (s.isEmpty()) {
				s.push(a[i]);
			}

			else
			// Logic:
			{
				while (!s.isEmpty() && s.peek() < a[i]) {
					System.out.println("Next greater element of: " + s.peek() + " is: " + a[i]);
					s.pop();
				}

				s.push(a[i]);
			}

			// to print all at last which has no next greater element print its next greater
			// is null
		}

		while (!s.isEmpty()) {
			System.out.println("Next greater element of: " + s.peek() + " is: " + null);
			s.pop();
		}

	}

}
