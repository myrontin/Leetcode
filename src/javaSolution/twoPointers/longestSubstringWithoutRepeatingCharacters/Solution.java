package javaSolution.twoPointers.longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		int prev = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				prev = Math.max(prev, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - prev + 1);
		}
		return max;

	}
}
