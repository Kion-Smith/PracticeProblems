/**
 * @(#)intQuestion1025.java
 *
 *
 * @author 
 * @version 1.00 2019/8/26
 */


public class intQuestion1025 {

    public static void main (String [] args) 
    {
    	System.out.println(divisorGame(2));
    }
    
    public static boolean divisorGame(int N) 
    {
    	/* Orginal Solution
  		for(int i = 1;i<N;i++)
  		{
  			if(N%i == 0 && !divisorGame(N-i))
  			{
  				return true;
  			}
  			
  		}	
		return false;
		*/
		 
		//This is gotten from a proof where any odd number given to p1 will lead to a lost game
		return N%2 == 0;
    }
    
    
}