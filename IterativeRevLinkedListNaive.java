package linkedlist;
import java.util.Scanner;
import java.util.ArrayList;

public class IterativeRevLinkedListNaive {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static Node revLinkedList(Node head)
	{
		ArrayList<Integer>arr=new ArrayList<Integer>();
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			arr.add(curr.data);
		}
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			curr.data=arr.remove(arr.size()-1);
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
		head=revLinkedList(head);
		print(head);
		
		sc.close();

	}

}
