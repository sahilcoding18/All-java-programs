package patterns;
import java.util.Scanner;
public class Reversepattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		int val=1;
		while(i<=n)
		{
			int space = 1;
			while(space<=n-i)
			{
				System.out.print(" ");
				space=space+1;
			}
			int j = 1;
			while(j<=1)
			{
				System.out.print(val);
				val=val+1;
				j=j+1;
			}
		System.out.println();
			i=i+1;
		}
	}
}