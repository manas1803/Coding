package LinkedList;

public class LeetCodeQuestion876 {

	public static void main(String[] args) {
	}
	public ListNode middleNode(ListNode head) {
		ListNode fast=head;
		ListNode slow=head;
		ListNode temp = head;
		int len=0;
		while(temp!=null) {
			len++;
			temp=temp.next;
		}
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		if(len%2==0)
			slow=slow.next;
		return slow;
    }

}
