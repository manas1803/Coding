package LinkedList;

public class LeetCodeQuestion2 {

	ListNode l1=null;
	ListNode l2=null;
	public static void main(String[] args) {
		LeetCodeQuestion2 le = new LeetCodeQuestion2();
		ListNode l1 = new ListNode();
		le.AddElementsAtStart(2,1);
		le.AddElementsAtStart(4,1);
		le.AddElementsAtStart(3,1);
		
		ListNode l2 = new ListNode();
		le.AddElementsAtStart(5,2);
		le.AddElementsAtStart(6,2);
		le.AddElementsAtStart(4,2);
		le.PrintLinkedList(le.addTwoNumbers(l1, l2));
	}
	public void AddElementsAtStart(int data,int x) {
		if(x==1) {
			if(l1==null) {
				l1 = new ListNode(data);
			}
			else {
				ListNode temp = new ListNode(data);
				temp.next = l1;
				l1 = temp;
			}
		}
		else {
			if(l2==null) {
				l2 = new ListNode(data);
			}
			else {
				ListNode temp = new ListNode(data);
				temp.next = l2;
				l2 = temp;
			}
		}
	}
	public void PrintLinkedList(ListNode node) {
		ListNode temp = node;
		while(temp!=null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode result = head;
		int carry=0;
		while(l1!=null && l2!=null) {
			int x = (l1!=null)? l1.val:0;
			int y = (l2!=null)? l2.val:0;
			int sum = carry+x+y;
			carry = sum/10;
			sum=sum%10;
			result.next = new ListNode(sum);
			result=result.next;
		}
		if(carry==1) {
			result.next = new ListNode(carry);
		}
		return head.next;
    }

}
