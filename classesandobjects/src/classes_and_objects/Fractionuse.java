package classes_and_objects;
public class Fractionuse {
public static void main(String args[])
{
	Fraction f1= new Fraction(1,2);
	f1.print();
	Fraction f2=new Fraction (1,2);
	f1.add(f2);
	f1.print();
	Fraction f3=Fraction.multiply(f1,f2);
	f3.print();
	f1.add(f3);
	f1.print();
}
}
