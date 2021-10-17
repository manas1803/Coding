package LinkedList;

public class LeetCodeQuestion328 {
	public ListNode oddEvenList(ListNode head) {
		ListNode myNode = head;
		
		ListNode result = new ListNode(0);
		ListNode temp = result;
		
		int count=1;
		while(myNode!=null) {
			if(count%2==1) {
				temp.next = new ListNode(myNode.val);
				temp=temp.next;
			}
			count++;
			myNode=myNode.next;
		}
		myNode = head;
		count=1;
		
		while(myNode!=null) {
			if(count%2==0) {
				temp.next = new ListNode(myNode.val);
				temp=temp.next;
			}
			count++;
			myNode=myNode.next;
		}
		
		return result.next;
    }
}
