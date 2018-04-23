package javaSolution.stack.nextGreaterElementI;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[nums1.length];
		for (int i = 0; i < nums2.length; i++) {
			map.put(nums2[i], i);
		}
		for (int i = 0; i < nums1.length; i++) {
			int j = map.get(nums1[i]);
			while (j < nums2.length) {
				if (nums2[j] > nums1[i]) {
					result[i] = nums2[j];
					break;
				} else {
					result[i] = -1;
				}
				j++;
			}

		}
		return result;
	}
}
