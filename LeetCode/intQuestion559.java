/**
 * @(#)intQuestion559.java
 *
 *
 * @author 
 * @version 1.00 2019/8/21
 *
 * Done in 5 minutes
 */
 
 
import java.util.*;

public class intQuestion559 {

    public static void main (String [] args) 
    {
    	System.out.println();
    }
    
    
    public static int maxDepth(Node root) 
    {
    	int max =0;
    	if(root == null)
    	{
    		return 0;
    	}
       	
       	int temp =0;
       	for(int i =0;i<root.children.size();i++)
       	{
			max = Math.max(max,maxDepth(root.children.get(i)));
       	}
       	
       	return max +1;
    }
    
    
}

class Node 
{
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) 
    {
        val = _val;
        children = _children;
    }
}