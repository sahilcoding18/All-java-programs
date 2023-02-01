package sorting;
public class Insertionsort {
public static void insertionSort(int[] arr) {
	for(int i=1;i<arr.length;i++)
    {
        int key=arr[i];
        int j=i-1;
        while(j>=0&&arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
}
public static void main(String args[])
{
	int arr[]= {10,19,89,90,1000,1,2,3,56,7,5,6,10};
	insertionSort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}

}
