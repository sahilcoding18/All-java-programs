package patternclear;
import java.util.Scanner;
public class Easypattern2 {
public static void main(String args[]){
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int i=1;
	while(i<=n)
	{
		int space =1;
		while(space<=n-i)
		{
			System.out.print(" ");
			space++;
		}
		int j=1;
		int val=i;
		while(j<=i)
		{
			System.out.print(val);
			val++;
			j++;
		}
        int x=2*i-2;
        j=1;
        while(j<=i-1)
        {
            System.out.print(x);
            j++;
            x--;
        }
		System.out.println();
		i++;
	}
}
}