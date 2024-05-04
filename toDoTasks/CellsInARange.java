package toDoTasks;

import java.util.ArrayList;
import java.util.List;

public class CellsInARange {
	
	public List<String> cellsInRange(String s) {
        
        char startcolumn = s.charAt(0);
        char endcolumn = s.charAt(3);
        int startrow = s.charAt(1)-'0';
        int endrow = s.charAt(4)-'0';
        String st = "";
        List<String> str = new ArrayList<>();
        
        for(char ch = startcolumn; ch <= endcolumn; ch++ )
        {
        	startrow = s.charAt(1)-'0';
        	for(int i =startrow; i<=endrow;i++)
        	{
        		int num = startrow++;
            	str.add(st.concat(ch+""+num));
        	}
        }
        
        return str;
    }
	
	public static void main(String[] args) {
		
		CellsInARange cellRange = new CellsInARange();
		String str = "U7:X9";
		System.out.println(cellRange.cellsInRange(str));
	}
}
