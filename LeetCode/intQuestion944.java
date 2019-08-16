/**
 * @(#)intQuestion944.java
 *
 *
 * @author 
 * @version 1.00 2019/8/16
 *
 *Terrible question
 */


public class intQuestion944 {

	public static void main (String[] args) 
    {
    	String[] temp = {"cba","daf","ghi"};
    	System.out.println(minDeletionSize(temp));
    }
    
	public static int minDeletionSize(String[] A) 
    {
    	int count = 0;
    	for(int i =0;i<A[0].length();i++)		
    	{
    		for(int j =0;j<A.length-1;j++)
    		{
	    		if(A[j].charAt(i) > A[j+1].charAt(i))
	    		{
	    			count++;
	    			break;
	    		}	
	    	}
    	}
    	
    	return count;
    }
}