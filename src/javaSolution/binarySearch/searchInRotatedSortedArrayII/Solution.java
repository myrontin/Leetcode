package javaSolution.binarySearch.searchInRotatedSortedArrayII;

public class Solution {
	public boolean search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = (right - left) / 2 + left;
			if (nums[mid] == target)
				return true;
			// left sorted
			if (nums[mid] > nums[left] || nums[mid] > nums[right]) {
				if (target >= nums[left] && target <= nums[mid])
					right = mid - 1;
				else
					left = mid + 1;
			}
			// right sorted
			else if (nums[mid] < nums[left] || nums[mid] < nums[right]) {
				if (target <= nums[right] && target >= nums[mid])
					left = mid + 1;
				else
					right = mid - 1;

			} else {
				right--;
			}
		}
		return false;
	}
}
