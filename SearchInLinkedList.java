package linkedlist;
import java.util.Scanner;


public class SearchInLinkedList {
	public static int searchLinkedList(Node head,int num)
	{
		int pos=1;
		Node curr=head;
		while(curr!=null)
		{
			if(curr.data==num)
			{
				return pos;
			}
			pos++;
			curr=curr.next;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		System.out.print("Enter the number to search: ");
		int num=sc.nextInt();
		int pos=searchLinkedList(head,num);
		System.out.println("the element is present at "+pos+" position");
		sc.close();
		
		
		

	}

}
