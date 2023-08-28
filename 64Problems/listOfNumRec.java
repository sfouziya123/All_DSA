//Print a list of numbers using Recursion?

class listOfNumRec
{
	public static void listOfNumRec(int[] arr, int i)
	{
		if(arr.length == i)
		{
			return;
		}
		System.out.println(arr[i]);
		listOfNumRec(arr, i+1);
	}
	public static void main(String[] args)
	{
		int[] arr={1,5,3,9,2};
		
		listOfNumRec(arr,0);
	}
}
