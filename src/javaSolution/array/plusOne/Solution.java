package javaSolution.array.plusOne;

public class Solution {
	public static int[] plusOne(int[] digits) {

		digits[digits.length - 1] += 1;

		for (int i = digits.length - 1; i > -1; i--) {
			if (digits[i] == 10&&i!=0) {
				digits[i] = 0;
				digits[i - 1] += 1;
			}
		}
		if (digits[0] == 10) {
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			result[1] = 0;
			for (int i = 2; i < result.length; i++) {
				result[i] = digits[i - 1];
			}
			return result;
		}
		return digits;
	}

	public static void main(String[] args) {
		int[] a = {9};
		plusOne(a);
	}
}
