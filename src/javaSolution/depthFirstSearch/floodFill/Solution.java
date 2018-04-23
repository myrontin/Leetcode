package javaSolution.depthFirstSearch.floodFill;

public class Solution {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if (image[sr][sc] == newColor)
			return image;
		return fill(image, sr, sc, image[sr][sc], newColor);

	}

	public int[][] fill(int[][] image, int sr, int sc, int color, int newColor) {
		int row = image.length;
		int col = image[0].length;
		if (sr < 0 || sr >= row || sc < 0 || sc >= col)
			return null;
		if (image[sr][sc] == color) {
			image[sr][sc] = newColor;
			fill(image, sr - 1, sc, color, newColor);
			fill(image, sr + 1, sc, color, newColor);
			fill(image, sr, sc - 1, color, newColor);
			fill(image, sr, sc + 1, color, newColor);
		}

		return image;

	}
}
