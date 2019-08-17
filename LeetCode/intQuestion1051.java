/**
 * @(#)intQuestion1051.java
 *
 *
 * @author 
 * @version 1.00 2019/8/17
 *
 * Basic solution took 10 minutes I was trying to find another way besides this but I wwas already taking too long
 */
import java.util.Arrays;

public class intQuestion1051 
{

	public static void main (String [] args) 
    {
    	int[] array = {1,1,4,2,1,3};
    	System.out.println(heightChecker(array));
    	
    }
    
	public static int heightChecker(int[] heights) 
   	{
   		int[] orginal = heights.clone();
   		Arrays.sort(heights);
   		
   		int count =0;
   		
   		for(int i =0;i<heights.length;i++)
   		{
   			if(heights[i] != orginal[i])
   			{
   				count++;
   			}
   		}
   		
   		return count;
    }
    
}