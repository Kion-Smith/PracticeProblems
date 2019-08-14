/**
 * @(#)intQuestion942.java
 *
 *
 * @author 
 * @version 1.00 2019/8/14
 * Misread the question had to look at examples to understand what was being asked
 */
import java.util.Arrays;

public class intQuestion942 {

    public static void main(String [] args) 
    {
    	System.out.println(Arrays.toString(diStringMatch("IDID")));
    	
    }
    
    public static int[] diStringMatch(String S) 
    {
    	int[] array = new int[S.length()+1];
    	
    	int max = S.length();
    	int min = 0;
    	
    	for(int i =0;i<S.length();i++)
    	{
    		if(S.charAt(i) == 'I' )
    		{

    			array[i] = min;
    			min++;
    		
    		}
    		else
    		{
				array[i] = max;
				max--;
    			
    		}
    	}
    	
    	if(S.endsWith("I"))
    	{
    		array[S.length()] = min;
    	}
    	else
    	{
    		array[S.length()] = max;
    	}

        return array;
    }
    
    
}