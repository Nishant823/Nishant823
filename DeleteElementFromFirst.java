package linkedlist;

public class DeleteElementFromFirst {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
	}
	public static Node delHead(Node head)
	{
		if(head==null)
		{
			return null;
		}
		return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head=delHead(head);
		print(head);

	}

}
