package java.tree.binaryTreePaths;

import java.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSSolution {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		Queue<String> sbQ = new LinkedList<>();
		String rootVal = Integer.toString(root.val);
		queue.add(root);
		sbQ.add(rootVal);
		result.add(rootVal);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			String sb = sbQ.poll();
			if (node.left != null) {
				String sbL = new String(sb);
				result.remove(sbL);
				sbL += "->" + node.left.val;
				sbQ.add(sbL);
				queue.add(node.left);
				result.add(sbL);
			}
			if (node.right != null) {
				String sbR = new String(sb);
				result.remove(sbR);
				sbR += "->" + node.right.val;
				sbQ.add(sbR);
				queue.add(node.right);
				result.add(sbR);
			}
		}

		return result;
	}
}
