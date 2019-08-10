/**
 * @(#)intQuestion832.java
 *
 *
 * @author 
 * @version 1.00 2019/8/10
 * 15 minutes could have been shorter if I wasnt stupid
 */


public class intQuestion832 {

    public static void main (String [] args) 
    {
    	//int[][] array = { {1,1,0} ,{1,0,1},{0,0,0}};
    	int[][] array = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    	flipAndInvertImage(array);
    }
    
	public static int[][] flipAndInvertImage(int[][] A) 
   	{
   		String temp = "";
   		for(int i =0;i<A.length;i++)
   		{
   			temp = "";
   			for(int j =0;j<A[i].length;j++)
   			{
   				if(A[i][j] == 1)
   				{
   					temp += 0;
   				}
   				else
   				{
   					temp += 1;
   				}
   			}
   			
   			int count =0;
   			for(int k = temp.length()-1;k >= 0;k--)
   			{
   				A[i][count] = Integer.parseInt(temp.charAt(k)+"");	
   				count++;
   			}
   			
   			/*
   			for(int z =0;z<A[i].length;z++)
   			{
 				System.out.print(A[i][z]);
   			}
   			System.out.println();
   			*/
   			
   		}
   		
        return A;
   	}
    
}