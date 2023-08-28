//Write a program to check whether a string is palindrome or not.

class palindrome
{
	public static void main(String[] args)
	{
		String str = "amma";
		int start = 0; 
		int end = str.length()-1;
		String result = "Palindrome";
		
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				result = "Not a Palindrome";
			}
			start++;
			end--;
		}
		System.out.println(result);	
	}
}
