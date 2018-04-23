package java.binarySearch.search2DMatrix;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0)
			return false;
		int bot = 0;
		int top = matrix.length - 1;
		int m = matrix.length;
		int n = matrix[0].length;
		if (target < matrix[0][0])
			return false;
		if (target > matrix[m - 1][n - 1])
			return false;

		while (top >= bot) {
			int mid = (top - bot) / 2 + bot;
			if (target >= matrix[mid][0] && target <= matrix[mid][n - 1]) {
				int right = n - 1;
				int left = 0;

				while (right >= left) {
					int find = (right - left) / 2 + left;
					if (target == matrix[mid][find]) {
						return true;
					} else if (target < matrix[mid][find]) {
						right = find - 1;
					} else {
						left = find + 1;
					}
				}

			}
			if (target < matrix[mid][0]) {
				top = mid - 1;
			} else {
				bot = mid + 1;
			}

		}
		return false;
	}
}
