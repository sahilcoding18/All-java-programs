package patternclear;
import java.util.Scanner;
public class Fullinvertpyramid {
 public static void main(String args[])
 {
	 Scanner s = new Scanner(System.in);
	 int n  = s.nextInt();
	 int n1 =(n+1)/2;
	 int n2 =n1-1;
	 int i  =1;
	 while(i<=n1)
	 { 
		 int space1=1;
		   while(space1<=n1-i)
		   {
			   System.out.print(" ");
			   space1++;
		   }
		   int j=1;
		   while(j<=2*i-1)
		   {
			   System.out.print("*");
			   j++;
		   }
		   i++;
		   System.out.println();
	 }
	 int x=n2;
	 while(x<=n2&&x>=0)
	 {
		 int space2=1;
		 while(space2<=n2-x+1)
		 {
			 System.out.print(" ");
			 space2++;
		 }
		 int y=1;
		 while(y<=2*x-1)
		 {
			 System.out.print("*");
			 y++;
		 }
		 x--;
		 System.out.println();
	 }
 }
}
