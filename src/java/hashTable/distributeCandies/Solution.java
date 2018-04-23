package java.hashTable.distributeCandies;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int distributeCandies(int[] candies) {
		int max = candies.length / 2;
		int result = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < candies.length; i++) {
			set.add(candies[i]);
		}
		result = Math.min(max, set.size());
		return result;
	}
}
