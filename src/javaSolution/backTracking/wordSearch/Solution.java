package javaSolution.backTracking.wordSearch;

public class Solution {
	public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (findWord(board, word, i, j, 0))
					return true;
			}
		}
		return false;
	}

	public boolean findWord(char[][] board, String word, int x, int y, int i) {
		if (i >= word.length())
			return true;
		if (x < 0 || y < 0 || x > board.length - 1 || y > board[x].length - 1)
			return false;
		boolean exist = false;
		if (board[x][y] != word.charAt(i))
			return false;
		//word is used
		board[x][y] ^= 256;
		exist = findWord(board, word, x + 1, y, i + 1) || findWord(board, word, x - 1, y, i + 1)
				|| findWord(board, word, x, y + 1, i + 1) || findWord(board, word, x, y - 1, i + 1);
		board[x][y] ^= 256;

		return exist;
	}
}
