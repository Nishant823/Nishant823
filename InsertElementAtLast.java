package linkedlist;

public class InsertElementAtLast {
	public static Node InsertAtLast(Node head,int num)
	{
		Node temp=new Node(num);
		if(head==null)
			return temp;
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=temp;
		return head;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=null;
		head=InsertAtLast(head,1);
		head=InsertAtLast(head,2);
		head=InsertAtLast(head,3);
		head=InsertAtLast(head,4);
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}

	}

}
