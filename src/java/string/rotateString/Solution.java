package java.string.rotateString;

public class Solution {
	public boolean rotateString(String A, String B) {
		String s = A + A;
		return s.contains(B);
	}
}
