package patterns;
import java.util.Scanner;
public class Reversepatternno {
	    public static void main(String args[])
	    {
	        Scanner s = new Scanner(System.in);
	            int n=s.nextInt();
	        int i=1;
	        while(i<=n)
	        {
	        	int sp;
            while(sp<=n-i)
            {
                System.out.print(" ");
                sp=sp+1;
            }
	            int j = i;
	            while(j<=2*i-1)
	                
	            {
	                System.out.print(j);
	                j=j+1;
	            }
	            System.out.println(" ");
	            i=i+1;
	        }
	    }
	}

