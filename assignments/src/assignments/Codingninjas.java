package assignments;
	import java.util.Scanner;
	public class Codingninjas {
		public static void main(String[] args) {
			Scanner s   = new Scanner(System.in);
	        int bsa  = s.nextInt();
	         char g     = s.next().charAt(0);
	        double hra  = (0.20*bsa);
	        double da   = (0.50*bsa);
	        double pf    = (0.11*bsa);
	       // int x;
	        int allow;
	        if(g==65)
	        {
	           allow =1700;
	        // double ts=bsa+hra+da+allow-pf;
	        }
	        else if(g==66)
	        {
	          allow =1500;
	        // double ts=bsa+hra+da+allow-pf;
	        }
	        else
	        {
	        
	         allow =1300;
	        // double ts=bsa+hra+da+allow-pf;
	        }
	         
	         int ts=(int)Math.round((bsa+hra+da+allow-pf));
	        
	      //  x = (int)ts ;
	      //  if(ts-x>0.5)
	       // {
	        //    x=x+1;
	            System.out.println(ts);
	      //  }
	      //  else
	      //  { 
	        //  System.out.print(x);
	        //}
		}
	}
