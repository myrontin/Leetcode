package javaSolution.hashTable.keyboardRow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public String[] findWords(String[] words) {
		List<String> result = new ArrayList<>();
		for (String s : words) {
			if (check(s)) {
				result.add(s);
			}
		}
		return result.toArray(new String[result.size()]);

	}

	public boolean check(String s) {
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";
		String row3 = "zxcvbnm";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < row1.length(); i++) {
			map.put(row1.charAt(i), 1);
		}
		for (int i = 0; i < row2.length(); i++) {
			map.put(row2.charAt(i), 2);
		}
		for (int i = 0; i < row3.length(); i++) {
			map.put(row3.charAt(i), 3);
		}
		s = s.toLowerCase();
		int row = map.get(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (map.get(s.charAt(i)) != row)
				return false;
		}
		return true;

	}
}
