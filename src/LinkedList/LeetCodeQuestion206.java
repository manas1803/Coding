package LinkedList;

import java.util.Stack;

public class LeetCodeQuestion206 {

	public static void main(String[] args) 
	{
		
	}
	 public ListNode reverseList(ListNode head) 
	 {
		 ListNode temp = head;
		 Stack<Integer> st = new Stack<Integer>();
		 while(temp!=null) {
			 st.push(temp.val);
			 temp=temp.next;
		 }
		 temp = head;
		 while(!st.isEmpty()) {
			 temp.val = st.pop();
			 temp=temp.next;
		 }
		 return head;
	 }
	 public ListNode reverseListNormal(ListNode head) {
		 ListNode prev = null;
		 ListNode curr = head;
		 ListNode next = null;
		 
		 while(curr!=null) {
			 next = curr.next;
			 curr.next = prev;
			 prev = curr;
			 curr = next;
		 }
		 return head;
	 }

}
