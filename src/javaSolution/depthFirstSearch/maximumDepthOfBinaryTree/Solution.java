package javaSolution.depthFirstSearch.maximumDepthOfBinaryTree;

import javaSolution.depthFirstSearch.sameTree.TreeNode;

public class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

	}
}
