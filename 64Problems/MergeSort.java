//Merge sort

class MergeSort 
{
    	public static void main(String[] args) 
    	{
        	int[] arr = {1,3,5,7,9,6,8,11,4,2};
        	int start = 0;
        	int end = arr.length - 1;
        
       		System.out.println("Original array:");
        	sort(arr);
        
        	mergeSort(arr, start, end);
        
        	System.out.println("Sorted array:");
        	sort(arr);
   	}
    
    	public static void mergeSort(int[] arr, int start, int end)
     	{
        	if (start < end) 
        	{
            		int mid = (start + end) / 2;
           		mergeSort(arr, start, mid);
            		mergeSort(arr, mid + 1, end);
            		merge(arr, start, mid, end);
        	}
    	}
    
    	public static void merge(int[] arr, int start, int mid, int end) 
    	{
        	int i = start;
        	int j = mid + 1;
        	int k = start;
        	int[] arr1 = new int[arr.length];  
        
        	while (i <= mid && j <= end) 
        	{
            		if (arr[i] < arr[j]) 
            		{
                		arr1[k] = arr[i];
                		i++;
            		}
            		else 
            		{
                		arr1[k] = arr[j];
                		j++;
            		}
            		k++;
        	}
        
        	while (i <= mid)
        	{
           	 	arr1[k] = arr[i];
            		i++;
            		k++;
       		}
        
        	while (j <= end) 
        	{  
            		arr1[k] = arr[j];
            		j++;
            		k++;
        	}
        
        	for (int f = start; f <= end; f++) 
        	{
            		arr[f] = arr1[f]; 
        	}
    	}
    
    	public static void sort(int[] arr) 
    	{
        	for (int i = 0; i < arr.length; i++) 
        	{
            		System.out.print(arr[i] + " ");
        	}
        	System.out.println();
    	}
}

