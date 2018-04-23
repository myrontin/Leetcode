package java.backTracking.subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		subsets(result, new ArrayList<>(), nums, 0);

		return result;
	}

	public void subsets(List<List<Integer>> result, List<Integer> root, int[] nums, int start) {
		result.add(root);

		for (int i = start; i < nums.length; i++) {
			root.add(nums[i]);
			subsets(result, new ArrayList<>(root), nums, i + 1);
			root.remove(root.size() - 1);
		}

	}
}
