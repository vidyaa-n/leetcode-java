package toDoTasks;

import java.util.ArrayList;
import java.util.List;


public class FindCommonChars {

	public static List<String> commonChars(String[] words) {
        
        int[] count = new int[26];
        List<String> result = new ArrayList<String>();
        for(int i=0; i<26;i++)
        {
        	count[i]=Integer.MAX_VALUE;
        }
        
        for(String word : words)
        {
	    	int[] charCount = new int[26];
	    	for (char c : word.toCharArray()) {
	            charCount[c - 'a']++;
	        }
        	for(int i=0; i<26;i++)
        	{
        		count[i]= Math.min(count[i], charCount[i]);
        	}
        }
        
        for(int i=0; i<26;i++)
        {
        	while(count[i]>0)
        	{
        		result.add(String.valueOf((char) (i + 'a')));
        		count[i]--;
        	}
        }
        
        return result;
        
    }
	
	public static void main(String[] args) {
		String[] words = {"bella", "label", "roller"};
        List<String> result = commonChars(words);
        System.out.println(result);
	}
}
