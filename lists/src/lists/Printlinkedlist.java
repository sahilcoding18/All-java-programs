package lists;
import java.util.Scanner;
public class Printlinkedlist {
public static Node<Integer> recursiveinsert(Node<Integer>head,int data,int pos)
{
	if(pos==0)
	{
		Node<Integer>newnode=new Node<>(data);
		newnode.next=head;
		return newnode;
	}
	if(head.next==null)
	{
		return head;
	}
	head.next=recursiveinsert(head.next,data,pos-1);
	return head;	
}
public static Node<Integer> insert(Node<Integer>head,int data,int pos)
{
	int i=0;
	Node<Integer>temp=head;
	Node<Integer>newnode=new Node<>(data);
	if(pos==0)
	{
		newnode.next=head;
	    return newnode;
	}
	while(i<pos-1)
	{
		temp=temp.next;
		i++;
	}
	newnode.next=temp.next;
	temp.next=newnode;
	return head;
}
	public static Node<Integer> takeinput()
	{
		/*
		   **In this class we are creating a method in linked list to take input from the user
		   *requirements
		   *scanner
		   *head
		   *new node
		   *data field
		 */
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer>head=null;
		Node<Integer>tail=null;
		while(data!=-1)
		{
			Node<Integer>newnode=new Node<>(data);
			if(head==null)
			{
				head=newnode;
				tail=newnode;
			}
			else
			{ 
	
//               Node<Integer>temp=head;
//				while(temp.next!=null)
//				{
//					temp=temp.next;
//				}
//				temp.next=newnode;
				tail.next=newnode;
				tail=tail.next;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer>head)
	{
		Node<Integer> temp=head;
		while(head!=null)
		{
			System.out.print("["+head.data+"]"+"-->");
			head=head.next;
		}
		 System.out.println();
	}
	public static void main(String[] args) {
//		Node<Integer>node1=new Node<>(10);
//		Node<Integer>node2=new Node<>(20);
//		Node<Integer>node3=new Node<>(30);
//		node1.next=node2;
//		node2.next=node3;
//		Node<Integer>head=node1;
		Node<Integer>head=takeinput();
		print(head);
		head=recursiveinsert(head,1000,6);
		print(head);
		
	}
}
