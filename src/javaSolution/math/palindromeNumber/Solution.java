package javaSolution.math.palindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int i = x;
		int reverse = 0;
		while (i != 0) {
			reverse = reverse * 10 + i % 10;
			i /= 10;
		}
		if (reverse == x)
			return true;
		return false;

	}
}
