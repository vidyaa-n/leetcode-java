package toDoTasks;

public class DIStringMatch {

	public int[] diStringMatch(String s) {
        
		int[] arr = new int[s.length()+1];
        int len = s.length();
        int n=0;
        int maxLen=s.length();
        for(int i=0; i<= len; i++)
        {
            if(i >= len)
            {
                 if(s.charAt(i-1) == 'D')
                {
                    arr[i]=n;
                    n++;
                }
                else
                {
                    arr[i]=maxLen;
                    maxLen--;
                }     
            }
            else
            {
                if(s.charAt(i) == 'I')
                {
                    arr[i]=n;
                    n++;
                }
                else
                {
                    arr[i]=maxLen;
                    maxLen--;
                }              
            }
              
        }
        return arr;
    }
}
