//Linear Search    
class linearSearch
{
	public static void main(String[] args)
	{
		int[] arr = {1,6,3,2,8,7,4,9};
		int num = 9;
		String indexValue = "";
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == num)
			{
				System.out.print("position"+" ");
				System.out.println(i+1);//position 
				System.out.println("indexValue"+" "+i);	
			}
			
		}
		
	}

}                    

