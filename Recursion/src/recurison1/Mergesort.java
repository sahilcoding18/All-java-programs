package recurison1;
public class Mergesort {
	public static void mergeSort(int[] input){
		if(input.length<=1)
            return;
        int mid= (input.length)/2;
        int input1[] = new int[mid];
        int input2[]  =  new int[input.length-mid];
        for(int i=0;i<mid;i++)
        {
            input1[i]=input[i];
        }
        int k=0;
        for(int i=mid+1;i<input.length;i++)
        {
            input2[k]=input[i];
            k++;
        }
        mergeSort(input1);
        mergeSort(input2);
        merge(input1,input2,input);
}
    public static void merge(int[] array1,int[] array2,int output[])
    {
        int i1=0;
        int i2=0;
        int k=0;
        while(i1<array1.length&&i2<array2.length)
        {
            if(array1[i1]<array2[i2])
            {
                output[k]=array1[i1];
                i1++;
                k++;
            }
            else
            {
                output[k]=array2[i2];
                i2++;
                k++;
            }
        }
        while(i1<array1.length)
        {
            output[k]=array1[i1];
            i1++;
            k++;
        }
        while(i2<array2.length)
        {
            output[k]=array1[i2];
            i2++;
            k++;
        }
    }
}
