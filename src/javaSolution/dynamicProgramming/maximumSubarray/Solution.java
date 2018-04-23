package javaSolution.dynamicProgramming.maximumSubarray;

public class Solution {
	public int maxSubArray(int[] nums) {
		int me = nums[0];
		int msf = nums[0];
		for (int i = 1; i < nums.length; i++) {
			me += nums[i];
			me = Math.max(me, nums[i]);
			msf = Math.max(me, msf);
		}
		return msf;
	}
}
