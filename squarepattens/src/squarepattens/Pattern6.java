package squarepattens;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            char start=(char)('A'+n-i+1);
            int j=1;
            while(j<=i)
            {
             System.out.print(start);
              j++;
             start = (char)(start+1);
            }
            i++;
            System.out.println();
        }
	}
}