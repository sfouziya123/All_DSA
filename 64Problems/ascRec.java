//check if a given array is sorted in ascending order using recursion?

class ascRec
{
	public static int ascRec(int[] array, int ascending, int i, int j)
	{
		if(arr[i] > arr[j])
		{
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		ascRec(array,ascending,i,j); 
	
	}
	public static void main(String[] args)
	{
		int[] array = {1,3,5,6,2};
		
		System.out.println(ascRec(array,ascending,i,j));
	
	}

}
