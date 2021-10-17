package LinkedList;

import java.util.HashSet;

public class LeetCodeQuestion160 {

	public static void main(String[] args) {
		
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		HashSet<ListNode> set = new HashSet<>();
		while(temp1!=null) {
			set.add(temp1);
			temp1 = temp1.next;
		}
		while(temp2!=null) {
			if(set.contains(temp2))
				return temp2;
			temp2=temp2.next;
		}
		return null;
    }

}
