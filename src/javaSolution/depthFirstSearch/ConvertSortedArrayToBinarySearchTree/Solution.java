package javaSolution.depthFirstSearch.ConvertSortedArrayToBinarySearchTree;

import javaSolution.depthFirstSearch.sameTree.TreeNode;

public class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	public TreeNode sortedArrayToBST(int[] nums, int low, int high) {
		if (low > high)
			return null;
		int mid = (high + low) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(nums, low, mid - 1);
		node.right = sortedArrayToBST(nums, mid + 1, high);
		return node;

	}
}
