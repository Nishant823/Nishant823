package linkedlist;
import java.util.Scanner;

public class InserElementInLinkedList {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static Node InsertElement(Node head,int num)
	{
		Node temp=new Node(num);
		temp.next=head;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		System.out.print("Enter the element to insert in beginning :");
		int num=sc.nextInt();
		head=InsertElement(head,num);
		print(head);
		
		
		sc.close();

	}

}
