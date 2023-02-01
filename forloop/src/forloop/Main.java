package forloop;
import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int rev=0;
        while(temp>0)
        {
            int last =temp%10;
            temp=temp/10;
            rev=rev*10+last;
           
        }
        System.out.print(rev);
    }
}