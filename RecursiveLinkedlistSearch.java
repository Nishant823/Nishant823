package linkedlist;
import java.util.Scanner;

public class RecursiveLinkedlistSearch {
	public static int recursiveLinkedListSearch(Node head,int num)
	{
		if(head==null)
			return -1;
		if(head.data==num)
			return 1;
		else
		{
			int res=recursiveLinkedListSearch(head.next,num);
			if(res==-1)
				return -1;
			else {
				return res+1;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		System.out.print("Enter the number to find: ");
		int num=sc.nextInt();
		int pos=recursiveLinkedListSearch(head,num);
		System.out.println("The element is present at "+pos+" position");
		sc.close();

	}

}
