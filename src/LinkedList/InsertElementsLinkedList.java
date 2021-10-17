package LinkedList;

import java.util.Stack;

public class InsertElementsLinkedList {

	Node list = null;
	
	public void AddElementsAtStart(int data) {
		if(list==null) {
			list = new Node(data);
		}
		else {
			Node temp = new Node(data);
			temp.next = list;
			list = temp;
		}
	}
	public Node AddElementsAtEnd(int data) {
		Node temp = list;
		if(list==null)
			list = new Node(data);
		else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = new Node(data);
		}
		return list;
	}
	public int LengthOfLinkedList() {
		int len=1;
		Node temp = list;
		while(temp.next!=null) {
			len++;
			temp=temp.next;
		}
		return len;
	}
	public int MiddleElementOfLinkedList() {
		Node doubleTemp=list;
		Node temp=list;
		int data=0;
		while(doubleTemp!=null && doubleTemp.next!=null) {
			temp = temp.next;
			doubleTemp = doubleTemp.next.next;
		}
		return temp.data;
	}
	public boolean FindElementInLinkedList(int data) {
		Node temp = list;
		while(temp!=null) {
			if(temp.data==data) {
				return true;
			}
			temp = temp.next;
		}
		
		return false;
	}
	public void RemoveDuplicates() {
		Node temp = list;
		while(temp!=null && temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;
			}
			else {
				temp = temp.next;
			}
		}
	}
	public void SortLinkedList() {
		Node temp = list;
		int[] countArr = {0,0,0};
		while(temp!=null) {
			countArr[temp.data]++;
			temp = temp.next;
		}
		temp=list;
		int i=0;
		while(temp!=null) {
			if(countArr[i]==0)
				i++;
			else {
				temp.data=i;
				countArr[i]--;
				temp=temp.next;
			}
		}
	}
	public void ReverseLinkedListStackMethod() {
		Stack<Integer> st = new Stack<Integer>();
		
		Node temp = list;
		while(temp!=null) {
			st.push(temp.data);
			temp = temp.next;
		}
		temp=list;
		while(!st.isEmpty()) {
			temp.data = st.peek();
			st.pop();
			temp = temp.next;
		}	
	}
	public void ReverseLinkedList() {
		Node prev = null;
		Node next=null;
		Node current = list;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		list = prev;
	}
	public void PrintLinkedList() {
		Node temp = list ;
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public boolean CheckPalindromeStackMethod() {
		Node temp = list;
		Stack<Integer> st = new Stack<Integer>();
		while(temp!=null) {
			st.push(temp.data);
			temp=temp.next;
		}
		temp=list;
		while(!st.isEmpty()) {
			if(temp.data!=st.pop())
				return false;
			temp=temp.next;
		}
		return true;
	}
	public boolean CheckPalindromeNormalMethod() {
		Node fast = list;
		Node slow = list;
		Node prev = null;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			
			Node temp = slow;
			slow=slow.next;
			temp.next = prev;
			prev = temp;
		}
		if(fast!=null) {
			slow=slow.next;
		}
		while(prev!=null && slow!=null) {
			if(prev.data!=slow.data)
				return false;
			slow=slow.next;
			prev=prev.next;
		}
		return slow==null && prev==null;
	}
	public static void main(String[] args) {
		// Inserting at start
		InsertElementsLinkedList li = new InsertElementsLinkedList();
		
		li.AddElementsAtStart(12);
		li.AddElementsAtStart(22);
		li.AddElementsAtStart(21);
		li.AddElementsAtStart(23);
		li.AddElementsAtStart(25);
		li.AddElementsAtStart(14);
		li.AddElementsAtStart(13);
		
		// Inserting Elements at end
		li.AddElementsAtEnd(10);
		li.AddElementsAtEnd(20);
		li.AddElementsAtEnd(30);
		li.AddElementsAtEnd(40);
		li.AddElementsAtEnd(51);
		li.AddElementsAtEnd(60);
		li.AddElementsAtEnd(7);
		
		li.PrintLinkedList();
		System.out.println("Length of the list is " + li.LengthOfLinkedList());
		System.out.println("The middle element is "+ li.MiddleElementOfLinkedList());
		System.out.println("The element 7 is present in the list true or false? " + li.FindElementInLinkedList(7));
//		li.RemoveDuplicates();
//		System.out.println("List post removing the duplicates");
//		li.PrintLinkedList();
		
//		li.SortLinkedList();
//		li.PrintLinkedList();
		
		System.out.println("Linked List reversed using Stack method");
		li.ReverseLinkedListStackMethod();
		li.PrintLinkedList();
		
		System.out.println("Linked List reversed using normal method");
		li.ReverseLinkedList();
		li.PrintLinkedList();
		
		System.out.println("Check for Palindrome Stack Method");
		System.out.println(li.CheckPalindromeStackMethod());
		
		System.out.println("Check for Palindrome Normal Method");
		System.out.println(li.CheckPalindromeNormalMethod());
	}

}
