package linkedlist;
import java.util.Scanner;


public class InsertInSortedLinkedList {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
	}
	public static Node insertAtSortedLinkedList(Node head,int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			return temp;
		}
		Node curr=head;
		while(curr.next!=null&&curr.next.data<temp.data)
		{
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
		
		System.out.print("Enter the number you want to enter: ");
		int data=sc.nextInt();
		head=insertAtSortedLinkedList(head,data);
		print(head);
		sc.close();
		

	}

}
