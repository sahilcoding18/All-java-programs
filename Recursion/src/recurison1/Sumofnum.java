package recurison1;
import java.util.Scanner;
public class Sumofnum {
public static int sum(int n)
{
	if(n==1)
		return 1;
	else
		return n+sum(n-1);
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(sum(n));
	}

}
