package lists;
public class Linkedlistuse {
public static void main(String args[])
{
	Node<Integer>node1=new Node<Integer>(10);
	System.out.println(node1.data+" "+node1.next);
	Node<Integer>node2=new Node<Integer>(20);
	node1.next=node2;
	System.out.println(node1.data+" "+node1.next);
}
}
