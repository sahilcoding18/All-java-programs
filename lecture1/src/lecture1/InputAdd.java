package lecture1;
import java.util.Scanner;
public class InputAdd {
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	System.out.println(str);
	int   i = scan.nextInt();
	int   j = scan.nextInt();
	int   k = i+j;
	System.out.println(k);
}
}
