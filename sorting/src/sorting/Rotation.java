package sorting;

public class Rotation {
    public static void rotate(int[] arr, int d) {
       int n=arr.length;
        for(int i=0;i<d;i++)
       {
         int temp=arr[0];
           for(int j=0;j<n;j++)
           {
               if(j<n-1)
               {
                 arr[j]=arr[j+1];
               }
               if(j==n-1)
               {
                   arr[j]=temp;
               }
           }
           
       }
    }
public static void reverse(int arr[])
{
	int start=0;
	int end=arr.length-1;
	while(start<=end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
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
	int arr[]= {1,2,3,4,5};
	printarray(reverse(arr));
}
}