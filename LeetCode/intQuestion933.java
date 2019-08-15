/**
 * @(#)intQuestion933.java
 *
 *
 * @author 
 * @version 1.00 2019/8/15
 *
 * This was worded terribly; took 10 minutes with help
 */ 
 	
import java.util.LinkedList;
import java.util.Queue;

public class intQuestion933 {

    public static void main (String [] args)	
    {
    	//RecentCounter obj = new RecentCounter();
		//int param_1 = obj.ping(t);
    	System.out.println();
    	
    }
    
    
    
}

class RecentCounter {

	Queue<Integer> times;
    public RecentCounter() {
        times = new LinkedList<Integer>();
    }
    
    public int ping(int t) 
    {
    	times.add(t);
    	while(times.peek() > t-3000)
    	{
    		times.poll();
    	}
        return times.size();
    }
}
