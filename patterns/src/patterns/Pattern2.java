package patterns;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		int val=1;
        while(i<=n)
        {
        	int j=1; 
        	while(j<=i)
        	{
        		System.out.print(val+" ");
        		j=j+1;
        		val=val+1;
        	}
        	System.out.println();
        	i=i+1;
        }
	}

}
import  java.util.Scanner;
public class Solution {
	public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      int r = s.nextInt();
      int i=1;
      int val=1;
      while(i<=r)
      {
      int j=i;
      while(j<=i)
      {
        System.out.print(val+" ");
        val=val+1;
        j=j+1;
       }
       System.out.println();
       i=i+1;
       }
	}

}
//  int k=0;
//       int val=1;
       int i=1;
       while(i<=n)
       {
           int j=i;
           while(j<=2*i-1)
           {
             //  val=val+k;
               
             //  k=k+1;
               System.out.print(j);
               j=j+1;
           }
           i=i+1;
           System.out.println(" ");
       }  //  int k=0;
       //       int val=1;
       int i=1;
       while(i<=n)
       {
           int j=i;
           while(j<=2*i-1)
           {
             //  val=val+k;
               
             //  k=k+1;
               System.out.print(j);
               j=j+1;
           }
           i=i+1;
           System.out.println(" ");
       }
