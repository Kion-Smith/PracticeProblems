/**
 * @(#)intQuestion883.java
 *
 *
 * @author 
 * @version 1.00 2019/8/22
 *
 *No idea how to do this, not my solution modfied from some one else
 */


public class intQuestion883 {

    public static void main (String [] args) 
    {
    	int[][] m = { {2}};
    	System.out.println(projectionArea(m));
    }
    
    public static int projectionArea(int[][] grid) 
    {
    	int count = 0;
    	
    	for(int i =0;i<grid.length;i++)
    	{
    		int row =0;
    		int cols =0;
    		
    		for(int j =0;j<grid.length;j++)
    		{
    			row = Math.max(row, grid[i][j]);
    			cols = Math.max(cols, grid[j][i]);
    			
    			if(grid[i][j] > 0)
    			{
    				count++;
    			}	
    				
    			count += row+cols;
    		}
    	}
    	
    	return count;
    }
    
    
}