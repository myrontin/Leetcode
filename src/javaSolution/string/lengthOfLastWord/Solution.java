package javaSolution.string.lengthOfLastWord;

public class Solution {
	public static int lengthOfLastWord(String s) {
		if (s.length() == 0)
			return 0;
		int i = s.length() - 1;
		int count = 0;
		while (i >= 0 && s.charAt(i) == ' ')
			i -= 1;
		while (i >= 0) {
			if (s.charAt(i) == ' ') {
				return count;

			}
			count++;
			i--;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("hello world"));
		System.out.println(lengthOfLastWord("a b    "));
		System.out.println(lengthOfLastWord("   "));

	}

}
