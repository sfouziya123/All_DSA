// Write a program to check whether a given number is a perfect Square.

class perfectsquare
{
	public static void main(String[] args)
	{
		int num = 64;
	
		int product = 1;
		
		for(int i = 0; i * i <= num; i++)
		{	
			if(i*i == num)
			{
				System.out.println("true");
				return;
			}			
		}
		System.out.println("false");	
			
	}
}
