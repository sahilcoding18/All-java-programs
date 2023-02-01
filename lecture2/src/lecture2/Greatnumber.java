package lecture2;
import java.util.Scanner;
public class Greatnumber {
	public static void main (String[] arg) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>=b&&a>=c) {
			System.out.println(a);
		}
		else if(b>=a&&b>=c)
		{
			System.out.println(b);
		}
		else {
			System.out.print(c);
		}
	}
	}

