package squarepattens;
import java.util.Scanner;
public class Patterrowstart {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i =1;
	while(i<=n)
	{
		int j =1;
		int t = i;
		while(j<=i)
		{
			System.out.print(t);
			t++;
			j++;
		}
		i++;
		System.out.println();
	}
}
}
