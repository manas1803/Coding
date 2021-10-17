package LinkedList;

public class LeetCodeQuestion61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode rotateRight(ListNode head, int k) {
		ListNode temp = head;
		int len = 1;
		while(temp.next!=null) 
		{
			temp=temp.next;
			len++;
		}
		int pos = len-k;
		temp.next=head;
		temp=head;
		for(int i=1;i<=pos-1;i++) {
			temp=temp.next;
		}
		head = temp.next;
		temp.next=null;
		return head;
    }

}
