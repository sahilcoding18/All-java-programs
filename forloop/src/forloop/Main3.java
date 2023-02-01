package forloop;
import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem=0;
        int sum=0;
        int p=1;
        while(n>0)
        {
            rem=n%2;
            sum=rem*p+sum;
            p=p*10;
            n=n/2;
           // System.out.print(sum+" ");
        }
      System.out.print(sum);
	}
}
