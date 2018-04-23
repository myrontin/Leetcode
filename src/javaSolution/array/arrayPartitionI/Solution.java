package javaSolution.array.arrayPartitionI;

import java.util.Arrays;

public class Solution {

	public int arrayPairSum(int[] nums) {
		int pair = nums.length / 2;
		int i = nums.length - 1;
		int sum = 0;
		Arrays.sort(nums);
		while (pair > 0) {
			sum = sum + Math.min(nums[i], nums[i - 1]);
			i -= 2;
			pair--;
		}
		return sum;

	}
}
