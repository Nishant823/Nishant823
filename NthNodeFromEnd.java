package linkedlist;
import java.util.Scanner;

public class NthNodeFromEnd {
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
		Node curr=head;
		int len=0;
		while(curr!=null)
		{
			len++;
			curr=curr.next;
		}
		if(head==null)
		{
			return ;
		}
		if(n>len)
		{
			return;
		}
		
		curr=head;
		for(int i=1;i<len-n+1;i++)
		{
			curr=curr.next;
		}
		System.out.println("The node is: "+curr.data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the nth node form last");
		int n=sc.nextInt();
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		print(head);
		nthNodeFromLast(head,n);
		
		sc.close();

	}

}
