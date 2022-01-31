package linkedlist;

import java.util.Scanner;

public class DeleteAtGivenPosition {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static int getLength(Node head)
	{
		if(head==null)
		{
			return 0;
		}
		return 1+getLength(head.next);
	}
	public static Node deleteAtPosition(Node head,int pos)
	{
		if(head==null)
		{
			return null;
		}
		if(pos==1)
		{
			return head.next;
		}
		if(pos==getLength(head))
		{
			Node curr=head;
			while(curr.next.next!=null)
			{
				curr=curr.next;
			}
			curr.next=null;
			return head;
			
		}
		Node curr=head;
		int i=1;
		while(i<pos-1)
		{
			curr=curr.next;
			i++;
		}
		curr.next=curr.next.next;
		
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		System.out.print("Enter the position of node to delete: ");
		int pos=sc.nextInt();
		head=deleteAtPosition(head,pos);
		print(head);
		sc.close();

	}

}
