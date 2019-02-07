package otherPracticeQuestions;

import java.util.Arrays;

public class pracMain 
{
	public static void main(String[] args)
	{
		System.out.println( sleepIn(true, false) );
		int[] myArray = {1,1,4};
		System.out.println( scoresIncreasing(myArray));
		char[] cArray = {'h','e','l','l','o'};
		reverseString(cArray);
		//reverseString
		String[] arys = new String[3];
		System.out.println( numJewelsInStones("ebd","bbb"));
		System.out.println( numUniqueEmails(arys));
		
	}
	
	//way too easy
	public static boolean sleepIn(boolean weekday, boolean vacation) 
	{
	  if(vacation)
	  {
		  return true;
	  }
	  else if (weekday)
	  {
		 return false;
	  }
	  else
	  {
		  return true;
	  }
	}
	
	
	public static boolean scoresIncreasing(int[] scores) 
	{
		for(int i =0;i<scores.length;i++)
		{
			if(i != 0 && scores[i]<scores[i-1] )
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void reverseString(char[] s) 
	{
        for(int i =0;i<s.length/2;i++)
        {
        	char temp = s[i];
        	s[i] = s[s.length- i-1];
        	s[s.length- i-1] = temp;
        }

       // for 
        System.out.println(Arrays.toString(s));
    }
	
	 public static int numJewelsInStones(String J, String S) 
	 {
		 int count = 0;
		 for(int i =0;i<S.length();i++)
		 {
			 if(J.contains(S.charAt(i)+""))
			 {
				 count++;
			 }
		 }
		 	
	     return count; 
	 }
	 ///////noy//not done
	   public static int numUniqueEmails(String[] emails) 
	   {
		   /*
		   String temp = "testemail@leetcode.com";
		   String hold = temp.substring(0,temp.indexOf("@"));
		   hold = temp.replaceAll("([\\.])", hold);
		   hold = temp.
		   System.out.println( hold);
	        return 0;*/
	   }

}
