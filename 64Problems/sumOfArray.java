//Write a program to sum all the elements present in an array.
class sumOfArray
{
	public static void main (String[] args)
	{
		int[] arr = {1,2,3,4,6};
		int count = 0;
		
		for(int i =0; i < arr.length; i++)
		{
			count += arr[i] ;
		}
		System.out.println(count);
	}
}
