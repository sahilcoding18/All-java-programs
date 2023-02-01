package forloop;
import java.util.Scanner;
import java.lang.Math;
public class Main1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        int temp=n;
        while(temp>0)
        {
        	int rem=0;
            rem=temp%10;
            temp=temp/10;
            count++;
        }
        int sum=0;
        int rem2=0;
        for(int i=0;i<count;i++)
        {
          rem2=n%10;
           sum=(int)(sum+rem2*Math.pow(2,i));
        }
        System.out.print(sum);
	}
}
