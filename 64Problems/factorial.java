//Write a programe to find the factorial of a number?
 
class factorial
{
	 public static void main(String[] args)
	 {
	 	int num = 5;
	 	int factorial = 1;
	 	for(int i = 1; i <= num; i++)
	 	{
	 		factorial = i*factorial;
	 	}
	 	System.out.println(factorial);
	 }
}
