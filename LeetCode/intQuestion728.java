/**
 * @(#)intQuestion728.java
 *
 *
 * @author 
 * @version 1.00 2019/8/12
 *
 * 6 minutes not much faster than most, usues the same idea as everone else seemed to do
 */
 
import java.util.*;

public class intQuestion728 {
	
	public static void main(String [] args) 
	{
		System.out.println(selfDividingNumbers(1, 22).toString());
    }
    
    public static List<Integer> selfDividingNumbers(int left, int right) 
    {
    	LinkedList list = new LinkedList();
    	for(int i = left;i<=right;i++)
    	{
    		if(isSelfDiv(i))
    		{
    			list.add(i);
    		}	
    	}
    	
        return list;
    }
    
    public static boolean isSelfDiv(int x)
    {
    	String temp = x +"";
    	for(int i =0;i<temp.length();i++)
    	{
    		if(temp.charAt(i) == '0')
    		{
    			return false;
    		}
    		else if( x%Integer.parseInt(temp.charAt(i)+"") != 0)
    		{
    			return false;
    		}
    	}
    	
    	return true;
    }

       
}