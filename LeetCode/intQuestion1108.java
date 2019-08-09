/**
 * @(#)intQuestion1108.java
 *
 *
 * @author 
 * @version 1.00 2019/8/8
 *
 *Quick and easy and works
 */


public class intQuestion1108 {

    public static void main (String [] args) 
    {
    	System.out.println(defangIPaddr("1.1.1.1"));
    	System.out.println(defangIPaddr("255.100.50.0"));
    	//
    }
    
    public static String defangIPaddr(String address)
    {
    	String ans = "";
    	for(int i =0;i<address.length();i++)
    	{
    		if(address.charAt(i)== '.' && i > 0)
    		{
    			ans += "[.]";
    		}
    		else
    		{
    			ans += address.charAt(i)+"";
    		}
    	}
    	
    	return ans;	
    }
    
}