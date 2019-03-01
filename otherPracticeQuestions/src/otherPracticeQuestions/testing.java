/**
 * @(#)testing.java
 *
 *
 * @author 
 * @version 1.00 2019/2/23
 */

public class testing {
        
    /**
     * Creates a new instance of <code>testing</code>.
     */
    public testing() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    int tempTimer = 0;
    String input = ".100";
    	String filename = "";
      // if(input.contains(",") )
	//	{
		//	filename =input.substring(0,input.indexOf(","));
			//tempTimer = Integer.parseInt(input.substring(input.indexOf(",")+1));
	//	}
		
		System.out.println(filename+","+Integer.parseInt(input.substring(input.indexOf(".")+1)));
    }
}
