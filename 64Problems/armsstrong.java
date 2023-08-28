//write a program to check whether is an Armstrong number or not?

class armsstrong
{
	public static void main(String[] args)
	{
		int num = 153;
		int count = 0;
		String str = ""+num;
		
		for(int i = 0; i < str.length(); i++)
		{
			int result = str.charAt(i) - '0';
			count += Math.pow(result,str.length());	
		}
		if(num == count)
		{
			System.out.println("Armstrong"+":"+num);
		}
		else
		{
			System.out.println("Not an Armstrong");
		}
	}
}
