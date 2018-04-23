package javaSolution.bitManipulation.baseSeven;

public class Solution {
	public String convertToBase7(int num) {
		if (num == 0)
			return "0";
		StringBuilder sb = new StringBuilder();
		int negative = 0;
		if (num < 0) {
			negative = 1;
			num = Math.abs(num);
		}
		while (num > 0) {
			sb.append(num % 7);
			num /= 7;
		}
		if (negative == 1)
			sb.append('-');

		return sb.reverse().toString();
	}
}
