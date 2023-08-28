//write a program to remove the duplicate element in an array?

//count of duplicate Elements
class duplicateEle
{
	public static void main(String[] args)
	{
		int[] arr = {1, 4, 5, 2, 1, 3, 4, 5};
		int length = arr.length;

		for (int i = 0; i < length - 1; i++)
		 {
			for (int j = i + 1; j < length; j++)
			{
				if (arr[i] == arr[j]) 
				{
					arr[j] = arr[length - 1];
					length--;
					j--;
				}
			}
		}
		for (int i = 0; i < length; i++)
	 	{
			System.out.print(arr[i] + " ");
		}
	}
}


