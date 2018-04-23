package javaSolution.hashTable.islandPerimeter;

public class ArraySolution {
	public int islandPerimeter(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int count = 0;
		int neighbor = 0;
		int result = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == 1) {
					count++;
					if (i - 1 >= row && grid[i - 1][j] == 1)
						neighbor++;
					if (j - 1 >= col && grid[i][j - 1] == 1)
						neighbor++;
					if (i + 1 < row && grid[i + 1][j] == 1)
						neighbor++;
					if (j + 1 < col && grid[i][j + 1] == 1)
						neighbor++;
				}
			}
		}

		result = count * 4 - neighbor * 2;
		return result;
	}
}
