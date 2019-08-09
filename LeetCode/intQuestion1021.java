/**
 * @(#)intQuestion1021.java
 *
 *
 * @author 
 * @version 1.00 2019/8/9
 *
 * 12 minutes, however not faster than most solutuions because they used string builder
 */


public class intQuestion1021 {

    public static void main (String[] args)
   	{
   		System.out.println("Ans =" + removeOuterParentheses("(()())(())(()(()))"));
    }
    
    public static String removeOuterParentheses(String S)
    {
    	String ans = "";
    	int count =0;
    	for(int i=0;i<S.length();i++)
    	{
    		if(S.charAt(i) == '(' && count == 0)
    		{
    			count++;
    		}
    		else if(S.charAt(i) == '(' && count != 0)
    		{
    			ans += "(";
    			count++;
    		}
    		else if(S.charAt(i) == ')' && count>1)
    		{
    			ans+=")";
    			count--;
    		}
    		else if(count == 1)
    		{
    			count--;
    		}

    	}
    	
    	return ans;
    }
    
}