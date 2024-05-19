package toDoTasks;

import java.util.Arrays;

public class WidestVerticalArea {

	public static int maxWidthOfVerticalArea() {
        
		int[][] points = { {8, 7}, {9, 9}, {7, 4}, {9, 7} };
        int len = points.length;
        int[] res = new int[len];
        int max=0;
        for(int i=0; i<len;i++)
        {
            res[i]= points[i][0];
        }
        Arrays.sort(res);
        for(int j=0; j<len-1;j++)
        {
            max= Math.max((res[j+1] - res[j]),max);
        }
        return max;
    }
	
	public static void main(String[] args) {
		maxWidthOfVerticalArea();
	}
}
