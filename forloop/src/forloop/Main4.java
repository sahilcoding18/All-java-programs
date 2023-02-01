package forloop;
import java.util.Scanner;
import java.lang.Math;
public class Main4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        double n = s.nextInt();
        int root =(int)(Math.sqrt(n));
        System.out.print(root);
	}
}