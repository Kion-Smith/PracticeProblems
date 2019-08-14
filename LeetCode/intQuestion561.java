/**
 * @(#)intQuestion561.java
 *
 *
 * @author 
 * @version 1.00 2019/8/14
 *	7 mins I made assumptions abbout the question not really sure how it worked
 */
 
 import java.util.Arrays;


public class intQuestion561 {

	public static void main(String [] args) 
    {
    	int[] arrays = {1,4,3,2};
    	System.out.println(arrayPairSum(arrays));
    	
    }
    
	public static int arrayPairSum(int[] nums) 
	{
		int ans = 0;
		int hold =0;
		int count =0;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		for(int i =0;i<nums.length;i++)
		{
			if(count == 1)
			{
				ans += Math.min(hold,nums[i]);
				count =0;	
			}
			else
			{
				hold = nums[i];
				count++;	
			}
		}
		
        return ans;
    }
    
    
}