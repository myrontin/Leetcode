package java.dynamicProgramming.countingBits;

public class SlowSolution {
	public static int[] countBits(int num) {
		if (num == 0)
			return new int[1];
		int[] sum = new int[num + 1];
		sum[0] = 0;
		sum[1] = 1;
		int pow = 1;
		for (int i = 2; i < sum.length; i++) {
			if (Math.pow(2, pow) == i) {
				sum[i] = 1;
				pow++;
			} else {
				int n = (int) (Math.pow(2, pow - 1));
				sum[i] = sum[n] + sum[i - n];
			}
		}
		return sum;
	}
}
