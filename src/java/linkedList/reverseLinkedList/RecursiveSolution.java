package java.linkedList.reverseLinkedList;

import java.linkedList.ListNode;

public class RecursiveSolution {

	public ListNode reverseList(ListNode head) {
		return reverseList(null, head);
	}

	public ListNode reverseList(ListNode newHead, ListNode head) {
		if (head == null)
			return newHead;
		ListNode node = head.next;
		head.next = newHead;
		return reverseList(head, node);
	}
}
