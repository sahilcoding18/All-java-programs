package stacks;
public class Stackusingarray {
 private int data[];
 private int top;
 public  Stackusingarray()
 {
	 data=new int[10];
	 top=-1;
 }
public Stackusingarray(int capacity)
 {
	 data=new int[capacity];
	 top=-1;
 }
 public boolean isempty()
 {
	 return(top==-1);
 }
 public int size()
 {
	 return top+1;
 }
 public int top()
 {
	 if(top==-1)
	 {
		 //stackemptyexception;
		 return -1;
	 }
		 return data[top];
 }
 private void doublesize()
 {
	 int temp[]=data;
	 data= new int[temp.length*2];
	 for(int i=0;i<temp.length;i++)
	 {
		 data[i]=temp[i];
	 }
 }
 public void push(int element)
 {
	if(size()==data.length)
	{
		doublesize();
	}
	top++;
	data[top]=element;
 }
 public int pop() throws Stackempty
 {
	 if(size()==0)
	 {
        Stackempty e=new Stackempty();
        throw e;
	 }
	 int temp=data[top];
	 top--;
	 return temp;
 }
  
}
