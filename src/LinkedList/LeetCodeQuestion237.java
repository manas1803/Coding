package LinkedList;

public class LeetCodeQuestion237 {

	public static void main(String[] args) {

	}
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node = node.next;
    }

}
