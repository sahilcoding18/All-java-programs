package forloop;
import java.util.Scanner;
import java.lang.Math;
public class Runner{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int n1=n;
        int sum1=0;
        int sum2=0;
        int rem1=0;
        int rem2=0;
        int count=0;
        while(n>0)
        {
            rem1=n%10;
            sum1=sum1+rem1;
            count++;
            n=n/10;
        }
        while(n1>0)
        {
            rem2 = n1%10;
            sum2=(int)(sum2+Math.pow(rem2,count));
            n=n/10;
        }
        if(sum2==sum1)
        {
           System.out.print("true");
        }
        else
        {
          System.out.print("false");
        }

	}
}
