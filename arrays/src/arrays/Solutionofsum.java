package arrays;
import java.lang.reflect.Array;
import java.util.*;
public class Solutionofsum {
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<Array.getLength(arr);i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        for(int j=1;j<=t;j++)
        {
          long n=s.nextLong();
          int array[]= new int[(int)(n)];
          for(int i=0;i<n;i++)
          {
             array[i]=s.nextInt();
          }
          int ts=sum(array);
          System.out.println(ts);
        }
    }
}