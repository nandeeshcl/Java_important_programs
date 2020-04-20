package part1;

import java.util.ArrayList;
import java.util.Arrays;

//Anagram: two string having same character but order can change
public class Anagrams {

	public static void main(String[] args) {

		String s1 = "car";
		String s2 = "rac";

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		String s3 = new String(c1);
		String s4 = new String(c2);

		if (s3.equals(s4)) {
			System.out.println("Both the string are anagrams");
		}

		else {
			System.out.println("Both the string are not anagrams");
		}
	}

}
