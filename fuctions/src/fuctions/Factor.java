package fuctions;
import java.util.*;
public class Factor {
	public static int factorial (int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	public static boolean isprime(int n)
	{
		int i =2;
		while(i<n)
		{
			if(n%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
	
public static void printprimes(int n)
{
	for(int i=2;i<=n;i++)
	{
		boolean prime=isprime(i);
		if(prime)
		{
			System.out.print(i+"  ");
		}
	}
}
	
	public static void main(String args[])
			{
		     Scanner s = new Scanner(System.in);
		     int n =s.nextInt();
		     int r=s.nextInt();
		    int num= factorial(n);
		    int den1=factorial(r);
		    int den2=factorial(n-r);
		    System.out.print(isprime(n));
		    System.out.print( num/(den1*den2));
		    printprimes(100);
			}

}
