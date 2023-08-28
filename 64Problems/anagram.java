//Write a program to check whether a string is anagram or not.

class anagram
{
	public static void main(String[] args)
	{
		char[] str1 = "heart".toCharArray();
		char[] str2 = "earth".toCharArray();
		String result = "Anagram";
		
		for(int i = 0; i < str1.length; i++)
		{
			for(int j = 0; j < str2.length; j++)
			{
			//this condition will be true we put @ simble
				if(str1[i] == str2[j])
				{
					str1[i] ='@';
					str2[j] ='@';
					
				}
			}
		}
		//Here check anagram or not
		for(int i = 0; i < str1.length; i++)
		{
			if(str1[i] != '@')
			{
				result = "Not an anagram";
				break;
			}
		}
		System.out.println(result);
	}
	
}
