package javacompletereference;
class Box1
{
	int height;
	int width;
	int depth;
	void volume()
	{
		System.out.println("The volume is: ");
		System.out.println(width*height*depth);
	}
}
public class Methods {
public static void main(String arhs[])
{
	Box1 b1;
	b1= new Box1();
	Box1 b2= new Box1();
	 b1.height=1;
	 b1.width=1;
	 b1.depth=1;
	 b1.volume();
	 b2.height=30;
	 b2.width=20;
	 b2.depth=10;
	 b2.volume();
}
}
