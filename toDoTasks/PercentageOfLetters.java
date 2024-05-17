package toDoTasks;

import java.util.HashMap;
import java.util.Map;

public class PercentageOfLetters {

	 public static int percentageLetter(String s, char letter) {
	        
		 Map<Character, Integer> frequencyMap = new HashMap<>();
	
        // Iterate through the string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int index = frequencyMap.get(letter);  
        int len = s.length();  
        if(index != 0)
        {
            return (int) (((double)index / len) * 100);
        }
        else
        {
            return index;
        }
    }
	 
	public static void main(String[] args) {
		int res = percentageLetter("foobar",'o');
		System.out.println(res);
	}
}
