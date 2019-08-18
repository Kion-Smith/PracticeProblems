/**
 * @(#)intQuestion590.java
 *
 *
 * @author 
 * @version 1.00 2019/8/18
 *
 *  8 minutes, Still making dumb mistakes but I can understand these tree problems
 */
 import java.util.*;


public class intQuestion590 {

    public static void main(String [] args) 
    {
    	System.out.println();
    }
    
    LinkedList list = new LinkedList();
    
    public List<Integer> postorder(Node root) 
    {
    	
    	
    	if(root == null)
    	{
    		return list;
    	}
    	

    	for(int i =0;i<root.children.size();i++)
    	{
    		postorder(root.children.get(i));
    	}
    	
    	
    	list.add(root.val);
    	
    	
		return list;
    }
    
}


class Node 
{
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}