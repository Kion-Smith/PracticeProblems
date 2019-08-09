/**
 * @(#)intQuestion938.java
 *
 *
 * @author 
 * @version 1.00 2019/8/8
 *
 * This one was harder and required me to look at notes, need to look at bsts again
 */


public class intQuestion938 {

    public static void main (String [] args) 
    {
    	TreeNode temp1 = new TreeNode();
    	System.out.println(rangeSumBST());
    	
    }
    
    public static int rangeSumBST(TreeNode root, int L, int R)
    {
    	    	int sum =0;
    	if(root == null)
    	{
    		return 0;
    	}
    	else
    	{

    		if(root.val >= L && root.val <= R)
    		{
    			sum += root.val;
    		}
            
    		if(root.val > L)
    		{
    			sum += rangeSumBST(root.left,L,R);
    		}
            
    		if(root.val < R)
    		{
    			sum += rangeSumBST(root.right,L,R);
    		}

    	}
    	
    	return sum;
    }
    
}

  class TreeNode 
  {
      int val;
      TreeNode left;
      TreeNode right;
      
      TreeNode(int x) 
      { val = x; }
  }