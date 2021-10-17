package LinkedList;

public class LeetCodeQuestion141 {

	public static void main(String[] args) 
	{
		
	}
	public boolean hasCycle(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        
        while(slow!=fast) {
        	if(fast==null || fast.next==null) {
        		return false;
        	}
        	slow=slow.next;
        	fast = fast.next.next;
        }
		return true;
    }
}
