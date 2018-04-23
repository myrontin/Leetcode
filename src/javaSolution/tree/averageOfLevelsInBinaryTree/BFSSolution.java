package javaSolution.tree.averageOfLevelsInBinaryTree;

import javaSolution.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSSolution {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null)
			return result;
		queue.add(root);
		while (!queue.isEmpty()) {
			double sum = 0;
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				TreeNode node = queue.poll();
				sum += node.val;
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			result.add(sum / n);

		}

		return result;
	}
}
