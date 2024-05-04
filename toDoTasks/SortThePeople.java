package toDoTasks;

public class SortThePeople {
	
	public String[] sortPeople(String[] names, int[] heights) {
	   		
		int size = heights.length;
	    
	    for (int i = 0; i < size - 1; i++)	// bubble sort
	    { 
	    	for (int j = 0; j < size - i - 1; j++)
	    	{
	    		if (heights[j] < heights[j + 1]) 
	    		{	    			
			          int temp = heights[j];
			          String nametemp = names[j];
			          heights[j] = heights[j + 1];
			          names[j] = names[j + 1];
			          names[j + 1] = nametemp;
			          heights[j + 1] = temp;
		        }
	    	}                                                                                 
	    }
	    	 
		return names;
	}
	
	public static void main(String[] args) {
		
		SortThePeople sort = new SortThePeople();
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		System.out.println(sort.sortPeople(names, heights));
	}
}
