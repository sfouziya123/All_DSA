/*Write a program to print below pattern
* * * *
* * *
* *
*    */
class pattern2
{
	public static void main(String[] args)
	{
		int n = 4;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
			
		}
	}
}
