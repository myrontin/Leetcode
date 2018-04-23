package java.array.longestContinuousIncreasingSubsequence;

public class DPSolution {
	public int findLengthOfLCIS(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int[] dp = new int[nums.length];
		int max = 0;
		dp[0] = 1;

		for (int i = 1; i < dp.length; i++) {
			if (nums[i] > nums[i - 1]) {
				dp[i] = dp[i - 1] + 1;
			} else {
				dp[i] = 1;
			}
			max = Math.max(dp[i], max);
		}
		return max;
	}
}
