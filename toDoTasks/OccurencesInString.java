package toDoTasks;

import java.util.HashMap;
import java.util.Map;

public class OccurencesInString {

	public boolean areOccurrencesEqual(String s) {
        		
		Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        for(int i=0; i<len;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(!entry.getValue().equals(map.get(s.charAt(0)))){
                return false;
            }
        }

        return true;
    }
}
