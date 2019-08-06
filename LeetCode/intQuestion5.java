/**
 * @(#)intQuestion5.java
 *
 *
 * @author 
 * @version 1.00 2019/8/5
  Dynamic programing I dont know how to do it but my approch is correct */
 
 import java.util.HashSet;
 import java.lang.StringBuilder;


public class intQuestion5 {

    public static void main (String[] args) 
    {
    	//longestPalindrome("");
    	System.out.println(longestPalindrome("babad"));
    }
    
    public static String longestPalindrome(String s) 
    {
    	  	StringBuilder sb = new StringBuilder();
       HashSet<String> perms = new HashSet();
        String maxPal = "";
        String temp = "";
        
        for(int i =0;i<s.length();i++)
        {
        	for(int j = i;j<s.length()+1;j++)
        	{
        		temp = s.substring(i,j);
        		perms.add(temp);
        		/*
        		//System.out.println(temp);
        		//sb.append(temp);
        		//sb = sb.reverse();
        
        		if(temp.equals(sb.toString()) && temp.length() > maxPal.length())
        		{
        			maxPal = temp;
        		}
        		
        		sb.setLength(0);
        		*/
        	}
        		
        }
        
      for(String rev: perms)
        {
        
        	if(maxPal.length() > rev.length())
        	{
        		continue;
        	}
     		else
     		{
     			sb.append(rev);
	        	sb = sb.reverse();
     		}
     		
        	if(rev.equals(sb.toString()) && rev.length() > maxPal.length())
        	{
        		maxPal = rev;
        	}
        		
        	sb.setLength(0);
        }
        return maxPal;
    }
    
    
}