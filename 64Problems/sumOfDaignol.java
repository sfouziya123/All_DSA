//Write a program to sum of the diagonal elements present in an 2D array.

class sumOfDaignol
{
	public static void main(String[] args)
	{
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row = 3;
		int col = 3;
		int sum = 0;
		String result = "";
		for( int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				if((i == 0 && j == 0 || i == 1 && j == 1 || i == row-1 && j == col-1)||(j == col-1 && i == 0 || i == row-1 && j == 0))
				{
					result += arr[i][j]+" ";
					sum += arr[i][j];
				}
			}
		}
		System.out.println(result);
		System.out.println(sum);
	}
}
