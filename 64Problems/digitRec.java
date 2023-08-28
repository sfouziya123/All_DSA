//Find the digit number

class digitRec
{
	public static int sumOfDigitRec(int num, int numDigit,int i, int sum)
	{
		if(i == numDigit)
		{
			return sum;
		}
		int num1 = (int)(num / java.lang.Math.pow(10,i)%10);
		sum = sum + num1;
		return sumOfDigitRec(num,numDigit,++i,sum);	
	}
	public static void main(String[] args)
	{
		int num = 123;
		int i = 0;
		int numDigit = 1;
		System.out.println(sumOfDigitRec(num,numDigit,i,0));
	} 

}
