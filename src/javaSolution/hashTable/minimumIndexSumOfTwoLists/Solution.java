package javaSolution.hashTable.minimumIndexSumOfTwoLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public String[] findRestaurant(String[] list1, String[] list2) {
		int min = 9999;
		int sum = 0;
		Map<String, Integer> map = new HashMap<>();
		List<String> result = new ArrayList<>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}

		for (int i = 0; i < list2.length; i++) {
			if (map.containsKey(list2[i])) {
				sum = map.get(list2[i]) + i;

				if (min == sum) {
					result.add(list2[i]);
				} else if (min > sum) {
					min = sum;
					result.clear();
					result.add(list2[i]);
				}

			}
		}

		return result.toArray(new String[result.size()]);
	}
}
