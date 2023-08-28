//write a program to check if the sum of two numbers in an array is equal to the target?

class target
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,5,7,9};
		int target = 6;
		String result = "no" + "not equal";
		for(int i = 0; i < arr.length;i ++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					result = "index values"+" "+ i +","+j+" - "+"target"+":"+ target;
				}
			}
		} 
		System.out.println(result);
	}

}
