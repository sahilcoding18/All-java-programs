package squarepattens;
import java.util.Scanner;
public class Characterpattern1 {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i=1;
	while(i<=n)
	{
		char startchar = (char)('A'+i-1);
		int j=1;
	    while(j<=n)
	    {
	    	System.out.print(startchar+"  ");
	    	j++;
	    	startchar=(char)(startchar+1);
	    }
		i++;
		System.out.println();
	}
}
}
