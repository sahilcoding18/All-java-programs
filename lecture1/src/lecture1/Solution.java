package lecture1;
import java.util.Scanner;
public class Solution {
public static void main() {
	Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    int m1= s.nextInt();
    int m2= s.nextInt();
    int m3= s.nextInt();
    int t=(m1+m2+m3)/3;
    System.out.println(t);
}
}
