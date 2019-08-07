/**
 * @(#)intQuestion7.java
 *
 *
 * @author 
 * @version 1.00 2019/8/6
 *I could optimize but im too lazy
 */


public class intQuestion7 {

    public static void main(String[] args) 
    {
    	System.out.println(reverse(1534236469));
    }
    
    public static int reverse(int x)
    {
    	String temp = "";
    	int digit =0;
    	int rest = 0;
    	boolean isNegative = false;
    	
    	int num =0;
    	
    	//System.out.println((int) 1534236469 +","+ (int)Math.pow(10,9));
    	if(x<0)
    	{
    		isNegative = true;
    		x = Math.abs(x);
    	}
    	else if(x<10)
    	{
    		return x;
    	}
    	
    	int place = String.valueOf(x).length()-1;
    	
    	while(x > 0)
    	{
    		digit = x%10;
    		x = x/10;
    		
    		if( ((long)num+ (long)digit*((long) Math.pow(10,place))) < Integer.MAX_VALUE)
    		{
    			
    			num += digit*((int) Math.pow(10,place));
    			place--;
    		}
    		else
    		{
    			return 0;
    		}
 
    	
    		//temp += digit +"";
    		
    		
    	}
    	
    	
    	
    	//int ans = Integer.parseInt(num);
    	
    	if(isNegative)
    	{
    		num *= -1;
    	}
    	
    	return num;
    	/*
    	boolean isNegative = false;
    	String newX = x+"";
    	if(x<10)
    	{
    		return x;
    	}
   		else if(newX.length() == 3 && newX.charAt(0) != '-') // I could use this for lengths of 2 or 3's with negatives but I got lazy
   		{
   			String hold = newX.charAt(0)+"";
   			newX = newX.substring(2)+newX.charAt(1)+"";
   			newX +=hold;
   			System.out.println(newX);
   		}
   		else
   		{
   			
   			if(newX.charAt(0) == '-')
   			{
   				newX = newX.substring(1);
   				isNegative = true;
   			}
   			
   			String hold ="";
   			for(int i = newX.length()-1;i>=0;i--)
   			{
   				hold = hold + newX.charAt(i)+"" ;
   			}
   			
   			
   			newX = hold;
   		}
   		
   		try
   		{
   			if(isNegative)
   			{
   				return Integer.parseInt(newX);
   			}
   			else
   			{
   				return Integer.parseInt(newX)*-1;
   			}
   			
   		}
   		catch(Exception e)
   		{
   			
   		}
   		
    	return 0;
    	*/
    }
    
}