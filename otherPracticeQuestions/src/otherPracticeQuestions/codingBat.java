/**
 * @(#)codingBat.java
 *
 *
 * @author 
 * @version 1.00 2019/2/5
 */

public class codingBat {
        
    public static void main(String[] args)
    {
        sleepIn(true,true)
    }
    
    public boolean sleepIn(boolean weekday, boolean vacation) 
	{
  		switch(vacation)
  		{
    		case true:
				return false;
			case false:
      			if(!weekday)
      			{
        			return true;
      			}
    		default:
      			break;
  		}
	}

    
}
