package javaSolution.dynamicProgramming.longestPalindromicSubstring;

public class Solution {
	public String longestPalindrome(String s) {
		int start = 0;
		int end = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isPalindrome(s, i - max, i)) {
				start = i - max;
				end = i;
				max += 1;
			}
			if (isPalindrome(s, i - max - 1, i)) {
				start = i - max - 1;
				end = i;
				max += 2;
			}
		}
		return s.substring(start, end + 1);

	}

	public boolean isPalindrome(String s, int start, int end) {
		if (start < 0)
			return false;
		while (start < end) {
			if (s.charAt(start++) != s.charAt(end--))
				return false;
		}
		return true;
	}
}
