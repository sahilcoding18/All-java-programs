package classes_and_objects;

public class Fraction {
	private int numerator;
	private int denominator;
      Fraction(int numerator,int denominator)
      {
    	  this.numerator=numerator;
    	  if(denominator==0)
    	  {
    		  return;
    	  }
    	  this.denominator=denominator;
    	  simplify();
      }
      private void simplify()
      {
    	  int x=numerator<denominator?numerator:denominator;
    	  int gcd=1;
    	 for(int i=2;i<=x;i++)
    	 {
    		if(numerator%i==0&&denominator%i==0)
    		{
    			gcd=i;
    		}
    	 }
    	 numerator=numerator/gcd;
    	 denominator=denominator/gcd;
      }
      public void print()
      {
    	  if(denominator==1)
    	  {
    	     System.out.println(numerator);
    	  }
//    	  else if(numerator/denominator==1)
//    	  {
//    		  System.out.println("1");
//    	  }
    	  else
    	  {
    		  System.out.println(numerator+"/"+denominator);
    	  }
      }
      public void add(Fraction f)
      {
    	  this.numerator=this.numerator*f.denominator+f.numerator*this.denominator;
    	  this.denominator=this.denominator*f.denominator;
    	  this.simplify();
      }
      public static Fraction multiply(Fraction f1,Fraction f2)
      {
    	int newnum=f1.numerator*f2.numerator;
    	int newden=f1.denominator*f2.denominator;
    	Fraction f= new Fraction(newnum,newden);
    	f.simplify();
      f.print();
    	return f;
      }
}
