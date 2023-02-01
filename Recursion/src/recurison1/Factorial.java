package recurison1; 
public class Factorial {
   public static int fact(int n)
   {
	  if(n==0)
	  {
		  return 1;
	  }
	  int smallans=fact(n-1);
	  return n*smallans;
   }
}
