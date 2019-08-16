/**
 * @(#)intQuestion700.java
 *
 *
 * @author 
 * @version 1.00 2019/8/16
 *
 * I got the main idea but a dumb mistake cost me time 10 minutes
 */


public class intQuestion700 {

    public static void main (String[] args) 
    {
    	System.out.println();
    }
    
    
    public static TreeNode searchBST(TreeNode root, int val) 
    {
    	if(root == null)
    	{
    		return null;	
    	}
    	
    	if(root.val == val)
    	{
    		return root;
    	}
    	else if(root.val<val)
    	{
    		return searchBST(root.right, val);
    	}
    	else if(root.val>val)
    	{
    		return searchBST(root.left, val);
    	}

        return null;
    }
    
    
}

 class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode(int x) { val = x; }
 }