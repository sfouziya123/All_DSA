//find the sum of even numbers in an array using recursion?

class sumOfEvenRec
{
    public static int sumEven(int[] arr,int i, int num)
    {
        if(i == arr.length)
        {
            return num;

        }
        if(arr[i]%2==0)
        {
            num+=arr[i];
        }
        return sumEven(arr,i+1,num);
    }
    public static void main(String[]args)
    {
        int[]arr = {2,4,6,5,1,3};
        int num = 1;
        System.out.print(sumEven(arr,0,1));
    }
}

