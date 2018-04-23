package java.array.reshapeTheMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int x = 0;
		List<Integer> list = new ArrayList<>();
		for (int[] temp1 : nums) {
			for (int i : temp1) {
				list.add(i);
			}
		}
		if (r * c > list.size())
			return nums;
		int[][] result = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = list.get(x);
				x++;
			}
		}

		return result;

	}
}
