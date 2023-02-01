package arrays;
import java.util.*;
public class Largestnuminarray {
public static int[] takeinput() {
	Scanner s = new Scanner(System.in);
	int size=s.nextInt();
	int input[] = new int[size];
	for(int i=0;i<size;i++)
	{
		input[i]=s.nextInt();
	}
	return input;
}
public static int large(int array[])
{
	int max=0;
	for(int i=0;i<array.length;i++)
	{
		if(array[i]>max)
		{
		  max=array[i];	
		}
	}
	return max;
}
public static void main(String args[]) {
	int array[]=takeinput();
	System.out.print(large(array));
	
}
}
