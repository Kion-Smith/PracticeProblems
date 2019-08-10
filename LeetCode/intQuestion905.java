/**
 * @(#)intQuestion905.java
 *
 *
 * @author 
 * @version 1.00 2019/8/10
 *
 *	Very basic; I was too lazy to optimze
 */ 
 import java.util.Arrays;
import java.util.Stack;

public class intQuestion905 {

    public static void main (String [] args) 
    {
    	int array[] = {3,1,2,4};
		System.out.println(sortArrayByParity(array));
    }
    
    public static int[] sortArrayByParity(int[] A )
    {
    	Stack<Integer> tempOdds = new Stack();
    	Stack<Integer> tempEvens = new Stack();
    	for(int i =0;i<A.length;i++)
    	{
    		if((A[i] & 1) == 0)
    		{
    			tempEvens.push(A[i]);
    		}
    		else
    		{
    			tempOdds.push(A[i]);
    		}
    	}
    	
    	
    	for(int i =0;i<A.length;i++)
    	{
			if(!tempEvens.isEmpty())
			{
				A[i] = tempEvens.peek();
				tempEvens.pop();
			}
			else
			{
				A[i] = tempOdds.peek();
				tempOdds.pop();
			}
			
    	}
    	
    	
    	
    	
    	
       	return A;
    }
    
}