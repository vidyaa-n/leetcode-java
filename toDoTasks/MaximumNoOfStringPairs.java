package toDoTasks;

import java.util.HashSet;
import java.util.Set;

public class MaximumNoOfStringPairs {

	public int maximumNumberOfStringPairs(String[] words) {
    
		int count =0;
		for(int i =0; i<words.length-1; i++)
		{
			for(int j=i+1; j<words.length; j++)
			{
				Set s = new HashSet();
				s.add(words[i].charAt(0));
				s.add(words[i].charAt(1));
				if(s.size() == 2)
				{
					if(words[i].charAt(0) == words[j].charAt(1) || words[i].charAt(0) == words[j].charAt(0))
					{
						if(words[i].charAt(1) == words[j].charAt(1) || words[i].charAt(1) == words[j].charAt(0))
						{
							count++;
						}
					}
				}				
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		
		MaximumNoOfStringPairs max = new MaximumNoOfStringPairs();
		String[] s = {"aa","ab"};
		System.out.println(max.maximumNumberOfStringPairs(s));
	}
}
