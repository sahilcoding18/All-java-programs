package lists;
import java.util.*;
public class Introtolists {
public static void main(String args[])
{
	ArrayList<Integer>list1=new ArrayList<>();
/*
	Functions in the lists are
	1)adding elements,adding at specific place
	2)setting elements
	3)deleting elements
	4)accessing elements
	5)traversal
*/
	list1.add(10);
	list1.add(18);
	list1.add(2,40);
	list1.add(100);
	list1.add(49);
	for(int elem:list1)
	{
		System.out.print(elem+ " ");
	}
	System.out.println();
	System.out.println(list1.size());
	list1.remove(2);//works with index
	list1.set(1, 99);//requires both
	list1.add(4,18);
	for(int i=0;i<list1.size();i++)
	{
		System.out.print(list1.get(i)+ " ");
	}
}
}
