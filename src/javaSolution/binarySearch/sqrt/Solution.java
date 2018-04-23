package javaSolution.binarySearch.sqrt;

public class Solution {
	public int mySqrt(int x) {
		if (x == 1)
			return 1;
		int result = 0;
		int low = 0;
		int high = x;
		while (result * result != x) {
			result = low + (high - low) / 2;
			if (result > x / result)
				high = result;
			if (result < x / result)
				low = result;
			if (result <= x / result && result + 1 > x / (result + 1))
				return result;
		}
		return result;
	}
}
