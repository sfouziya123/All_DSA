//find the length of a String using recursion?

class lengthOfStrRec
{
	public static int StrLengthRec(String str,int count,int i)
	{
		if(i == str.length())
        	{
       			return count;
        	}       		
       		return 	StrLengthRec(str,++count,++i);
	}
	public static void main(String[] args){
    	
    		String str = "Hello World!";
    		int count = 0;
    		int i = 0;
    		
    		System.out.println(StrLengthRec(str,count,i)); 
    		
    	}
}
