/**
 * @(#)intQuestion804.java
 *
 *
 * @author 
 * @version 1.00 2019/8/9
 *
 *	17 minutes; less time actually devloping there was a typo in the question and I spent 3-5 minutes trying to understand
 */
import java.util.HashSet;

public class intQuestion804 {

    public static void main (String[] args)
   	{
   		String[] temp = {"gin", "zen", "gig", "msg"};
   		System.out.println("Ans =" + uniqueMorseRepresentations(temp));
    }
    
	public static int uniqueMorseRepresentations(String[] words) 
	{
		HashSet<String> morsePerms = new HashSet();
		for(int i =0;i<words.length;i++)
		{
			morsePerms.add(convertToMorse(words[i]));
		}
		
		
       return morsePerms.size(); 
    }
    
    public static String convertToMorse(String s)
    {
    	String[] alpha = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	String morse ="";
    	for(int i =0;i<s.length();i++)
    	{
    		morse += alpha[s.charAt(i) -97];
    	}
    	
    	return morse;	
    }
    
    
}