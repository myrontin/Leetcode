package javaSolution.string.rotatedDigits;

public class Solution {
	public static int rotatedDigits(int N) {
		int count = 0;
		while (N > 0) {
			String s = Integer.toString(N);
			if (!s.contains("3") && !s.contains("4") && !s.contains("7")) {
				if ((s.contains("0") || s.contains("1") || s.contains("8"))
						&& (s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9"))) {
					count++;
				} else if (s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")) {
					count++;
				}
			}
			N--;
		}
		return count;

	}
}
