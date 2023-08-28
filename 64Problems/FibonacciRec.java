//Fibonacci number

class FibonacciNumber
{
	public static void fibNumRec(int range,int a, int b)
	{
		if(a+b > range)
		{
			return;
		}
		System.out.println(a+b);
		fibNumRec(range,b,a+b);
	}
	public static void main(String[] args)
	{
		int range = 20;
		int a = 0;
		int b  = 1;
		System.out.println(a);
		
		System.out.println(a+b);
		fibNumRec(range,a,b);
	}
}
