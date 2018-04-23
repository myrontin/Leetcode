package java.tree.sumOfLeftLeaves;

import java.tree.TreeNode;

public class Solution {
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		int result = 0;
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				result += root.left.val;
			} else {
				result += sumOfLeftLeaves(root.left);
			}
		}
		result += sumOfLeftLeaves(root.right);
		return result;
	}
}
