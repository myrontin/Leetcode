package java.math.constructTheRectangle;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] constructRectangle(int area) {
		int[] result = new int[2];
		Map<Integer, Integer[]> map = new HashMap<>();
		int count = 1;
		for (int i = 1; i < area + 1; i++) {
			Integer[] t = new Integer[2];
			if (area % i == 0) {
				t[0] = i;
				t[1] = area / i;
				map.put(count, t);
				count++;
			}
		}
		if (count % 2 == 0) {
			Integer[] i = map.get(count / 2);
			result[0] = i[0];
			result[1] = i[1];
		} else {
			Integer[] i = map.get((count / 2) + 1);
			result[0] = i[0];
			result[1] = i[1];

		}

		return result;

	}
}
