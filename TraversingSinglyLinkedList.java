package linkedlist;

import java.util.Scanner;
class Inode{
	int data;
	Inode next;
	Inode(int x)
	{
		data=x;
		next=null;
	}
}

public class TraversingSinglyLinkedList {
	public static void printlist(Inode head)
	{
		Inode curr=head;
		while(curr!=null)
		{
			System.out.println(curr.next);
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Inode head=new Inode(10);
		head.next=new Inode(20);
		head.next.next=new Inode(30);
		head.next.next.next=new Inode(40);
		printlist(head);
		
		sc.close();

	}

}
