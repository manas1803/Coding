package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCodeQuestion148 {

	public static void main(String[] args) {
		
	}
	public ListNode sortList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(temp!=null) {
        	al.add(temp.val);
        	temp=temp.next;
        }
        temp = head;
        Collections.sort(al);
        for(int i : al) {
        	temp.val = i;
        	temp = temp.next;
        }
		return head;
    }
}
