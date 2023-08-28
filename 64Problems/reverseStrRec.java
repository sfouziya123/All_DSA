//Reverse a string using recursion.

class reverseStrRec
{
	public static void reverseStringRec(char[] varchar,int start,int end)
	{
		if(start >= end)
		{
			return;
		}
		char temp = varchar[start];
		varchar[start] = varchar[end];
		varchar[end] = temp;
		reverseStringRec(varchar,start+1,end-1);		
	}
	public static void main(String[] args)
	{
		String str = "Fouziya";
		char[] varchar = str.toCharArray();
		int start = 0; 
		int end = str.length()-1;
		
    		reverseStringRec(varchar, start, end);
        	System.out.print(varchar);
		
	}


}


