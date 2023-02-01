package maps;
import java.util.*;
public class Mapuse {
public static void main(String args[])
{
	HashMap<String, Integer>map=new HashMap<>();
	map.put("abc",40);
	map.put("cdf",50);
	map.put("gfh",60);
	if(map.containsKey("abc"))
	{
		System.out.println("abc");
	}
	if(map.containsValue(40))
	{
		System.out.println(40);
	}
	int s=map.remove("gfh");
	System.out.println(s);
	Set<String>keys=map.keySet();
	for(String str:keys)
	{
		System.out.println(str);
	}
}
}
