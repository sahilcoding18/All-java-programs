package javacompletereference;
class Box
{
	int height;
	int width;
	int depth;
}
public class Firstboxprogram {

	public static void main(String[] args) {
		Box b1;
		b1= new Box();
		int a=b1.height=6;
		int b=b1.width=1;
		int c=b1.depth=1000;
		int vol=a*b*c;
		System.out.print(vol);
	}

}
