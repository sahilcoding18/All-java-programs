package lecture1;
import java.util.Scanner;
public class Simpleintrest {
public static void main(String[] args)
{
	System.out.println("the simple intrest is ");
	Scanner scan = new Scanner(System.in);
	int p=scan.nextInt();
	int r=scan.nextInt();
	int t=scan.nextInt();
	int si;
	si=p*r*t/100;
	System.out.print(si);
}
}
