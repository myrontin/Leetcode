package java.backTracking.combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<>();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i + 1;
		}
		combine(result, new ArrayList<>(), nums, k, 0);
		return result;
	}

	public void combine(List<List<Integer>> result, List<Integer> temp, int[] nums, int k, int start) {
		if (temp.size() == k) {
			result.add(new ArrayList<>(temp));
		}
		for (int i = start; i < nums.length; i++) {
			if (temp.contains(nums[i]))
				continue;
			temp.add(nums[i]);
			combine(result, temp, nums, k, i);
			temp.remove(temp.size() - 1);
		}

	}
}
