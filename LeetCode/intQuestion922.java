/**
 * @(#)intQuestion922.java
 *
 *
 * @author 
 * @version 1.00 2019/8/18
 *
 * 10 minutes 
 */
import java.util.*;
import java.util.Arrays;

public class intQuestion922 {

	public static void main(String [] args) 
    {
    	int[] array = {4,2,5,7};
    	System.out.println((Arrays.toString(sortArrayByParityII(array))));
    }
    
	public static int[] sortArrayByParityII(int[] A) 
	{
		Queue<Integer> evens = new LinkedList();
		Queue<Integer> odds= new LinkedList();
		
		for(int i =0;i<A.length;i++)
		{
			if( (A[i] & 1) != 0)
			{
				odds.add(A[i]);		
			}
			else
			{
				evens.add(A[i]);
			}
		}
		
		int[] ans = new int[A.length];
		
		for(int i =0;i<A.length;i++){
			if((i & 1) != 0)
			{
				ans[i] = odds.poll();
			}
			else
			{
				ans[i] = evens.poll();	
			}
		}
		
		
		return ans;
	}
        
   
    
    
}