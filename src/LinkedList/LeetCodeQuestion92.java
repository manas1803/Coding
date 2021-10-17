package LinkedList;

import java.util.Stack;

public class LeetCodeQuestion92 {

	public static void main(String[] args) {

	}
	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode temp=head;
		int count=1;
		Stack<Integer> st = new Stack<>();
		for(int i=2;i<=left;i++) {
			temp=temp.next;
		}
		for(int i=left;i<=right;i++) {
			st.push(temp.val);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null) {
			if(count==left) {
				while(!st.isEmpty()) {
					temp.val = st.pop();
					temp=temp.next;
				}
				count++;
			}
			count++;
			temp=temp.next;
		}
		return head;
    }

}
