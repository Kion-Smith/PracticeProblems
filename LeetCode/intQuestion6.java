/**
 * @(#)intQuestion6.java
 *
 *
 * @author 
 * @version 1.00 2019/8/6
 *
 *SOLVED, SLOW this was very brute force
 */
import java.util.Arrays;

public class intQuestion6 {

    public static void main(String [] args) 
    {
    	System.out.println(convert("PAYPALISHIRING", 4));
    	
    }
    
   	public static String convert(String s, int numRows) 
   	{
     	if(s.isEmpty() || numRows == 1)
     	{
     		return s;
     	}
		
		String[][] table = new String[numRows][(s.length()/2)+1];
		//System.out.println(test.toString());
     	
     	int col =0;
     	int tempCol = numRows -2;
     	int row =0;
     	//int colCount = numRows -2;
     	for(int i =0;i<s.length();i++)
     	{
			if(col < numRows)
			{
				table[col][row] = s.charAt(i)+"";
				col++; 
			}
			else if(col >= numRows && tempCol>0 )
			{
				row++;
				table[tempCol][row] = s.charAt(i)+"";
				tempCol--;	
			}
			else if(tempCol == 0)
			{
				
				col =0;
				tempCol = numRows-2;
				
				row++;
				table[col][row] = s.charAt(i)+"";
				col++;
				
				
			}
		
     	}
     	String ans ="";
     	for(int i=0;i<numRows;i++)
     	{
     		for(int j = 0;j<(s.length()/2)+1;j++)
     		{
     			if(table[i][j] != null)
     				ans += table[i][j];
     		}
     	}
        
        return ans;//Arrays.deepToString(table).replace("[","").replace("]","").replace("null","").replace(",","").replace(" ","");
    }
    
    
}