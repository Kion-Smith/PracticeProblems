/**
 * @(#)intQuestion557.java
 *
 *
 * @author 
 * @version 1.00 2019/8/24
 * works
 */ 


public class intQuestion557 {

    public static void main (String [] args) 
    {
    	System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    
    public static String reverseWords(String s) 
    {
    	String ans = "";
    	String revWord ="";
    	String[] temp =  s.split(" ");
    	
    	for(int i=0;i<temp.length;i++)
    	{
    		for(int j = temp[i].length()-1; j >= 0;j--)
    		{
    			revWord += temp[i].charAt(j) +"";
    		}
    		
    		ans += revWord+" ";
    		revWord ="";
    	}
    	
    	if(ans.charAt(ans.length() -1) == ' ')
    	{
    		return ans.substring(0,ans.length()-1);
    	}
    		
        return ans;
    }
    
    
}