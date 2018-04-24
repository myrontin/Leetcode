package javaSolution.linkedList.rotateList;

import javaSolution.linkedList.ListNode;

public class Solution {

	public static ListNode rotateRight(ListNode head, int k) {
		ListNode node = head.next;

		while (k > 0) {
			ListNode first = head;
			while (head.next.next != null) {
				head = head.next;
			}
			node = head.next;
			head.next = null;
			node.next = first;
			k--;

		}
		return node;
	}

	public static ListNode rotateRight1(ListNode head, int k) {

		if (k == 0 || head == null)
			return head;
		int length = 1;
		ListNode first = head;
		while (head.next != null) {
			head = head.next;
			length++;
		}
		// connecting the end to first to form a circle
		head.next = first;
		// find the starting point
		int position = length - k % length;
		ListNode newHead = head;
		ListNode node = null;
		for (int i = 0; i < position + 1; i++) {
			if (i == position)
				node = newHead;
			newHead = newHead.next;
			if(node!=null)
			node.next=null;
		}

		// first.next = null;
		return newHead;

	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		rotateRight1(n1, 2);

	}

}
