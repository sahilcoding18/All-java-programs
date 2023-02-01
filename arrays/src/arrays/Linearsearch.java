package arrays;
import java.lang.reflect.Array;
import java.util.*;
public class Linearsearch{
    public static int linearSearch(int arr[], int x) {
		for(int i=0;i<Array.getLength(arr);i++)
        {
          if(arr[i]==x)
          {
              return i;
          }
         
        }
        return -1;
    }
public static void main(String args[])
{
   Scanner s = new Scanner(System.in);
   int t=s.nextInt();
   for(int j=0;j<t;j++)
   {
     int n=s.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=s.nextInt();
     }
     int x=s.nextInt();
       System.out.print(linearSearch(arr,x));
   }
}
}