package recurison1;
import java.util.*;
public class Remove_x {
	public static String removeX(String s) {
		if(s.length()==0)
		{
			return s;
		}
		String ans="";
		if(s.charAt(0)!='x')
		{
			ans=ans+s.charAt(0);
		}
		String smallans=removeX(s.substring(1));
		return ans+smallans;
		}
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 String str1= s.nextLine();
	 String str="ibuhibbxxuib";
	 System.out.print(removeX(str1+str));
	}
}
