//Find the maximum element in an array using recursion?

class maxRec
{
	public static int maxRec(int[] array,int i,int max)
	{
		if(i == array.length)
		{
			return max;
		}
		if(array[i] > max)
		{
			max(array[i] == i);
		}
		return maxRec(array,i++,max);
	}
	public static void main(String[] args)
	{
		int[] array = {1,5,3,8,7,2,9};
		int i = 0;
		int max = Integer.MAX_VALUE;
		System.out.println(maxRec(array,i,max)); 
	}

}
