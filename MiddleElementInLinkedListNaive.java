package linkedlist;

public class MiddleElementInLinkedListNaive {
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
		Node curr=head;
		int count=0;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		curr=head;
		for(int i=0;i<count/2;i++)
		{
			curr=curr.next;
			
		}
		System.out.println("The middle element in an array is: "+curr.data);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		
		print(head);
		printMiddle(head);

	}

}
