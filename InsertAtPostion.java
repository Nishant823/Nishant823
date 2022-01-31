package linkedlist;

import java.util.Scanner;

public class InsertAtPostion {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static Node insertAtPosition(Node head,int pos,int data)
	{
		Node temp=new Node(data);
		Node curr=head;
		int i=1;
		while(i<=pos-2)
		{
			i++;
			curr=curr.next;
		}
		temp.next=curr.next;
		curr.next=temp;
		
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
		System.out.print("Enter the position to enter the node: ");
		int pos=sc.nextInt();
		System.out.print("Enter the data to enter in linked list: ");
		int data=sc.nextInt();
		head=insertAtPosition(head,pos,data);
		print(head);
		sc.close();
		

	}

}
