package sorting;
public class Mergetwosortedarrays {
	public static int[] mergetwoarrays(int arr1[],int arr2[])
	{
		int n=arr1.length+arr2.length;
		int arr3[]=new int[n];
		for(int i=0;i<arr1.length-1;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length-1;i++)
		{
			arr3[arr1.length-1]=arr1[i];
		}
		bubblebysort(arr3);
		return(arr3);
	}
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
	int arr1[]= {1,2,3,4,5};
	int arr2[]= {4,5,6,9,10,11};
	printarray(mergetwoarrays(arr1,arr2));
}
}
