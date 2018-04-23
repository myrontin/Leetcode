package java.backTracking.subsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		subsetsWithDup(result, new ArrayList<>(), nums, 0);
		return result;
	}

	public void subsetsWithDup(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
		result.add(new ArrayList<>(temp));

		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i - 1])
				continue;
			temp.add(nums[i]);
			subsetsWithDup(result, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
	}
}
