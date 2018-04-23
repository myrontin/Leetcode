package java.string.detectCapital;

public class Solution {
	public boolean detectCapitalUse(String word) {
		if (word.length() < 2)
			return true;
		if (word.toUpperCase().equals(word))
			return true;
		if (word.substring(1).equals(word.toLowerCase().substring(1)))
			return true;
		return false;
	}
}
