package LinkedList;

public class LeetCodeQuestion1290 {

	public static void main(String[] args) 
	{
		
	}
	public int getDecimalValue(ListNode head) 
	{
		ListNode temp = head;
		int count=-1;
		int num=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		temp=head;
		while(count>=0) {
			num = num + (int)(Math.pow(2, count)*temp.val);
			temp=temp.next;
			count--;
		}
		return num;
    }
}
