package patternclear;
import java.util.Scanner;
public class Easypattern {
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
		int val=1;
		while(j<=i)
		{
			System.out.print(val);
			val++;
			j++;
		}
		 int o =1;
		 int num=i-1;
		 while(o<=i-1)
		 {
			 System.out.print(num);
			 o++;
			 num--;
		 }
		System.out.println();
		i++;
	}
}
}