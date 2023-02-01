package stacks;
public class QueueusingArray {
 private int data[];
 private int front;
 private int rear;
 private int size;
  public  QueueusingArray()
  {
	  data=new int [10];
	  front=-1;
	  rear=-1;
	  size=0;
  }
  public QueueusingArray(int capacity)
  {
	  data=new int [capacity];
	  front=-1;
	  rear=-1;
	  size=0;
  }
  int size()
  {
	  return size;
  }
  boolean isempty()
  {
	  return size==0;
  }
  int front() throws Queueexception
  {
	  if(isempty())
	  {
		  Queueexception e= new Queueexception();
		  throw e;
	  }
	  else
	  return data[front];
  }
  void enqueue(int element) throws Queue
  {   if(size==data.length)
    {
	  Queue e= new Queue();
	  throw e;
    }
	  if(size==0)
     {
	   front++;
     }
	  rear++;
	  data[rear]=element;
	  if(rear==data.length)
	  {
		  rear=0;
	  }
	  size++;
  }
 int dequeue()
 {
	 int temp=data[front];
	 front++;
	 size--;
	 front=(front+1)%data.length;
	 if(size==0)
	 {
		 front=-1;
		 rear=-1;
	 }
	 return temp;
 }
}
