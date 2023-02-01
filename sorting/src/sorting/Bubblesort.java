package sorting;
public class Bubblesort {
public static void bubblebysort(int arr[])
{
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
public static void printarray(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
public static void main(String args[])
{
	int arr[]= {1,2,4,6,7,0,91,76,9,10};
	bubblebysort(arr);
	printarray(arr);
}
}
