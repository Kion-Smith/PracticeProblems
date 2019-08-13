/**
 * @(#)intQuesiton852.java
 *
 *
 * @author 
 * @version 1.00 2019/8/13
 * 5 minutes; didnt understand what it was asking for intially
 */


public class intQuesiton852 {

	public static void main(String [] args) 
    {
    	int[] array = {0,10,5,2};
    	System.out.println(peakIndexInMountainArray(array));
    }
    
	public static int peakIndexInMountainArray(int[] A) 
    {
    	int max = 0;
         for(int i=0;i<A.length;i++)
         {
         	if(A[max]<A[i])
         	{
         		max = i;
         	}
         }
         
         return max;
         
         
    }
    
    
    
}