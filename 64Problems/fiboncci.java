//Write a program to generate Fibonacci Series.

class fiboncci
{

public static void main(String[] args) {
        int range = 10;
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        while(range > n1)
        {
        	System.out.println(n1);
        	sum = n1 + n2;
            	n1 = n2;
            	n2 = sum;
   
        }

      
    }
}
