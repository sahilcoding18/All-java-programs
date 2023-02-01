package squarepattens;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i =1;
        while(i<=n)
        {
            int j =1;
            int t=i;
            while(j<=i)
            {
                System.out.print(t);
                j++;
                t--;
            }
            i++;
            System.out.println();
        }
	}

}