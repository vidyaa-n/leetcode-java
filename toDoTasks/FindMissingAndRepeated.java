package toDoTasks;

import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeated {

	public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int[] res = new int[2];
        int len = grid.length;
        Set<Integer> val = new HashSet<>();
        for(int i=0; i<len;i++)
        {
        	for(int j=0; j<len;j++)
        	{
        		if(!val.add(grid[i][j]))
        		{
        			res[0]=grid[i][j];
        		}
        	}
        }
        
        for(int j =1; j<val.size();j++)
        {
        	if(!val.contains(j))
        		res[1]=j;
        }
        return res;
		
    }
}
