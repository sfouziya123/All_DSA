class gcdRecursion 
{
    public static int gcdRecursion(int num1, int num2, int gcd, int i)
    {
    
        if(i > num1 || i > num2)
        {
            return gcd;
        } 
        if(num1 % i == 0 && num2 % i == 0)
        {        
            gcd = i;
        }        
        return gcdRecursion(num1,num2,gcd,++i);        
    }
    
     public static void main(String[] args) 
     {
     
         int num1 = 8;
         int num2 = 16;
         int gcd = 0;
         int i = 1;
         
         System.out.println(gcdRecursion(num1,num2,gcd,i));
     }
}
