package java.binarySearch.findSmallestLetterGreaterThanTarget;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public char nextGreatestLetter(char[] letters, char target) {

		Set<Character> set = new HashSet<>();

		for (char c : letters) {
			set.add(c);
		}
		Character[] ch = set.toArray(new Character[set.size()]);
		Arrays.sort(ch);
		int lo = 0;
		int hi = ch.length - 1;
		if (target < ch[lo]) {
			return ch[lo];
		}
		if (target >= ch[hi]) {
			return ch[lo];
		}
		while (lo < hi) {
			int mid = (hi + lo) / 2;
			if (ch[mid] == target || mid == lo || mid == hi) {
				return ch[mid + 1];
			} else if (ch[mid] < target) {
				lo = mid;
			} else if (ch[mid] > target) {
				hi = mid;
			}
		}
		return ch[hi];

	}
}
