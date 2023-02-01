package recurison1;
public class Returnsubsequences {
public static String[] subseq(String input) {
 if(input.length()==0) {
	 String ans[]= {""};
	 return ans;
 }
 String smallans[]=subseq(input.substring(1));
 String ans[]= new String[2*smallans.length];
 int k=0;
 for(int i=0;i<smallans.length;i++)
 {
	 ans[k]= smallans[i];
	 k++;
 }
 for(int i=0;i<smallans.length;i++)
 {
	 ans[k]= input.charAt(0)+smallans[i];
	 k++;
 }
 return ans;
}
//public class Subsequences {
//
//	public static String[] findSubsequences(String str){
//		
//		if(str.length() == 0){
//			String ans[] = {""};
//			return ans;
//		}
//		
//		String smallAns[] = findSubsequences(str.substring(1));
//		String ans[] = new String[2*smallAns.length];
//		
//		int k = 0;
//		for(int i = 0; i < smallAns.length; i++){
//			ans[k] = smallAns[i];
//			k++;
//		}
//		
//		for(int i = 0; i < smallAns.length; i++){
//			// ans[i + smallAns.length]
//			ans[k] = str.charAt(0) + smallAns[i];
//			k++;
//		}
//		
//		return ans;
//	}
public static void main(String args[])
{
	String str="xyz";
	String ans[]=subseq(str);
	System.out.println("even empty space is also a string");
	for(int i=0;i<ans.length;i++)
	{
		System.out.println(ans[i]);
	}
}
}
