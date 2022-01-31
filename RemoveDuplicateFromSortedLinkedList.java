package linkedlist;
import java.util.Scanner;

public class RemoveDuplicateFromSortedLinkedList {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static Node removeDuplicate(Node head)
	{
		if(head==null)
		{
			return null;
		}
		if(head.next==null)
		{
			return head;
		}
		Node curr=head;
		while(curr!=null)
		{
			while(curr.next!=null&&curr.data==curr.next.data)
			{
				Node temp=curr.next.next;
				curr.next=temp;
			}
			curr=curr.next;
		}
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Node head=new Node(arr[0]);
		Node curr=head;
		for(int i=1;i<n;i++)
		{
			curr.next=new Node(arr[i]);
			curr=curr.next;
		}
		head=removeDuplicate(head);
		print(head);
		sc.close();

	}

}
