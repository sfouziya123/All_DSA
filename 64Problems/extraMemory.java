//Write a program to swap two numbers using extra memory and without extra memory.

class extraMemory
{
	public static void main(String[] args)
	{
		
		int a = 40;
		int b = 80;
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println(withoutExtra(a,b));
		System.out.println(extra(a,b));
		
	}
	public static int withoutExtra(int a, int b)
	{
		a = a+b;
		b= a-b;
		a=a-b;
		//System.out.println("Without Extra Memory");
		/*System.out.print(a+" ");
		System.out.print(b);*/
		return a;
		
	}
	public static int extra(int a , int b)
	{
		while(a < b)
		{
			
			int temp = a;
			a = b;
			b = temp;
			
		}
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(a + " " + b);*/
		return b;
		
	}
}
