package javacompletereference;
class Box2{
	double height;
	double width;
	double length;
	Box2(){
		System.out.print("intializing the box");
		width=10;
		height=20;
		length=10;
	}
	double volume() {
		return width*height*length;
	}
}
public class Constructorbox {
public static void main(String args[])
{
	Box2 b1= new Box2();
	System.out.print(b1.volume());
	
}
}
