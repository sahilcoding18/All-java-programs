package squarepattens;
import java.util.Scanner;
public class Pattern3 {
		public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n =s.nextInt();
	        int i=1;
	        while(i<=n)
	        {
	        	char startvar=(char)('A'+i-1);
	            int j=1;
	            while(j<=n)
	            {
	                System.out.print(startvar);
	                j++;
	                startvar=(char)(startvar+1);
	            }
	            i++;
	            System.out.println();
	        }
		}

	}
