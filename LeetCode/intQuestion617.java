/**
 * @(#)intQuestion617.java
 *
 *
 * @author 
 * @version 1.00 2019/8/12
 *  13 minutes and had to look up help
 */


public class intQuestion617 {

    public static void main(String [] args) 
    {
    	System.out.println();
    }
    
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) 
    {
    	if(t1 == null && t2 == null)
	    {
	    	return t1;
        }
        else if(t1 == null && t2 != null)
	    {
	    	return t2;
	    }
	    	if(t1 != null && t2 != null)
	        {
	            t1.val += t2.val;
	         
	            if(t1.left == null && t2.left  != null)
	            {
	                t1.left = t2.left;
	            }
	            else
	            {
	                mergeTrees(t1.left, t2.left);
	            }
	            
	           	if(t1.right == null && t2.right  != null)
	            {
	                t1.right = t2.right;
	            }
	            else
	            {
	                mergeTrees(t1.right, t2.right);
	            }
	            
	            
	        }
    	
        
        return t1;
	            
	        
    	
        
        return t1;
    }
    
}

class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}