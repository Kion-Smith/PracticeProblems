/**
 * @(#)intQuestion1002.java
 *
 *
 * @author 
 * @version 1.00 2019/8/22
 */
 
import java.util.*;

public class intQuestion1002 {

    public static void main(String [] args) 
    {
    	String[] m = {"bella","label","roller"};
    	System.out.println(commonChars(m));
    }
    
    public static List<String> commonChars(String[] A) 
    {
    	HashSet<String> hash = new HashSet();
    	LinkedList list = new LinkedList();
		int[] alphaCount = new int[26];
    	String temp = "";
    	for(int i =0;i<A.length;i++)
    	{
    		for(int j =0;j<A[i].length();j++)
    		{
    			if(!hash.contains(A[i].charAt(j)+""))
    			{
    				temp = (A[i].charAt(j)+"").toLowerCase();
					alphaCount[ temp.charAt(0) - 97 ]++ ;
    			}

    		}
    		
    		hash.clear();
    	}
    	
    	for(int i =0;i<alphaCount.length;i++)
    	{
    		if(alphaCount[i] >= 3)
    		{
    			list.add('i + 97' +"");
    		}
    	}
    	
    	System.out.println(Arrays.toString(alphaCount));
    	
        
        return list;
    }
}