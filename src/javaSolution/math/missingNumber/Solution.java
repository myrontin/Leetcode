package javaSolution.math.missingNumber;

public class Solution {
	public int missingNumber(int[] nums) {
		int max = nums.length;
		int total = sum(max);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		return total - sum;
	}

	public int sum(int n) {
		if (n == 0)
			return 0;

		return sum(n - 1) + n;
	}
}
