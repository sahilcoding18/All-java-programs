package patternclear;
import java.util.Scanner;
public class Sample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int val=n;
        while(i<=n)
        {
            int j=1;
            while(j<=n-i+1)
            {
                System.out.print(val);
                j++;
            }
            System.out.println();
            i++;
            val--;
        }
	}
}
