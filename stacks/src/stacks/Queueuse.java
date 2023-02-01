package stacks;
public class Queueuse {
public static void main(String args[]) 
{
	QueueusingArray qu= new QueueusingArray(10);
	for(int i=1;i<=5;i++)
	{
		try {
			qu.enqueue(i);
		} catch (Queue e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	while(!qu.isempty())
	{
		System.out.println(qu.dequeue());
	}
}
}
