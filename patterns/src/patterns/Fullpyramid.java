package patterns;
import java.util.Scanner;
public class Fullpyramid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i=0;
        while(i<n)
        {
            int space =1;
                while(space<n-i)
                {
                    System.out.print(" ");
                    space=space+1;
                }
                int j=i;
                while(j<2*i+1)
                {
                    System.out.print("*");
                    j=j+1;
                }
            i=i+1;
            System.out.println();
        }
	}

}



	