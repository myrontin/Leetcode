package javaSolution.hashTable.longestPalindrome;

import java.util.HashSet;
import java.util.Set;

public class HashSetSolution {
	public int longestPalindrome(String s) {
		if (s.length() == 1)
			return 1;
		Set<Character> set = new HashSet<>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				set.remove(s.charAt(i));
				count++;
			} else {
				set.add(s.charAt(i));
			}

		}
		count *= 2;
		if (!set.isEmpty())
			count++;
		return count;

	}
}
