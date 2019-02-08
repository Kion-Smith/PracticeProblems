
package questions;

import java.io.File;
import java.util.Scanner;

public class q1ch1 
{
    public q1ch1()
    {
       
       try
       {
           File f = new File("C:\\Users\\NeonKion\\Documents\\NetBeansProjects\\Programming Challenges Book\\src\\questions\\in_q1ch1.txt");
           Scanner kb = new Scanner(f); 
           while(kb.hasNextLine())
           {
               String temp = kb.nextLine();
               int[] nums = getRange(temp);
               System.out.println(mainLoop(nums[0],nums[1]));
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       
    }
    public String mainLoop(int low,int high)
    {
        int maxCount  = -1;
        for(int n = low;n<high;n++)
        {
          
            int cur =doCalc(n);
            if(maxCount<cur)
            {
                maxCount = cur;
            }
        }
        return low+" "+high+" "+maxCount;
    }
    
    public int doCalc(int n)
    {
        int count = 0;
        while(n != 1)
        {
            if(n%2== 0)
            {
                n/=2;
            }
            else
            {
                n=3*n+1;
            }
            
            count++;
        }
        
        return count+1;
    }
    public int[] getRange(String s)
    {
        int[] range = {-1,-1};
        String[] tempArray = s.split(" ");
        
        range[0] = Integer.parseInt(tempArray[0]);
        range[1] = Integer.parseInt(tempArray[1]);
        
        return range;
    }
}
