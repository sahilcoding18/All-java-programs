package maps;
import java.util.*;
public class Removeduplicate {
public static ArrayList<Integer>removeDuplicates(int a[])
{
	ArrayList<Integer>output=new ArrayList<>();
	HashMap<Integer,Boolean>map=new HashMap<>();
	for(int i=0;i<a.length;i++)
	{
		if(map.containsKey(a[i]))
		{
		     continue;
		}
		else
		{
			output.add(a[i]);
			map.put(a[i],true);
		}
	}
	return output;
}
public static void main(String args[])
{
	int a[]= {1,1,1,1,1,1,1,1,11,1,1,1,1,11,1,1,1,11,2,2,24,4,4,4,99999,99999};
	ArrayList<Integer>output=removeDuplicates(a);
	for(int i=0;i<output.size();i++)
	{
		System.out.println(output.get(i));
	}
}
}
