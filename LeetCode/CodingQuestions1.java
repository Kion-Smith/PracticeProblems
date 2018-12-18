//Done on 2/16/2018 by Kion Smith
public class CodingQuestions1 {
	
	//Coding questions from various diffrent websites
    public static void main (String [] args) 
    {
    	question1();
    }
    
    //Question 1 Ranked:: Easy
    /*
     *Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 *You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 *Example:
	 *Given nums = [2, 7, 11, 15], target = 9,
	 *Because nums[0] + nums[1] = 2 + 7 = 9,
	 *return [0, 1].
     */
    public static void question1()
    {
    	int[] a = {2,5,5,11};
    	int t = 10;
    	
    	twoSum(a,t);
    }
    
   /*Appreantly my solution was brute force, the fast way is using a hash map*/
   	/* Orginal plan
   		for(int i =0;i<nums.length;i++)
   		{
   			
   			if(!(i+1 > nums.length))
   			{
   				for(int j=i+1;j<nums.length;j++)
   				{
 					System.out.println("Case Failed"+nums[i]+","+nums[j]);
   					if(nums[i]>target || nums[j]>target)
   					{
   						
   						break;
   					}
   					else
   					{
   						if(nums[i]+nums[j] == target)
   						{
   							newArray[0] = i;
   							newArray[1] = j;
   							System.out.print(newArray[0]+","+newArray[1]);
   							return newArray;
   						}
   					}	
   				}
   			}
   		}*/
   	public static int[] twoSum(int[] nums,int target)
   	{	
   		int newArray[] = new int[2];
   	
	   		for(int i=1;i<nums.length;i++)
	   		{
	   			for(int j =0;j<nums.length;j++)
	   			{
   					if(nums[i]+nums[j] == target && i !=j)
   					{
   						newArray[0] = j;
   						newArray[1] = i;
   						return newArray;
   					}
	   			}
	   		}
   		

   		return newArray;
   	}
    
    
}