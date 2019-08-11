/**
 * @(#)intQuestion657.java
 *
 *
 * @author 
 * @version 1.00 2019/11/8
 *
 *  took 5 minutes to do; was faster than 65% of answers
 */
 



public class intQuestion657 {

    public static void main (String [] args) 
    {
		System.out.println(judgeCircle("LL"));

    }
    
    public static boolean judgeCircle(String moves) 
    {
    	int x =0; int y =0;
    	for(int i =0;i<moves.length();i++)
    	{
    		switch(moves.charAt(i))
    		{
    			case 'U':
    				x++;
    				break;
    			case 'D':
    				x--;
    				break;
    			case 'L':
    				y--;
    				break;
    			case 'R':
    				y++;
    				break;
    			default:
    				break;
    		}
    	}
    	
    	
    	if( x ==0 &&  y ==0)
    	{
    		return true;
    	}
    	
    	return false;
    }
    

    
}