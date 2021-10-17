package LinkedList;

import java.util.Stack;

public class LeetCodeQuestion234 {

	public static void main(String[] args) {
	}
	public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> st = new Stack<Integer>();
        while(temp!=null) {
        	st.push(temp.val);
        	temp=temp.next;
        }
        temp=head;
        while(!st.isEmpty()) {
        	if(temp.val!=st.pop()) {
        		return false;
        	}
        	temp=temp.next;
        }
		return true;
    }
	public boolean isPalindromeNormal(ListNode head) {
		ListNode fast=head;
		ListNode slow = head;
		ListNode prev = null;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			ListNode temp = slow;
			slow = slow.next;
			temp.next = prev;
			prev = temp;
		}
		if(fast!=null) {
			slow=slow.next;
		}
		while(prev!=null && slow!=null) {
			if(prev.val!=slow.val)
				return false;
			slow=slow.next;
			prev=prev.next;
		}
		return slow==null && prev==null;
	}

}
