//write a programe in reverse String?

public class reverseStr
{
	public static void main(String[] args)
	{
		String str = "Fouziya";
		char[] strArray = str.toCharArray();
		int start = 0;
		int end = strArray.length - 1;
		
		
		while(start < end)
		{
			char temp = strArray[start];
			strArray[start] = strArray[end];
			strArray[end] = temp;
			start++;
			end--; 
		}	
		
			System.out.println(strArray);
		
		
	}

}
