/**
 * @(#)intQuestion8.java
 *
 * This sucks
 *
 * @author 
 * @version 1.00 2019/8/7
 */
import java.math.BigInteger;

public class intQuestion8 {

    public static void main(String [] args) 
    {
    	//myAtoi("42");
    	//myAtoi("-42");
    	//myAtoi("+42");
    	//myAtoi("4193 with words");
    	
    	System.out.println(myAtoi(" 42"));
    	System.out.println(myAtoi(" +0 123"));
    	System.out.println(myAtoi("+42"));
    	System.out.println(myAtoi("4193 with words"));
    	System.out.println(myAtoi("words and 987"));
    	System.out.println(myAtoi("-91283472332"));
    	System.out.println(myAtoi("-3.14"));
    	System.out.println(myAtoi("20000000000000000000")); //
    	System.out.println(myAtoi("  0000000000012345678"));
    	System.out.println(myAtoi("2147483648"));
    	System.out.println(myAtoi(".1"));
    	System.out.println(myAtoi("+"));
    	
    	
    }
    
	public static int myAtoi(String str) 
	{
		boolean isFirstNon = false;
		boolean stopReading = false;
		if(str.isEmpty() )
		{
			return 0;
		}
		String temp ="";
		int ans =0;
		int count=0;
		
		
		
		for(int i=0;i<str.length();i++)
		{
		
			if(str.charAt(i) >= 65 && str.charAt(i) <= 122 && !isFirstNon && !stopReading)
			{	
				return 0;
			}
			else if(str.charAt(i) == '+' || str.charAt(i) == '-' && !stopReading )
			{
				isFirstNon = true;
				temp += str.charAt(i)+"";
				
				
			}
			else if(str.charAt(i) >= '0' && str.charAt(i) <= '9' && !stopReading )
			{
				
				isFirstNon = true;
				temp += str.charAt(i)+"";
				
			}
			else if(str.charAt(i) != ' ' || isFirstNon )
			{
				stopReading = true;
			}
			else 
			{
				return 0;
			}
			
		
			

			
		
			
		}
		

		try
		{
			ans = Integer.parseInt(temp);
			
		}
		catch(Exception e)
		{
			BigInteger num = new BigInteger(temp);
			//System.out.println(num.toString());
			
			if(  num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0)
			{
				return Integer.MIN_VALUE;
			}
			else if( num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) > 0)
			{
				return Integer.MAX_VALUE;
			}

		}
		
    	return ans;  
    }
}