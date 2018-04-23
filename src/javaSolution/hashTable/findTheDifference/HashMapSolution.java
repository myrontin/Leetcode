package javaSolution.hashTable.findTheDifference;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {
	public char findTheDifference(String s, String t) {
		char c = 'a';
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else
				map.put(s.charAt(i), 1);
		}
		for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);

				if (map.get(t.charAt(i)) == -1) {
					map.remove(t.charAt(i));
				}
			}
			if (!map.containsKey(t.charAt(i))) {
				c = t.charAt(i);
			}
		}
		return c;

	}
}
