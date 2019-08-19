/**
 * @(#)intQuestion509.java
 *
 *
 * @author 
 * @version 1.00 2019/8/19
 *12 minutes, did a project euler similar to this in python
 */
import java.util.ArrayList;

public class intQuestion509 {

    public static void main (String [] args) 
    {
    	System.out.println(fib(4));
    }
    
    public static int fib(int N) 
    {
		int[] fibArray = new int[N+1]; 	
    	
    	if(N < 2)
    	{
    		return N;
    	}
    	
    	fibArray[1] = 1;
    	
    	for(int i =2;i<= N;i++)
    	{
    		fibArray[i] = fibArray[i-1] + fibArray[i-2];
    	}
    	
        return fibArray[N];
    }
    
    
}