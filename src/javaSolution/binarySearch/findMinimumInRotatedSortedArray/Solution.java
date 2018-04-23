package javaSolution.binarySearch.findMinimumInRotatedSortedArray;

public class Solution {
	public int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		if (nums.length == 1)
			return nums[0];
		while (left <= right) {
			int mid = (right - left) / 2 + left;
			// find minPos;
			if (nums[left] >= nums[right]) {
				// condition II
				if (mid != 0 && mid != nums.length - 1 && nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
					return nums[mid];
				}
				if (nums[mid] > nums[right]) {
					left = mid + 1;
				} else if (nums[mid] < nums[right]) {
					right = mid - 1;
				} else {
					int i = left;
					while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
						i++;
					}
					left = i;
					right = i + 1;
					if (right > nums.length - 1) {
						right = i;

					}
					return nums[right];
				}
			} else {
				return nums[left];
			}
		}
		return -1;

	}
}
