/**
 * @(#)intQuestion929.java
 *
 *
 * @author 
 * @version 1.00 2019/8/15
 * 13 minutes, faster than 72% and less memory than 94%
 */
import java.util.HashSet;

public class intQuestion929 {

    public static void main (String [] args)	
    {
    	String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    	System.out.println(numUniqueEmails(emails));
    	
    }
    
	public static int numUniqueEmails(String[] emails)
	{
		HashSet<String> hash = new HashSet();
		
		for(int i =0;i<emails.length;i++)
		{
			hash.add(getTrueEmails(emails[i]));
		}
	
		return hash.size(); 
    }
    
    public static String getTrueEmails(String mail)
    {
    	String local = mail.substring(0,mail.indexOf("@"));
    	String domain = mail.substring(mail.indexOf("@")+1,mail.length());
    	
    	if(local.contains("+"))
    	{
    		local = local.substring(0,local.indexOf("+"));
    	}
    	
    	if(local.contains("."))
    	{
    		local = local.replace(".","");
    	}
    	
    	return local+"@"+domain;
    }
    
    
}