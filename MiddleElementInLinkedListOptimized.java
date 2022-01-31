package linkedlist;

public class MiddleElementInLinkedListOptimized {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
			
		}
		System.out.println();
	}
	public static void printMiddle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("the middle element in an linked list is: "+slow.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		print(head);
		printMiddle(head);
		

	}

}
