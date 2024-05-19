package toDoTasks;

public class LargestValueInMatrix {
	
	public int[][] largestLocal(int[][] grid) {
        
		int len=grid.length;
		int[][] res = new int[len-2][len-2];
		for(int i=0;i<len-2;i++)
		{
			for(int j=0; j<res[i].length;j++)
			{
				res[i][j] = findMax(grid, i, j);
			}
		}
		return res;
    }
	
	public int findMax(int[][] grid,int row,int col)
	{
		int max=0;
		for(int i=row; i<row+3; i++)
		{
			for(int j=col; j<col+3;j++)
			{
				max = Math.max(grid[i][j], max);
			}
		}
		return max;
	}
}
