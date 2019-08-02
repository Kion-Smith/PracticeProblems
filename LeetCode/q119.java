/* LEETCODE 119
 *
 * 	Pascals Triangle 2
 *
 *	Given a non-negative index k where k = 33, return the kth index row of the Pascal's triangle.
 *	Note that the row index starts from 0.
 * FALIURE
 */
 
 import java.util.*;


public class q1 
{

    public q1() 
   	{
   		
    }
    
    public static void main (String [] args)
    {
    	getRow(13);
    }
    
    public static List<Integer> getRow(int rowIndex) 
    {
    	//I  was wrong...
    	/*
    	int rowNums = ((int) Math.pow(11,rowIndex));
    	System.out.println(rowNums);
    	
    	LinkedList<Integer> row = new LinkedList<Integer>(); 
    	while(rowNums>0)
    	{
 
    		row.add(rowNums%10);
    		
    		
    		rowNums = rowNums/10;
    	}	*/
    	String tempString = "";
    	int top = (int) factorial(rowIndex);
    	LinkedList<Integer> row = new LinkedList<Integer>(); 
    	for(int i =0;i<rowIndex+1;i++)
    	{
    		//row.add((int) (top/(factorial(i)*factorial(rowIndex - i))));
    		tempString += top/(factorial(i)*factorial(rowIndex - i))+"";	
    	}
    	
    	//System.out.println(factorial(13));
    	System.out.println(row.toString());

    	return row;
    }
    
    public static int factorial(int n)
    {
    	if(n == 0)
    	{
    		return 1;
    	}
    	else
    	{
    		return n * factorial(n-1);
    	}		
    }
    
    
}