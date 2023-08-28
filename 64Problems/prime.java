//Write a program to check whether the given number is a prime number or not.
class prime
{
	public static void main(String[] args)
	{
		int num = 4; 
		int count = 0;
		for(int i = 1 ; i < num; i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		if(count == num)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
