package lecture1;
import java.util.Scanner;
public class Input {
public static void main(String[] args) {
Scanner s = new Scanner (System.in);
int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();
int d=(a+b+c)/3;
System.out.println(d);
}
}
