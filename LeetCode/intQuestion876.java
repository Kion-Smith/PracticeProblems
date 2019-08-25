/**
 * @(#)intQuestion876.java
 *
 *
 * @author 
 * @version 1.00 2019/8/25
 *
 * Took 8 minutes, intially thought I was wrong but I wasnt took me time checking cases
 */
 
 
import java.util.*;

public class intQuestion876 {

    public static void main(String [] args) 
    {
    	System.out.println();
    }
    
    public static ListNode middleNode(ListNode head) 
    {
    	ArrayList<ListNode> list = new ArrayList();
    	if(head == null)
    	{
    		return head;
    	}
    	
    	while(head != null)
    	{
			list.add(head);
			head = head.next;	
    	}
    	
  		return list.get(list.size()/2);
        
    }
    
}



class ListNode 
{
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
     
 }