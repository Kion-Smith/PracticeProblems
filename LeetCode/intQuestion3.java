/**
 * @(#)intQuestion3.java
 *
 *
 * @author 
 * @version 1.00 2019/8/5
 */

import java.util.HashSet;
//import java.util.ArrayList;

public class intQuestion3 {

    public static void main(String [] args) 
    {
    	System.out.println(lengthOfLongestSubstring("pwwkew"));
    	System.out.println(lengthOfLongestSubstring("abcabcbb"));
    	System.out.println(lengthOfLongestSubstring("bbbbb"));
    	System.out.println(lengthOfLongestSubstring(" "));
    	System.out.println(lengthOfLongestSubstring("au"));
    	System.out.println(lengthOfLongestSubstring("dvdf"));


    }
    
    
    public static int lengthOfLongestSubstring(String s)
    {
    	//String prev = ""; change to a hash map
    	//HashMap<Character,Integer> prevTable = new HashMap<Character,Integer>();
   
    	/* This was the intial solution which was wrong; I wanted to the above before
    	String tempString ="";
    	String longString ="";
    	
    	for(int i =0;i<s.length();i++)
    	{
    		if(tempString.contains(s.charAt(i)+""))
    		{
    			if(tempString.length() > longString.length())
    			{
    				longString = tempString;
    				tempString = "";
    				tempString +=s.charAt(i);
    				i =2;
    			}
    			
    			
    		}
    		else
    		{
    			tempString +=s.charAt(i);
    		}
    		

    		//System.out.println(s.charAt(i));
    	}
   		System.out.println(longString);
    	if(tempString.length() > longString.length())
    	{
    		return tempString.length();
    	}
    	else if(!s.isEmpty() && longString.equals(""))
    	{
    		return 1;
    	}

    	
        return longString.length();*/
        
        
        if(s.isEmpty())
        {
        	return 0;
        }
        else	
        {
        	HashSet<Character> prev = new HashSet<Character>();
        	int j =0;
        	int longest =0;
        	for(int i=0;i<s.length();i++)
        	{
        		while(prev.contains(s.charAt(i)))
        		{
        			System.out.println(prev.toString() +" "+ s.charAt(j)+" "+j +" "+ s.charAt(i)+" "+i);
        			prev.remove(s.charAt(j));
        			j++;
        		}
        		
        		prev.add(s.charAt(i));
        		
        		if(longest<prev.size())
        		{
        			longest = prev.size();
        				
        		}
        		
        	}
        		
        	return longest;
        }
        
        
    }
    
}