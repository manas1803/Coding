package LinkedList;

public class LeetCodeQuestion19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = head;
		int len = 0;
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		int pos = len - n;
		if (pos == 0) {
			return head.next;
		}
		temp = head;
		len=0;
		while(temp!=null) {
			len++;
			if(pos==len) {
				temp.next=temp.next.next;
			}
			temp=temp.next;
		}
		return head;
	}
}
