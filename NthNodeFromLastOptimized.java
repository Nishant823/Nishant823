package linkedlist;
import java.util.Scanner;

public class NthNodeFromLastOptimized {
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
	public static void nthNodeFromLast(Node head,int n)
	{
		Node second=head;
		Node first=head;
		int i=1;
		while(i<=n)
		{
			first=first.next;
			i++;
		}
		while(first!=null)
		{
			second=second.next;
			first=first.next;
		} 
		System.out.println("the nth node element is: "+second.data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter nth nodes: ");
		int n=sc.nextInt();
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		nthNodeFromLast(head,n);
		
		print(head);
		
		sc.close();

	}

}
