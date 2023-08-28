//Calculate the sum of digits in a positive integer using recursion.

class main
{
public static void main (String[]args)
{
int num = 123;

int sum ="";
System.out.print(sumOfdigit( num));
}
public static int sumOfdigit(int num)
{
if(num == 0)
{
return 0;
}else
{
return num% 10 sumOffigit(num/10);
}
}
}
