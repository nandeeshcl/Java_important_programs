package part3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {

		String str = "sudeepu";

		char a[] = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character j : a) {
			if (map.containsKey(j)) {
				map.put(j, map.get(j) + 1);
			} else {
				map.put(j, 1);
			}
		}

		System.out.println(map);

		Set<Character> s = map.keySet();

		for (Character x : s) {
			if (map.get(x) > 1) {
				System.out.println("Dupliacate elemet found: " + x + " Number of time occured is: " + map.get(x));

			}
		}

	}

}
