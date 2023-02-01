package javacompletereference;
class Box3{
	int num1;
	int num2;
	int num3;
	Box3(int x,int y,int z)
	{
		num1=x;
		num2=y;
		num3=z;
	}
	int marks()
	{
		return num1+num2+num3;
	}
}
public class Parametersconstructor {
public static void main(String args[]) {
	Box3 b1= new Box3(1,2,3);
	System.out.print(b1.marks());
	Box3 b2= new Box3(100,2,3);
	System.out.print( " "+b2.marks());
	Box3 b3= new Box3(2,2,2);
	System.out.print(" "+"total are "+b3.marks());
}
}