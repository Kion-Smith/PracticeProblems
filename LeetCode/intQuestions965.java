/**
 * @(#)intQuestions965.java
 *
 *
 * @author 
 * @version 1.00 2019/8/19
 * 14 minutes got stumped for a while
 */


public class intQuestions965 {

    public static void main (String [] args) 
    {
    	
    }
    
    public static boolean isUnivalTree(TreeNode root) 
    {
    	if(root == null)
    	{
    		return true;
    	}
    	
    	if(root.left != null && root.val != root.left.val)
    	{
    		return false;
    	}

    	
    	if(root.right != null && root.val != root.right.val)
    	{
    		return false;
    	}
		
		return isUnivalTree(root.left) && isUnivalTree(root.right);
    	
    	
    	
    
    }
    
    
}

class TreeNode 
{
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}