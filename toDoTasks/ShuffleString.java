package toDoTasks;

public class ShuffleString {

	 public String restoreString(String s, int[] indices) {
	        
        StringBuilder st = new StringBuilder();
        for(int i =0; i<indices.length; i++)
        {
        	st= st.append(s.charAt(getIndex(indices, i)));
        }

        return st.toString();
    }
	 
	 public static int getIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; 
    }
	 
	public static void main(String[] args) {
		
		ShuffleString s = new ShuffleString();
		String str = "codeleet";
		int[] ind = {4,5,6,7,0,2,1,3};
		String result = s.restoreString(str, ind);
		System.out.println(result);
		
	}
}
