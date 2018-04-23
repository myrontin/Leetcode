package javaSolution.tree.invertBinaryTree;

import javaSolution.depthFirstSearch.sameTree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null)
			return root;
		queue.add(root);
		while (!queue.isEmpty()) {
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				TreeNode node = queue.poll();
				stack.add(node.left);
				stack.add(node.right);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
				node.left = stack.pop();
				node.right = stack.pop();
			}

		}
		return root;
	}
}
