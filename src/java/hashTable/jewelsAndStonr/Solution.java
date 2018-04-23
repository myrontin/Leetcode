package java.hashTable.jewelsAndStonr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int numJewelsInStones(String J, String S) {
		Map<Character, Integer> map = new HashMap<>();
		int result = 0;
		for (int j = 0; j < J.length(); j++) {
			map.put(J.charAt(j), 0);
		}
		for (int s = 0; s < S.length(); s++) {
			if (map.containsKey(S.charAt(s))) {
				map.put(S.charAt(s), map.get(S.charAt(s)) + 1);
			}
		}
		List<Integer> list = new ArrayList<>(map.values());
		for (int i : list) {
			result += i;
		}

		return result;
	}
}
