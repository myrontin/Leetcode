package java.tree.twoSumIVInputIsBST;

import java.tree.TreeNode;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	Set<Integer> set = new HashSet<>();

	public boolean findTarget(TreeNode root, int k) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null) {
			if (root.val != k)
				return false;
		}
		loadVal(root);
		for (Integer i : set) {
			if (set.contains(k - i) && i != k - i)
				return true;
		}
		return false;

	}

	public TreeNode loadVal(TreeNode root) {
		if (root != null) {
			loadVal(root.left);
			loadVal(root.right);
			set.add(root.val);
			return root;
		}
		return root;
	}
}
