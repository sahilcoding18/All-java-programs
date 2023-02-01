package lecture2;
import java.util.Scanner;
public class Whileloop {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i=2;
	while(i<=n-1)
	{
		if(n%i==0)
		{
			System.out.print("the number is not a prime");
			return;
		}
		i++;
	}
		System.out.println("It is a prime");
}
}
