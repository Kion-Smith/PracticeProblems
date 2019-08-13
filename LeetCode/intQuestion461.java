/**
 * @(#)intQuestion461.java
 *
 *
 * @author 
 * @version 1.00 2019/8/13
 * Took to0 long and I was mad ; then saw a soultion that used xor and shifited my answer
 */


public class intQuestion461 {

    public static void main(String [] args) 
    {
    	System.out.println(hammingDistance(0,1));
    }
    public static int hammingDistance(int x, int y) 
    {
    	int count =0;
    	long temp = ((long)x^y);
    	
    	if(temp == 0)
    	{
    		return 0;
    	}
    	else
    	{
    		
    		long hold =0;
    		while(temp>0)
    		{
    			hold = temp%2;
    			if(hold == 1)
    			{
    				count++;	
    			}
				temp/= 2;
    		}
    	}
    
    	return count;
    }
    /*
	public static int hammingDistance(int x, int y) 
	{
		int dif = 0;
		String tempX = toBinary(x);
		String tempY = toBinary(y);
		
		System.out.println(tempX+", "+tempY);
		if(tempX.equals(tempY))
		{
			return 0;
		}
		else if(tempX.length()> tempY.length() || tempX.length() == tempY.length())
		{
			if(tempX.length() == 1 && tempY.length() ==1 && !tempX.equals(tempY))
			{
				return 1;
			}
			
			for(int i =0;i<tempX.length()-1;i++)
			{
				
				if(tempY.length()-1<=i  || tempY.charAt(i) != tempX.charAt(i))
				{
					dif++;
				}

			}
			
			return dif;
		}
		else if(tempY.length() > tempX.length())
		{
			for(int i =0;i<tempY.length()-1;i++)
			{
				
				
				if(tempX.length()-1<=i  || tempY.charAt(i) != tempX.charAt(i))
				{
					
					dif++;
				}

			}
			return dif;
		}

		
        return 0;
    }
    
    public static String toBinary(int z)
    {
    	String ans ="";
    	int temp =0;
    	
    	if(z == 0)
    	{
    		return 0+"";
    	}
    	else if(z == 1)
    	{
    		return z+"";	
    	}
    	
    	while(z>0)
    	{
    		temp = z%2;
    		ans = temp + ans;
			z/= 2;
    	}
    	
    	return ans;
    	
    	
    }*/
    
}