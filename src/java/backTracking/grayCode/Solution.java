package java.backTracking.grayCode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<>();
		result.add(0);
		if (n == 0)
			return result;
		result.add(1);
		for (int i = 1; i < n + 1; i++) {
			grayCode(result, i);
		}
		return result;

	}

	public void grayCode(List<Integer> result, int n) {
		if (n == 1)
			return;
		int start = (int) Math.pow(2, n - 1);
		int k = start - 1;
		for (int i = start; i < Math.pow(2, n); i++) {
			result.add(result.get(k) + start);
			k--;
		}

	}
}
