package java.binarySearchTree.minimumDistanceBetweenBSTNodes;

import java.tree.TreeNode;

public class Solution {
	int min = Integer.MAX_VALUE;
	int prev = -1;

	public int minDiffInBST(TreeNode root) {
		if (root == null)
			return 0;
		minDiffInBST(root.left);
		if (prev != -1) {
			min = Math.min(min, root.val - prev);
		}
		prev = root.val;
		minDiffInBST(root.right);
		return min;
	}
}
