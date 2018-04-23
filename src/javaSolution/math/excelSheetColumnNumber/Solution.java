package javaSolution.math.excelSheetColumnNumber;

public class Solution {
	public int titleToNumber(String s) {
		char[] cs = s.toCharArray();
		int count = 0;
		int val = 0;
		int pow = cs.length - 1;
		for (int i = 0; i < cs.length; i++) {
			count = cs[i] - 64;
			val = val + (int) (count * Math.pow(26, pow));
			pow -= 1;
		}
		return val;
	}
}
