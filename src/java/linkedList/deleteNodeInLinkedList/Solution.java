package java.linkedList.deleteNodeInLinkedList;

import java.linkedList.ListNode;

public class Solution {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
