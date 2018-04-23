package java.backTracking.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		permute(result, new ArrayList<>(), nums);
		return result;
	}

	public void permute(List<List<Integer>> result, List<Integer> root, int[] nums) {
		if (root.size() == nums.length) {
			result.add(new ArrayList<>(root));
		}
		for (int i = 0; i < nums.length; i++) {
			if (root.contains(nums[i]))
				continue;
			root.add(nums[i]);
			permute(result, root, nums);
			root.remove(root.size() - 1);

		}
	}
}
