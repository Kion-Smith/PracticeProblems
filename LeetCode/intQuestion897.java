/**
 * @(#)intQuestion897.java
 *
 *
 * @author 
 * @version 1.00 2019/8/23
 *
 * Got help as well was taking to long
 */


public class intQuestion897 {

    public static void main(String [] args) 
    {
    	System.out.println();
    }
    
    public TreeNode increasingBST(TreeNode root) 
    {
    	return helperIncBST(root,null);
    }
    
    public TreeNode helperIncBST(TreeNode root, TreeNode node)
    {
    	if(root == null)
    	{
    		return node;
    	}
    	
    	//System.out.println(root.val +"<- root,left "+ root.left.val);
    	TreeNode ans = helperIncBST(root.left,root);
    	root.left = null;
    	//System.out.println(node.val +"  <- node, right "+ root.right.val);
    	root.right = helperIncBST(root.right, node);
    		
    	return ans;
    	
    }
    
    
}


class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}