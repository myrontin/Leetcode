package javaSolution.linkedList.deleteNodeInLinkedList;

import javaSolution.linkedList.ListNode;

public class Solution {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
