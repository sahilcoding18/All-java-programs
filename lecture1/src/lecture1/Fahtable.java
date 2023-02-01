package lecture1;
import java.util.Scanner;
public class Fahtable {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	        int s=scan.nextInt();
	        int e=scan.nextInt();
	        int w=scan.nextInt();
	        while((s<=e)&&(e<=900))
	        {
	            if((0<=s&&s<=80)&&(0<=w&&w<=40))
	            {
	                int f=s;
	                int c = (5*(f-32))/9;
	                System.out.print(f);
	                System.out.print(c);
	                s=s+w;
	            }
	        }
		}

	}

