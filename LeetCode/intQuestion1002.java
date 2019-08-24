/**
 * @(#)intQuestion1002.java
 *
 *
 * @author 
 * @version 1.00 2019/8/22
 *Coudnt solve, didnt read problem correctly
 */
 
import java.util.*;

public class intQuestion1002 {

    public static void main(String [] args) 
    {
    	//String[] m = {"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"};
    	//String[] m = {"cool","lock","cook"};
    	String[] m = {"bella","label","roller"};
    	System.out.println(commonChars(m).toString());
    }
    
    public static List<String> commonChars(String[] A) 
    {
    	/* my answer
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
    		
    		while(alphaCount[i] >= A.length)
    		{
    			list.add( (char)(i+97) +"");
    			alphaCount[i] -= A.length;
    			
    		}
    	}
    	
    	System.out.println(Arrays.toString(alphaCount));
    	
        
        return list;
        */
        
        
        LinkedList<String> list = new LinkedList();
        int[] alphaCount = new int [26];
        
        for(int i =0;i<A[0].length();i++)
        {
        	alphaCount[A[0].charAt(i) - 97]++;
        }
        
        for(int i =1; i<A.length;i++)
        {
        	int[] updatedAlpha = new int[26];
        	
      		for(int j =0;j<A[i].length();j++)
		    {
		   		updatedAlpha[A[i].charAt(j) - 97]++;
		    }
		      
		    for(int k =0;k<26;k++)
		    {
			 	if(updatedAlpha[k] < alphaCount[k])
			    {
			    	alphaCount[k] = updatedAlpha[k];
			    }
		    }
        }
        
        for(int i =0;i<26;i++)
        {
        	for(int j =0;j<alphaCount[i];j++)
        	{
        		list.add( (char)(97+i) +"");
        	}
        }
        
  
        
        return list;
    }
}