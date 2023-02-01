package treess;
class Node<T> {
	T data;
	Node next;
public Node(T data) {
		this.data = data;
		this.next = null;
	}
public class Queueusinglinkedlist<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
public Queueusinglinkedlist() {
	    front=null;
	    rear=null;
	    size=0;
	}
public int getSize() {
		return size;
	}
public boolean isEmpty() {
		return (size==0);
	}
public int front()  {
	    if(size==0) return -1;
	    return front.data;   
	    
	}    
public void enqueue(int data) 
	{	if(size==0)
		{
			Node newnode=new Node(data);  
	    	front=newnode;
	        rear=newnode;
	    	size++;
		}
	 	else{     	
	        Node newnode=new Node(data);
	 	   	rear.next=newnode;
	 	   	rear=rear.next;
	 	   	size++;
	    }
	}
	public int dequeue()  {
		if(size==0){
	        	return -1;
	    }
	    if(size==1)
	    {T temp=front.data;
	    	 front=null;
	    	rear=null;
	    	size=0; 
	     return (int) temp;
	    }
	    else{
		T temp=front.data;
	    front=front.next;
	    size--;
	    return (int) temp;  
	    }
	}
}
}
