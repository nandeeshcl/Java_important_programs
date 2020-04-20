package part1;

import java.util.HashMap;

public class Occerence_of_each_Character_String {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		String s = "welcome to wipro";

		char c[] = s.toCharArray();

		for (char i : c) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		System.out.println(map);

	}

}
