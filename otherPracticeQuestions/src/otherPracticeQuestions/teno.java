/**
 * @(#)teno.java
 *
 *
 * @author 
 * @version 1.00 2019/3/26
 */


public class teno {

    public static void main(String args[]) 
    {
    	System.out.print(ways(11,5));
    }
    
        public static int ways(int total, int k) 
    {
        // Write your code here
        
        int table[] = new int[total+1];
        if(k<0 || k>total)
        {
            return 0;
        }
        else
        {
            table[0] = 1;
            
            for(int i =1;i<=k;i++)
            {
                for(int j = i;j<=total;j++)
                {
                    table[j] += table[j-i];
                }
            }
            
            return table[total];
        }
    

    }
}