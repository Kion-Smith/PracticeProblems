/**
 * @(#)intQuestion811.java
 *
 *
 * @author 
 * @version 1.00 2019/8/20
 *	
 * again had to find help
 */
 
 import java.util.*;


public class intQuestion811 {

	public static void main(String [] args) 
    {
    	String[] array = {"9001 discuss.leetcode.com"};
    	System.out.println(subdomainVisits(array));
    }
    
    public static List<String> subdomainVisits(String[] cpdomains) 
    {
    	HashMap<String,Integer> domainMap = new HashMap();
    	LinkedList<String> ans = new LinkedList();
    	
    	for(int i =0;i<cpdomains.length;i++)
    	{
    		String[] numDomain = cpdomains[i].split(" ");
    		int number = Integer.parseInt(numDomain[0]);
    		String[] domains  = numDomain[1].split("\\.");
    		
    		String temp ="";
    		for(int j = domains.length-1;j>= 0;j--)
    		{
    			temp = domains[j] + (temp.equals("") ? temp : "."+ temp);
    			
    			if(!domainMap.containsKey(temp))
    			{
    				domainMap.put(temp,number);
    			}
    			else
    			{
    				domainMap.put(temp, domainMap.get(temp) + number);
    			}
    		}
    		
    			
    	
    	}
    	
    	for(String str : domainMap.keySet())
    	{
        	ans.add(domainMap.get(str) + " " + str);
        }
    		
    	
    	
        return ans;
    }
    
}