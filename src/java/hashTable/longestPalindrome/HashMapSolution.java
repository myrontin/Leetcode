package java.hashTable.longestPalindrome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSolution {
	public int longestPalindrome(String s) {
		int result = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		List<Integer> list = new ArrayList<>(map.values());

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 1) {
				if (list.get(i) % 2 == 0) {
					result += list.get(i);
				} else {
					result += (list.get(i) - 1);
					list.remove(i);
					list.add(i, 1);
				}
			}
		}

		if (list.contains(1))
			return result + 1;
		return result;

	}
}
