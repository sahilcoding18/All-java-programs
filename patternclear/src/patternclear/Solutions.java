package patternclear;
import java.util.Scanner;
public class Solutions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n-1+i)
            {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
	}
}