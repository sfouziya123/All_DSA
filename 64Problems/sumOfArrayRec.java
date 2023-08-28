//Calculate the sum of all Elements in an array using recursion?

class sumOfArrayRec
{

	public static int sumRec(int sum,int[] array, int i, int size)
	{
        	if(i == size)
        	{
       			return sum;
        	}
        	
       		sum = sum + array[i];
       		
       		return 	sumRec(sum,array,++i, size);
       	}
    	
    	public static void main(String[] args){
    	
    		int[] array = {2,5,5,5,3,10,8,9};
    		int sum = 0;
    		int i = 0;
    		int size = 8;
    		
    		System.out.println(sumRec(sum,array,i,size)); 
    		
    	}

}
