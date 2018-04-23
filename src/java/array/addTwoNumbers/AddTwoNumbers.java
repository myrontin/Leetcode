package java.array.addTwoNumbers;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addTwoNumbers(l1, l2, 0);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
		if(l1 == null &&l2==null &&carry==0) return null;
		if (l1 == null && l2 == null && carry != 0) {
			return new ListNode(carry);
		}
		
		if (l1 == null&&l2!=null) {
			return addTwoNumbers(new ListNode(0), l2, carry);
		}
		if (l2 == null&&l1!=null) {
			return addTwoNumbers(l1, new ListNode(0), carry);
		}
		

		if (l1.val + l2.val + carry < 10) {
			l1.val = l1.val + l2.val + carry;
			l1.next = addTwoNumbers(l1.next, l2.next, 0);
		} else {
			int i = (l1.val + l2.val + carry) / 10;
			l1.val = (l1.val + l2.val + carry) % 10;
			l1.next = addTwoNumbers(l1.next, l2.next, i);

		}
		return l1;
	}
}
