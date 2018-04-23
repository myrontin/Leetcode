package java.dynamicProgramming.rangeSumQueryImmutable;

class NumArray {

	int[] sum;
	int[] nums;

	public NumArray(int[] nums) {
		sum = new int[nums.length + 1];
		sum[0] = 0;
		for (int i = 1; i < sum.length; i++) {
			sum[i] = nums[i - 1] + sum[i - 1];
		}
		this.nums = nums;

	}

	public int sumRange(int i, int j) {
		return sum[j + 1] - sum[i];
	}
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
 */