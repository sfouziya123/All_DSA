//Write a program to find the 3rd largest element and 2nd smallest element in an array without using sorting methods.

class largestAndSmallest
{
	public static void main(String[] args)
	{
		int max = integer.MIN_VALUE;
		int min = integer.MAX_VALUE;
		
		for(int i = 0; i < max; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		for(int j = 0; j < min; j++)
		{
			if(arr[j] < min)
			{
				min = arr[j];
			}
		}
		System.out.println(min);
	}
}
