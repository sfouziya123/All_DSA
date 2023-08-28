//Write a program to find the frequency of each element in the array.

class frequency
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,4,7,1,8,2,3,9,1};
		int[] result = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			result[arr[i]] +=1; 
		} 
		for(int i =0; i < result.length; i++)
		{
			if(result[i] > 0)
			{
				System.out.println("Elements "+"- "+ i +"Frequency "+": " + result[i]);
			}
		}
	}
}

