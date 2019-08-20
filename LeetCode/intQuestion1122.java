/**
 * @(#)intQuestion1122.java
 *
 *
 * @author 
 * @version 1.00 2019/8/20
 *
 * Had to get help was trying to brute force this and didnt work
 */
import java.util.Arrays;
import java.util.*;

public class intQuestion1122 {

    public static void main(String [] args) 
    {
    	int[] a1 = {2,3,1,3,2,4,6,7,9,2,19};
    	int[] a2 = {2,1,4,3,9,6};
    	System.out.println(Arrays.toString(relativeSortArray(a1,a2)));
    }
    
	public static int[] relativeSortArray(int[] arr1, int[] arr2) 
	{
		HashMap<Integer, Integer> map = new HashMap();
		
		int[] ans = new int[arr1.length];
		int start =0;
		int end = arr1.length-1;
		
		for(int i =0;i<arr2.length;i++)
		{
			map.put(arr2[i],0);	
		}

		for(int i=0;i<arr1.length;i++)
		{
			if(map.containsKey(arr1[i]))
			{
				map.put(arr1[i], map.get(arr1[i])+1 );
			}
			else
			{
				ans[end--] = arr1[i];
			}
		}
		
		
		for(int i =0;i<arr2.length;i++)
		{
			int temp = map.get(arr2[i]);
			
			for(int j =0;j<temp;j++)
			{
				ans[start++] = arr2[i];
			}
			
		}
		
		Arrays.sort(ans,start,ans.length);
		
		return ans; 
    }
    
    
}