package javaSolution.binarySearch.twoSumInputArrayIsSorted;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int i = numbers[left] + numbers[right];
			if (i == target) {
				result[0] = left + 1;
				result[1] = right + 1;
				break;
			} else if (i > target) {
				right--;
			} else {
				left++;
			}
		}
		return result;
	}
}
