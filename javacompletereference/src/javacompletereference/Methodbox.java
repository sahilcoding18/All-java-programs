package javacompletereference;
class Mbox{
	int width;
	int height;
	int breadth;
	void setbox(int a,int b,int c)
	{
		width=a;
		height=b;
		breadth=c;
	}
	int volume()
	{
		return width*height*breadth;
	}
}
public class Methodbox {
public static void main(String args[])
{
	Mbox b1 =new Mbox();
	Mbox b2 =new Mbox();
	Mbox b3 =new Mbox();
	b1.setbox(1, 2, 3);
	b2.setbox(10,2,30);
	b3.setbox(10,0,30);
	System.out.println(b1.volume());
	System.out.println(b2.volume());
	System.out.println(b3.volume());
	
	
}
}
