package toDoTasks;

import java.util.HashSet;
import java.util.Set;

public class CountTheConsistentStrings {

	public int countConsistentStrings(String allowed, String[] words) {
        
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i<allowed.length();i++)
		{
			set.add(allowed.charAt(i));
		}
		int count = words.length;
		for(int j = 0; j<words.length;j++)
		{
			for(int k=0; k<words[j].length();k++)
			{
				if(!set.contains(words[j].charAt(k)))
				{
					count--;
					break;
				}
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		
		CountTheConsistentStrings countstr = new CountTheConsistentStrings();
		String allowed = "ab";
		String[] wrds = {"ad","bd","aaab","baa","badab"};
		System.out.println(countstr.countConsistentStrings(allowed, wrds));
	}
}
