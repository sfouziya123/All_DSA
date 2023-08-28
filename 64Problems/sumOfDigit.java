//write a program to find the sum of the digit present in a number?

class sumOfDigit
{
	public static void main(String[] args)
	{
		int num = 64;
		int sum = 0;
		String str = ""+num;
		
		for(int i = 0; i < str.length(); i++)
		{
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
