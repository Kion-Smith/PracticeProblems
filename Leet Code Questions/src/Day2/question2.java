package Day2;

class ListNode 
{
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

public class question2 
{
	public question2()
	{
		ListNode list1 = new ListNode(2);
		list1.next.val = 4;
		list1.next.val = 3;
		
		ListNode list2 = new ListNode(5);
		list2.next.val = 6;
		list2.next.next.val = 7;
		
		
		addTwoNumbers(list1,list2);
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	{
		ListNode combNode = new ListNode(0);
		int carry =0;
		
		ListNode list1 = l1;
		ListNode list2 = l2;
		ListNode cur = combNode;
		
		while(list1 != null || list2 !=null)
		{
			int val1 = getValue(list1);
			int val2 = getValue(list2);
			
			int sum = carry+val1+val2;
			
			if(sum>9)
			{
				carry = sum/10;
			}
			else
			{
				carry =0;
			}
			
			cur.next = new ListNode(sum%10);
			
			cur = cur.next;
			if(list1 != null)
			{
				list1 = list1.next;
			}
			if(list2 != null)
			{
				list2 = list2.next;
			}
			
		}
		
		if(carry>0)
		{
			cur.next = new ListNode(carry);
		}
		
		return cur;
	}
	
	public int getValue(ListNode l)
	{
		if(l == null)
		{
			return 0;
		}
		else
		{
			return l.val;
		}
	}
}



