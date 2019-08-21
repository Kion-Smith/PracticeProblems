/**
 * @(#)intQuestion999.java
 *
 *
 * @author 
 * @version 1.00 2019/8/21
 * Had to get help because I was taking way too long to solve this
 */ 


public class intQuestion999 {

	public static void main (String [] args) 
    {
		char[][] b = {{'.','.','.','.','.','.','.','.'},
    				 {'.','.','.','p','.','.','.','.'},
    				 {'.','.','.','R','.','.','.','p'},
    				 {'.','.','.','.','.','.','.','.'},
    				 {'.','.','.','.','.','.','.','.'},
    				 {'.','.','.','p','.','.','.','.'},
    				 {'.','.','.','.','.','.','.','.'},
    				 {'.','.','.','.','.','.','.','.'}};
    				 
    	System.out.println(numRookCaptures(b));
    }
    
   	public static int numRookCaptures(char[][] board) 
   	{
   		int x =0;
   		int y =0;
        for(int i =0;i<board.length;i++)
        {
        	for(int j =0;j<board[i].length;j++)
        	{
        		if(board[i][j] == 'R')
        		{
        			x = i;
        			y = j;
        			break;
        		}	
        	} 
        }
        
        int[][] moves = {{1,0},{0,1},{-1,0},{0,-1}};
        int count =0;
        
        for(int loc[] : moves)
        {
        	for(int k = x+loc[0], z = y + loc[1]; 0<=k && k<board.length && 0<=z && z < board.length; k+=loc[0], z+=loc[1])
        	{
        		if(board[k][z] == 'p')
        		{
        			count++;
        		}
        		if(board[k][z] != '.')
        		{
        			break;	
        		}
        	}	
        }
        
        
        return count;
    }
}