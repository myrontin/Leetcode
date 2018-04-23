package javaSolution.math.maximumProductOfThreeNumbers;

import java.util.Arrays;

public class Solution {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		max1 = nums[0] * nums[1];
		max2 = nums[nums.length - 1] * nums[nums.length - 2];
		max3 = Math.max(max1 * nums[nums.length - 1], max2 * nums[nums.length - 3]);

		return max3;

	}
}
