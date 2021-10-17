package LinkedList;

public class LeetCodeQuestions203 {

	public static void main(String[] args) {
		
	}
	public ListNode removeElements(ListNode head, int val) {
		ListNode temp=head;
		ListNode prev=null;
		
		while(temp!=null) {
			while(temp!=null && temp.val!=val) {
				prev=temp;
				temp=temp.next;
			}
			if(temp==null) {
				return head;
			}
			prev.next = temp.next;
			temp=prev.next;
		}
		return head;
    }

}
