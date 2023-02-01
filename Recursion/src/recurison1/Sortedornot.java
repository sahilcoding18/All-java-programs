package recurison1;
public class Sortedornot {
public static boolean checkissorted(int arr[])
{
	if(arr.length==1)
	{
		return true;
	}
	int smallinput[]= new int[arr.length-1];
	  for(int i=1;i<arr.length;i++)
	  {
		  smallinput[i-1]=arr[i];
	  }
boolean smallans = checkissorted(smallinput);
if(!smallans)
{
	return false;
}
if(arr[0]<arr[1])
{
	return true;
}
else
{
	return false;
}
}
private static boolean checksortedbetter(int input[],int startindex)
{
	if(startindex==input.length-1)
		return true;
	if(input[startindex]>input[startindex+1])
		return false;
	boolean smallans=checksortedbetter(input,startindex+1);
	return smallans;
}
public static boolean checksortedbetter(int input[])
{
	return checksortedbetter(input,0);
}
public static void main (String args[])
{
	int input[]= {1,3};
	System.out.print(checksortedbetter(input));
}
}
