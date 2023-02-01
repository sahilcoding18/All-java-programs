package arrays;
public classFindunique{  
    public static int findUnique(int[] arr){
	 int n=arr.length;
     boolean flag=true;
       for(int i=0;i<n-1;i++)
       {
           for(int j=0;j<n-1;j++)
           {
               if(i!=j)
               {
                   if(arr[i]==arr[j])
                       flag = false;
               }
           }
           if(flag)
           {
               return arr[i];
           }
       }
    }
    public static void main(String args[])
    {
    	int arr[]=new int[10];
    	arr= {1,2,3,3,4,5,6,7,8,9};
    	System.out.print(findUnique);
    }
}