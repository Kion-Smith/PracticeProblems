/**
 * @(#)intQuestion908.java
 *
 *
 * @author 
 * @version 1.00 2019/8/25
 * couldnt understand the problem had to look for help and it gave too much of the problem away
 */


public class intQuestion908 {

	public static void main(String [] args) 
    {
    	int[] m = {0,10};
    	System.out.println(smallestRangeI(m,2));
    }
    
    
    public static int smallestRangeI(int[] A, int K) 
    {
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	
    	for(int i=0;i<A.length;i++)
    	{
    		
    		min = Math.min(A[i],min);
    		max = Math.max(A[i],max);
		}
		
		if(min+K >= max-K)
		{
			return 0;	
		}
		
		return (max-K) - (min+K); 
    }
}