package javaSolution.trie.longestWordInDictionary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public String longestWord(String[] words) {
		if (words.length == 0)
			return "";
		String result = "";
		Arrays.sort(words);
		Set<String> set = new HashSet<>();
		int max = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == 1) {
				set.add(words[i]);
				max = 1;
			} else if (set.contains(words[i].substring(0, words[i].length() - 1))) {
				set.add(words[i]);
				max = Math.max(max, words[i].length());
			}
			if (max == words[i].length() && max > result.length()) {
				result = words[i];
			}

		}

		return result;
	}
}
