package toDoTasks;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public static int longestPalindrome(String s) {
        
        Map<Character,Integer> smap = new HashMap<>();
        int len = s.length();
        int count =0;
        for(int i=0;i<len;i++)
        {
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
        }
        boolean isFirstOdd = false;
        for(Map.Entry<Character,Integer> mapElement : smap.entrySet())
        {
        	int charCount = mapElement.getValue();
        	if(charCount%2 == 0)
        	{
        		count+=charCount;
        	}
        	else {
        		count += charCount;
                if (!isFirstOdd) {
                    isFirstOdd = true;
                } else {
                    count -= 1;
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("bananas"));
	}
}
