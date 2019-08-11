/**
 * @(#)intQuestion961.java
 *
 *
 * @author 
 * @version 1.00 2019/8/11
 *
 *took 11 minutes to do, I thought I was going to get tricked so I took longer than I think I would
 */
 import java.util.HashSet;

public class intQuestion961 {

    public static void main (String [] args) 
    {
    	int[] array = {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(array));

    }
    
    public static int repeatedNTimes(int[] A) 
    {
    	HashSet<Integer> hash = new HashSet();
    	
    	for(int i =0;i<A.length;i++)
    	{
    		if(!(hash.contains(A[i])))
    		{
    			hash.add(A[i]);	
    		}
    		else
    		{
    			return A[i];
    		}
    		
    	}
    	
		return 0; 
    }
    
    
    
}