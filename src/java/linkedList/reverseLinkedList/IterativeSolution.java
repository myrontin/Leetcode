package java.linkedList.reverseLinkedList;

import java.linkedList.ListNode;

public class IterativeSolution {
	public ListNode reverseList(ListNode head) {

		if (head == null)
			return null;
		ListNode newHead = null;
		ListNode next = null;
		while (head.next != null) {
			next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		head.next = newHead;
		return head;
	}
}
