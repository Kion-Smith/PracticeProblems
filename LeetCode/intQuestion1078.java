/**
 * @(#)intQuestion1078.java
 *
 *
 * @author 
 * @version 1.00 2019/8/24
 */
import java.util.Arrays;
import java.util.LinkedList;

public class intQuestion1078 {

    public static void main(String args[]) 
    {
    	//System.out.println(findOcurrences("alice is a good girl she is a good student","a","good"));	
    	System.out.println(Arrays.toString(findOcurrences("we will we will rock you","we","will")));
    	
    	//System.out.println(Arrays.toString(findOcurrences("alice is aa good girl she is a good student","a","good")));
    }
    
    public static String[] findOcurrences(String text, String first, String second) 
    {
    	LinkedList<String> list = new LinkedList<String>();
    	String[] wordList= text.split(" ");
    	//int count =0;
    	
    	for(int i =2;i<wordList.length;i++)
    	{
    		/*
    		if(count == 2)
    		{
    			list.add(wordList[i]);
    			count =0;
    		}*/
    		
    		if( wordList[i-2].equals(first)  && wordList[i-1].equals(second) )
    		{
    			list.add(wordList[i]);
    		}
    		

    		

    	}
    	
    	
        String [] ans = new String[list.size()];
        ans = list.toArray(ans);
        
        return ans;
    }
    
    
}