/**
 * @(#)intQuestion589.java
 *
 *
 * @author 
 * @version 1.00 2019/8/17
 *	8 Minutes, getting better at these recursive tree solving problems however I still made a small mistake that cost me time
 *
 */
 
import java.util.*;

public class intQuestion589 {

    public static void main (String [] args) 
    {
    	//Node root = new Node(1, list);
    	System.out.println(preorder());
    	
    }
    
	public static List<Integer> preorder(Node root) 
	{
		LinkedList<Integer> list = new LinkedList();
		if(root == null)
		{
			return list;
		}

		list.add(root.val);
			
		for(int i =0;i<root.children.size();i++)
		{
			preorder(root.children.get(i));
		}
		
		
	
		

		
		return list;
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
};