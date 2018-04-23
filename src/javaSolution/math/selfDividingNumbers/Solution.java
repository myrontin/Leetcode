package javaSolution.math.selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
		int num = left;
		while (num <= right) {
			if (selfDivide(num)) {
				result.add(num);
			}
			num++;
		}
		return result;
	}

	public boolean selfDivide(int n) {
		int x = n;
		while (x > 0) {
			if (x % 10 == 0) {
				return false;
			}
			int y = 0;
			if (x > 10) {
				y = x % 10;
			} else {
				y = x;
			}
			if (n % y != 0) {
				return false;
			}
			x /= 10;
		}
		return true;
	}
}
