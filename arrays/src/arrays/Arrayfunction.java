package arrays;
import java.util.*;
public class Arrayfunction {
public static int[] takeinput() {
		Scanner s= new Scanner(System.in);
		  int size=s.nextInt();
		  int input[]=new int[size];
		  for(int i=0;i<size;i++)
		  {
			  input[i]=s.nextInt();
		  }
		 return input;
	}
public static void displayarray(int input[]) {
	for(int i=0;i<input.length;i++)
	  {
		  System.out.print(input[i]+" ");
	  }
}
public static void main(String args[])
{
  int array[]=takeinput();
  displayarray(array);
}
}
