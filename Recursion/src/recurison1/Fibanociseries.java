package recurison1;

public class Fibanociseries {
public  static int fibnoci(int n)
{
	if(n==0||n==1)
	{
		return n;
	}
	return fibnoci(n-1)+fibnoci(n-2);
}
	public static void main(String[] args) {
	 int n=4;
	 System.out.println(fibnoci(4));
	}

}
