package java.hashTable.singleNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 0);
			} else {
				map.remove(nums[i]);
			}
		}
		Integer[] a = map.keySet().toArray(new Integer[1]);
		return a[0];

	}
}
